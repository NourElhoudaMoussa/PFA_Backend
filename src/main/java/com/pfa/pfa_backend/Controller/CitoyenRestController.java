package com.pfa.pfa_backend.Controller;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Citoyen")
@RequiredArgsConstructor
public class CitoyenRestController {
    @GetMapping()
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("hi Citoyen");
    }
}
