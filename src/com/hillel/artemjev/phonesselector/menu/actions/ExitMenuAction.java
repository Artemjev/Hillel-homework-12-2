package com.hillel.artemjev.phonesselector.menu.actions;

import com.hillel.artemjev.phonesselector.menu.MenuAction;


public class ExitMenuAction implements MenuAction {

    @Override
    public void doAction() {
        System.out.println("\nВсего хорошего)");
    }

    @Override
    public String getName() {
        return "Выход";
    }

    @Override
    public boolean closeAfter() {
        return true;
    }
}
