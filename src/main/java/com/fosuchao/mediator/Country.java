package com.fosuchao.mediator;

public class Country  {
    private String name;
    private String prestige;

    public Country(String name, String prestige) {
        this.name = name;
        this.prestige = prestige;
    }

    public String getName() {
        return name;
    }

    public String getPrestige() {
        return prestige;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", prestige='" + prestige + '\'' +
                '}';
    }

    public void trade(Country country) {
        WTOOrganization.trade(this, country);
    }
}
