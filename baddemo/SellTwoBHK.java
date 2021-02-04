package com.solidprinciples.baddemo;

public class SellTwoBHK extends SellHouses {

    String paymentType;


    public String getArea() {
        return area;
    }


    public void setArea(String area) {
        this.area = area;
    }

    String area;

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public SellTwoBHK(String area, int numberOfFloors, String facing, String paymentType){
        this.area = area;
        this.numberOfFloors = numberOfFloors;
        this.facing = facing;
        this.paymentType = paymentType;
    }

    @Override
    public int paymentFromCustomer(String paymentType, int paymentDoneByCustomer) {
        return paymentDoneByCustomer;
    }

    @Override
    public void paymentFromBank(String paymentType, int loanAmount) {
        if(paymentType == "loan"){
            System.out.println("Payment from bank for rupees"+loanAmount);
        }
    }

    @Override
    public void legalAndVerification(String paymentType) {
        if(paymentType == "loan")
        {
            System.out.println("Legal and Verification is completed");
        }
    }

    @Override
    public void applyLoan(String paymentType) {
        if(paymentType == "loan")
        {
            paymentDoneByCustomer = (int) (totalCost*0.5);
            loanAmount = totalCost - paymentDoneByCustomer;
            System.out.println("loan applied for amount "+loanAmount);
        }

    }
}
