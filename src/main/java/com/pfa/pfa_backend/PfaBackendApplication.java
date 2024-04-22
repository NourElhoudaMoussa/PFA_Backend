package com.pfa.pfa_backend;

import com.pfa.pfa_backend.Entity.Municipal;
import com.pfa.pfa_backend.Entity.ResponsableGeneral;
import com.pfa.pfa_backend.Entity.User;
import com.pfa.pfa_backend.Repository.MunicipalRepository;
import com.pfa.pfa_backend.Repository.ResponsableGeneralRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PfaBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PfaBackendApplication.class, args);
        System.out.println("run successfully");
    }
    @Bean
    CommandLineRunner start(MunicipalRepository mr, ResponsableGeneralRepository rgr) {
        return args -> {
            Municipal m1 = new Municipal("تونس","المرسى"," شارع الحرية قصر السعادة بلدية المرسى ","71775010","71743406");
            Municipal m2 = new Municipal("تونس","قرطاج","نهج صوفونبة حنبعل","71731460","71731972");
            Municipal m3 = new Municipal("سوسة","مساكن","شارع الجمهورية 4070 مساكن ","73259016","73259116");

            ResponsableGeneral rg1 = new ResponsableGeneral("12846030","موسى","نور",new Date(98, 12, 5),"سوسة","أنثى","37 نهج البشير صفر 4070 مساكن","25728023","moussanouralhouda@gmail.com","12345",m3);

            mr.save(m1);
            mr.save(m2);
            mr.save(m3);
            rgr.save(rg1);
            mr.findAll().forEach(m -> System.out.println(m));
            rgr.findAll().forEach(rg -> System.out.println(rg));
        };
    }

}
