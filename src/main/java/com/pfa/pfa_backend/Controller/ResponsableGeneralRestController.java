package com.pfa.pfa_backend.Controller;

import com.pfa.pfa_backend.Entity.ResponsableGeneral;
import com.pfa.pfa_backend.Repository.ResponsableGeneralRepository;
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
public class ResponsableGeneralRestController {
    ResponsableGeneralRepository rgr;
    @GetMapping("/getAllResponsableGeneral")
    public List<ResponsableGeneral> getAllResponsableGeneral(){
        return rgr.findAll();
    }
}
