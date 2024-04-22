package com.pfa.pfa_backend.Controller;

import com.pfa.pfa_backend.Entity.Municipal;
import com.pfa.pfa_backend.Repository.MunicipalRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MunicipalRestController {
    MunicipalRepository mr;
    @GetMapping("/getAllMunicipals")
    public List<Municipal> getAllMunicipals(){
        return mr.findAll();
    }
}
