package it.develhope.Services.Logging2.controllers;

import it.develhope.Services.Logging2.services.NumService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @Autowired
    NumService numService;

    @GetMapping("/")
    public void getWelcomeAndLog(){
        logger.info("This is a welcome message");
    }

    @GetMapping("/exp")
    public int getExponentValue(){
        logger.info("Starting calculation");
        int result = numService.getExponent();
        logger.info(("Ending calculation"));
        return result;
    }


    @GetMapping("/get-errors")
    public void getError(){
        Error error = new Error("That was an error");
        logger.error("Here is an error: " + error);
    }


}
