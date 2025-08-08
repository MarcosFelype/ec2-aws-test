package com.estagio.ec2.aws.controller;

import com.estagio.ec2.aws.model.MessageBuild;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Controller {

    @GetMapping(value = "see-api-say")
    public ResponseEntity<MessageBuild> seeApiSay(@RequestParam("text") @Valid String text) {
        MessageBuild messageBuild = new MessageBuild(text);
        return ResponseEntity.status(HttpStatus.OK).body(messageBuild);
    }

    @GetMapping(value = "hello")
    public ResponseEntity<String> Hello(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello World :D");
    }
}
