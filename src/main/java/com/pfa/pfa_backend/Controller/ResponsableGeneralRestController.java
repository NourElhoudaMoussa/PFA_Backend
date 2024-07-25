package com.pfa.pfa_backend.Controller;

import com.pfa.pfa_backend.Entity.Citoyen;
import com.pfa.pfa_backend.Entity.ResponsableGeneral;
import com.pfa.pfa_backend.Repository.ResponsableGeneralRepository;
import com.pfa.pfa_backend.dto.SignUpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/ResponsableGeneral")
public class ResponsableGeneralRestController {
    ResponsableGeneralRepository rgr;

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hi ResponsableGeneral");
    }

    @GetMapping("/getAllResponsableGeneral")
    public List<ResponsableGeneral> getAllResponsableGeneral() {
        return rgr.findAll();
    }

    @PostMapping("/saveResponsableGeneral")
    public ResponseEntity<ResponsableGeneral> saveResponsableGeneral(@RequestBody ResponsableGeneral responsableGeneral) {
        return ResponseEntity.ok(rgr.save(responsableGeneral));
    }

}