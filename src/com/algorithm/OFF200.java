package com.algorithm;

public class OFF200 extends COUPONS {


    OFFERS offers;

    OFF200(OFFERS offers){
        this.offers = offers;
    }
    public int getDiscountedSum() {
        if(offers.getDiscountedSum()>=1000)
            return offers.getDiscountedSum()-200;
        else
            return offers.getDiscountedSum();

    }

    @Override
    public String getDescription() {
        if(offers.getDiscountedSum()>=1000)
            return offers.getDescription()+" ADDED 200 OFF";
        return offers.getDescription() + "UNABLE TO REDEEM COUPON OFF200";
    }
}
