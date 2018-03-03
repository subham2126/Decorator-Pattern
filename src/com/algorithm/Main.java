package com.algorithm;

public class Main {

     public static class CustomThread extends Thread {
         int totalSum;
         CustomThread(int totalSum){
             this.totalSum =totalSum;

         }

         @Override
           public void run(){
              System.out.println("FC");
             COUPONFACTORY couponfactory = new COUPONFACTORY(new GET40PERCENTOFF(totalSum));
             OFFERS offers = couponfactory.getBestCoupon();
             System.out.println(offers.getDescription());
             System.out.println(offers.getDiscountedSum());

             System.out.println("FC2");

         }

     }

    public static void main(String[] args) {

        OFFERS offers = new OFF200(new OFF500(new GET40PERCENTOFF(2900)));

//        System.out.println(offers.getDescription());
//        System.out.println(offers.getDiscountedSum());
//        offers = new OFF200(new GET50PERCENTOFF(2000));
//        System.out.println(offers.getDiscountedSum());
//        System.out.println(offers.getDescription());
        CustomThread ct = new CustomThread();

        CustomThread ct2 = new CustomThread();
        ct.start();
        ct2.start();






    }
}

/*
Description :

1. Store can provide two kind of discounts
    a) 40% off on all
    b) 50% off on all
2. Discount is based on season
3. Store has multiple coupons, eg OFF200, OFF500
4.Each coupon has limited number of quantities
5.Each coupon is applicable if and only if sum after discount is greater than some value
6. In case coupons of higher discount is not available, apply some coupon of lower value if present.

 */