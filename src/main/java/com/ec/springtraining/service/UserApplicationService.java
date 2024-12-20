package com.ec.springtraining.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

@Service
public class UserApplicationService {

    @Autowired
    private MessageSource messageSource;

    public Map<String, Integer> getGenderMap() {
        Map<String, Integer> genderMap = new LinkedHashMap<>();
        String male = messageSource.getMessage("male", null, Locale.JAPAN);
        String female = messageSource.getMessage("female", null, Locale.JAPAN);
        genderMap.put(male, 1);
        genderMap.put(female, 2);
        return genderMap;
    }

}
