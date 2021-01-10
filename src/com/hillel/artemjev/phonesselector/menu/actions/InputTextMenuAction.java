package com.hillel.artemjev.phonesselector.menu.actions;

import com.hillel.artemjev.phonesselector.menu.MenuAction;
import com.hillel.artemjev.phonesselector.service.PhonesSelectorService;

import java.util.Scanner;

public class InputTextMenuAction implements MenuAction {
    private PhonesSelectorService phonesSelectorService;
    private Scanner sc;

    public InputTextMenuAction(PhonesSelectorService phonesSelectorService, Scanner sc) {
        this.phonesSelectorService = phonesSelectorService;
        this.sc = sc;
    }

    @Override
    public void doAction() {
        System.out.println("\nВведите текст:");
        String text = sc.nextLine();
        phonesSelectorService.setText(text);
    }

    @Override
    public String getName() {
        return "Ввести текст";
    }

}
