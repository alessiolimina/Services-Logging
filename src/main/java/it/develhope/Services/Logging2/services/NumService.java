package it.develhope.Services.Logging2.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class NumService {

    Logger logger = LoggerFactory.getLogger(NumService.class);

    @Autowired
    Environment environment;

    @Value("${envVar.n1}")
    private int n1;

    @Value("${envVar.n2}")
    private int n2;

    public int getExponent(){
        return (int) Math.pow(n1,n2);
    }

}
