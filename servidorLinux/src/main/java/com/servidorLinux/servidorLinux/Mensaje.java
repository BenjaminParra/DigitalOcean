package com.servidorLinux.servidorLinux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mensaje {
    @GetMapping("/mensaje")
    public String HelloWorld(){
        return "Aplicación web simple";
    }

    
}

