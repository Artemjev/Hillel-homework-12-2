package com.hillel.artemjev.phonesselector.service;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;


public class InMemoryPhonesSelectorService implements PhonesSelectorService {
    private String text;

    public InMemoryPhonesSelectorService() {
        text = "";
    }

    public InMemoryPhonesSelectorService(String text) {
        this.text = text;
    }

    @Override
    public Set<String> getPhoneNumbers() {
        String regexToSplit = "[\\s,.!?;()\"-]+";
        String regexPhoneNumber = "(?:\\+380|380|80|0)?(\\d{9})";

        return Arrays.stream(text.split(regexToSplit))
                .filter(s -> s.matches(regexPhoneNumber))
                .map(s -> s.replaceFirst(regexPhoneNumber, "+380$1"))
                .collect(Collectors.toSet());
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
