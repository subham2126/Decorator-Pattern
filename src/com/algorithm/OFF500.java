package com.algorithm;

public class OFF500 extends COUPONS {


    OFFERS offers;
    String description;

    OFF500(OFFERS offers){
        this.offers = offers;
    }
    public int getDiscountedSum() {
        if(offers.getDiscountedSum()>=1500) {
            return offers.getDiscountedSum() - 500;

        }
        else
            return offers.getDiscountedSum();

    }

    @Override
    public String getDescription() {
        if(offers.getDiscountedSum()>=1500)
            return offers.getDescription()+" ADDED 500 OFF";
        return offers.getDescription() + "UNABLE TO REDEEM COUPON OFF500";
    }
}
