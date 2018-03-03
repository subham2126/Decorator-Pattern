package com.algorithm;

public class Main {

    public static void main(String[] args) {

        OFFERS offers = new OFF200(new OFF500(new GET40PERCENTOFF(2900)));
        System.out.println(offers.getDescription());
        System.out.println(offers.getDiscountedSum());
        offers = new OFF200(new GET50PERCENTOFF(2000));
        System.out.println(offers.getDiscountedSum());
        System.out.println(offers.getDescription());


    }
}
