package com.hillel.artemjev.phonesselector.menu;

public interface MenuAction {

    String getName();

    void doAction();

    default boolean closeAfter() {
        return false;
    }
}
