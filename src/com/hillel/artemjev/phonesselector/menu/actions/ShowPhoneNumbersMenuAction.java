package com.hillel.artemjev.phonesselector.menu.actions;

import com.hillel.artemjev.phonesselector.menu.MenuAction;
import com.hillel.artemjev.phonesselector.service.PhonesSelectorService;


public class ShowPhoneNumbersMenuAction implements MenuAction {
    private PhonesSelectorService phonesSelectorService;

    public ShowPhoneNumbersMenuAction(PhonesSelectorService phonesSelectorService) {
        this.phonesSelectorService = phonesSelectorService;
    }

    @Override
    public String getName() {
        return "Выбор телефонных номеров из имеющегося текста";
    }

    @Override
    public void doAction() {
        System.out.println("\nТекст содержит следующие телефонные номера:");
        phonesSelectorService.getPhoneNumbers().forEach(System.out::println);
    }
}
