package com.algorithm;

public class GET40PERCENTOFF extends OFFERS {

    GET40PERCENTOFF(int totalSum){
        this.totalSum = totalSum;
        description = "40 % OFF ";
    }
    @Override
    public int getDiscountedSum() {
        return (int)(this.totalSum * 0.4);
    }
}
