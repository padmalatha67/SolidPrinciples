package com.solidprinciples.baddemo;

public class BoughtFlat {
    public static void main(String[] args) {
        int totalCostToBuyFlat;
        int paymentDoneByCustomer;
        String paymentType;
        String area;

        //Created first object with Payment Type == Loan
        SellTwoBHK sellTwoBHKObj = new SellTwoBHK("Sample Area",5,"Facing","loan");
        paymentType = sellTwoBHKObj.getPaymentType();
        area = sellTwoBHKObj.getArea();
        totalCostToBuyFlat = sellTwoBHKObj.calculateTotalCost(3500,1000,300000);
        System.out.println("Total cost to buy the flat "+totalCostToBuyFlat);
        paymentDoneByCustomer = sellTwoBHKObj.paymentFromCustomer(paymentType,200000);
        System.out.println("Payment Done By Customer "+paymentDoneByCustomer);
        sellTwoBHKObj.applyLoan(paymentType);
        sellTwoBHKObj.legalAndVerification(paymentType);
        sellTwoBHKObj.paymentFromBank(paymentType,totalCostToBuyFlat);
        sellTwoBHKObj.registration(area, 5,506);


        //Created second object with Payment Type == Cash
        System.out.println("================================================================");
        SellTwoBHK sellTwoBHKCashObj = new SellTwoBHK("Other Sample Area",10,"Facing","cash");
        paymentType = sellTwoBHKCashObj.getPaymentType();
        area = sellTwoBHKObj.getArea();
        totalCostToBuyFlat = sellTwoBHKCashObj.calculateTotalCost(5000,1700,500000);
        System.out.println("Total cost to buy the flat "+totalCostToBuyFlat);
        paymentDoneByCustomer = sellTwoBHKCashObj.paymentFromCustomer(paymentType,200000);
        System.out.println("Payment Done By Customer "+paymentDoneByCustomer);
        if(paymentType == "loan") {
            sellTwoBHKCashObj.applyLoan(paymentType);
            sellTwoBHKCashObj.legalAndVerification(paymentType);
            sellTwoBHKCashObj.paymentFromBank(paymentType, totalCostToBuyFlat);
        }
        sellTwoBHKCashObj.registration(area, 3, 303);
        System.out.println("================================================================");

    }
}
