package com.solidprinciples.baddemo;

public abstract class SellHouses {

    String area;
    int numberOfFloors;
    String facing;
    int flatNo;
    int floorNo;
    int totalAreaInSquareFeet;
    int perSquareFeetCost;
    int AmenitiesCost;
    int totalCost;
    int paymentDoneByCustomer;
    int loanAmount;
    String paymentType;

    public int calculateTotalCost(int perSquareFeetCost, int totalAreaInSquareFeet, int AmenitiesCost){
        return totalCost = (perSquareFeetCost*totalAreaInSquareFeet) + AmenitiesCost ;
    }

    abstract public int paymentFromCustomer(String paymentType, int paymentDoneByCustomer);

    abstract public void applyLoan(String paymentType);

    abstract public void  legalAndVerification(String paymentType);

    abstract public void paymentFromBank(String paymentType,int loanAmount);


    void registration(String area, int floorNo, int flatNo) {
        System.out.println("Registration is completed for flatNo - "+flatNo+" of floor - "+floorNo+" in area - "+area);
    }


}
