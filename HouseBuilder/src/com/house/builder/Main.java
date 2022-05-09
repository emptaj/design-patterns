package com.house.builder;

public class Main {
    public static void main(String[] args) {
        PrimaryHouseBuilder primaryHouseBuilder = new PrimaryHouseBuilder();
        MediumHouseBuilder mediumHouseBuilder = new MediumHouseBuilder();
        PremiumHouseBuilder premiumHouseBuilder = new PremiumHouseBuilder();

        HouseBuilderDirector houseBuilderDirector = new HouseBuilderDirector(primaryHouseBuilder);
        House h1 = houseBuilderDirector.construct("domek");

        houseBuilderDirector.setBuilder(mediumHouseBuilder);
        House h2 = houseBuilderDirector.construct("dom");

        houseBuilderDirector.setBuilder(premiumHouseBuilder);
        House h3 = houseBuilderDirector.construct("willa");


        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}
