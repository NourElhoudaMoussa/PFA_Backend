package com.pfa.pfa_backend.Service.impl;

import com.pfa.pfa_backend.Entity.Citoyen;
import com.pfa.pfa_backend.Entity.Role;
import com.pfa.pfa_backend.Entity.User;
import com.pfa.pfa_backend.Repository.UserRepository;
import com.pfa.pfa_backend.Service.AuthenticationService;
import com.pfa.pfa_backend.Service.JWTService;
import com.pfa.pfa_backend.dto.JwtAuthenticationResponse;
import com.pfa.pfa_backend.dto.RefreshTokenRequest;
import com.pfa.pfa_backend.dto.SignUpRequest;
import com.pfa.pfa_backend.dto.SigninRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JWTService jwtService;

    //inscription du citoyen
    public Citoyen signup(SignUpRequest signUpRequest){
        Citoyen citoyen = new Citoyen();
        citoyen.setCin(signUpRequest.getCin());
        citoyen.setPrenom(signUpRequest.getPrenom());
        citoyen.setNom(signUpRequest.getNom());
        citoyen.setDn(signUpRequest.getDn());
        citoyen.setLn(signUpRequest.getLn());
        citoyen.setAdr(signUpRequest.getAdr());
        citoyen.setNumTel(signUpRequest.getNumTel());
        citoyen.setMdp(passwordEncoder.encode(signUpRequest.getMdp()));
        citoyen.setRole(Role.Citoyen);

        return userRepository.save(citoyen);


    }
    //authentification avc un email et mot de passe
    public JwtAuthenticationResponse signin(SigninRequest signinRequest){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(signinRequest.getEmail(),
                signinRequest.getPassword()));
        var user=userRepository.findByEmail(signinRequest.getEmail()).orElseThrow(()->new IllegalArgumentException("Invalid email or password"));
        var jwt=jwtService.generateToken(user);
        var refreshToken=jwtService.generateRefreshToken(new HashMap<>(),user);

        JwtAuthenticationResponse jwtAuthenticationResponse=new JwtAuthenticationResponse();
        jwtAuthenticationResponse.setToken(jwt);
        jwtAuthenticationResponse.setRefreshToken(refreshToken);
        return jwtAuthenticationResponse;
    }
    public JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest){
        String userEmail=jwtService.extractUserName(refreshTokenRequest.getToken());
        User user =userRepository.findByEmail(userEmail).orElseThrow();
        if(jwtService.isTokenValid(refreshTokenRequest.getToken(),user)){
            var jwt=jwtService.generateToken(user);
            JwtAuthenticationResponse jwtAuthenticationResponse=new JwtAuthenticationResponse();

            jwtAuthenticationResponse.setToken(jwt);
            jwtAuthenticationResponse.setRefreshToken(refreshTokenRequest.getToken());
            return jwtAuthenticationResponse;
        }
        return null;
    }
}
