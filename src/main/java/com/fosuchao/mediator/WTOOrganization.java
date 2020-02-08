package com.fosuchao.mediator;

public class WTOOrganization {

    public static void trade(Country master, Country guest) {
        System.out.println(master.getPrestige() + master.getName() +
                "与" + guest.getPrestige() + guest.getName() + "进行贸易");
    }
}
