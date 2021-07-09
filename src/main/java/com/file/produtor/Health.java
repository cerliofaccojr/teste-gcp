package com.file.produtor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("health")
public class Health {

    @GetMapping(value="")
    public String sendMessage(){
        return "Ok";
    }
}
