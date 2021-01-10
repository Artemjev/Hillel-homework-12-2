package com.hillel.artemjev.phonesselector.service;

import java.util.Set;


public interface PhonesSelectorService {
    Set<String> getPhoneNumbers();

    String getText();

    void setText(String text);
}
