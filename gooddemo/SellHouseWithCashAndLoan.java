package com.solidprinciples.gooddemo;

public abstract class SellHouseWithCashAndLoan extends  SellHouses implements  PayWithCash,PayWithLoan,Flooring{


    public int getFlooringCost() {
        return flooringCost;
    }

    public void setFlooringCost(int flooringCost) {
        this.flooringCost = flooringCost;
    }

    int flooringCost;

    abstract void legalAndVerification();
    abstract void applyLoan();

}
