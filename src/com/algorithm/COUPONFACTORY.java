package com.algorithm;

public class COUPONFACTORY {
    OFFERS offers;
    static int OFF500 = 1;
    static int OFF200 = 2;
    COUPONFACTORY(OFFERS offers){
        this.offers = offers;

    }
    public OFFERS getBestCoupon() {
        if(offers.getDiscountedSum() >= 1500) {
            synchronized (COUPONFACTORY.class) {
                if (OFF500 > 0) {

                    OFF500--;

                    return new OFF500(offers);
                }
            }
        }
        if (offers.getDiscountedSum() >= 1000) {
            synchronized (COUPONFACTORY.class) {
                if (OFF200 > 0) {
                    OFF200--;
                    return new OFF200(offers);
                }
            }
        }

        return offers;


    }
}
