package com.solidprinciples.gooddemo;

public class SellThreeBedroomFlatWithCashAndLoan extends SellHouseWithCashAndLoan {

    int totalCost;
    int loanAmount;
    int paymentDoneByCustomer;


    @Override
    public int CustomizedFlooringCost(int flooringCost) {
        return flooringCost;
    }

    @Override
    int calculateTotalCost(int perSquareFeetCost, int totalAreaInSquareFeet, int AmenitiesCost) {
        return totalCost = (perSquareFeetCost*totalAreaInSquareFeet) + AmenitiesCost + getFlooringCost() ;
    }

    @Override
    void legalAndVerification() {
        System.out.println("Legal and Verification is completed");
    }


    @Override
    void applyLoan() {
        paymentDoneByCustomer = (int) (totalCost*0.5);
        loanAmount = totalCost - paymentDoneByCustomer;
        System.out.println("loan appiled for amount "+loanAmount);

    }

    @Override
    public void paymentFromCustomer(int paymentDoneByCustomer) {
        System.out.println("Payment done by customer of rupees"+paymentDoneByCustomer);
    }

    @Override
    public void paymentFromBank() {
        System.out.println("Payment done by bank for rupees "+loanAmount);

    }

    @Override
    void registration(String area, int floorNo, int flatNo) {
        System.out.println("Registration is completed for flatNo -"+flatNo+" of floor - "+floorNo+" in area - "+area);
    }


}
