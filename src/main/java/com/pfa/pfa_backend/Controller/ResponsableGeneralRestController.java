package com.pfa.pfa_backend.Controller;

import com.pfa.pfa_backend.Entity.ResponsableGeneral;
import com.pfa.pfa_backend.Repository.ResponsableGeneralRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;




@RequiredArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/ResponsableGeneral")
@CrossOrigin("*")
public class ResponsableGeneralRestController {
    ResponsableGeneralRepository rgr;
    @GetMapping()
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("hi ResponsableGeneral");
    }
    @GetMapping("/getAllResponsableGeneral")
    public List<ResponsableGeneral> getAllResponsableGeneral(){
        return rgr.findAll();
    }


}
