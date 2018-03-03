package com.algorithm;

public class GET50PERCENTOFF extends OFFERS {

    GET50PERCENTOFF(int totalSum){
        this.totalSum = totalSum;
        description = "50 % OFF ";
    }
    @Override
    public int getDiscountedSum() {
        return (int)(this.totalSum * 0.5);
    }
}
