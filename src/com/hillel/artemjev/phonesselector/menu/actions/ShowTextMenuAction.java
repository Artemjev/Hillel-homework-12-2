package com.hillel.artemjev.phonesselector.menu.actions;


import com.hillel.artemjev.phonesselector.menu.MenuAction;
import com.hillel.artemjev.phonesselector.service.PhonesSelectorService;

public class ShowTextMenuAction implements MenuAction {
    private PhonesSelectorService phonesSelectorService;

    public ShowTextMenuAction(PhonesSelectorService contactsService) {
        this.phonesSelectorService = contactsService;
    }

    @Override
    public void doAction() {
        System.out.println("\nИмеющийся текст:");
        System.out.println(phonesSelectorService.getText());
    }

    @Override
    public String getName() {
        return "Показать текущий текст";
    }
}
