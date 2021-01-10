package com.hillel.artemjev.phonesselector;

import com.hillel.artemjev.phonesselector.menu.Menu;
import com.hillel.artemjev.phonesselector.menu.actions.*;
import com.hillel.artemjev.phonesselector.service.InMemoryPhonesSelectorService;
import com.hillel.artemjev.phonesselector.service.PhonesSelectorService;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhonesSelectorService phonesSelectorService = new InMemoryPhonesSelectorService(
                "123121, 0507777777 0501111111 низвестно чей номер +38050222222 +3050333333 +380507777777");

        Menu menu = new Menu(sc);
        menu.addAction(new ShowTextMenuAction(phonesSelectorService));
        menu.addAction(new InputTextMenuAction(phonesSelectorService, sc));
        menu.addAction(new ShowPhoneNumbersMenuAction(phonesSelectorService));
        menu.addAction(new ExitMenuAction());
        menu.run();
    }
}
