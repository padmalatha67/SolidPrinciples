package com.solidprinciples.gooddemo;

public class BoughtTwoFlats {
    public static void main(String[] args) {
        int totalCost;
        int flooringCost;

        //Created a object reference of super type and bought TwoBHKFlat with cash option
        SellHousesWithCash sellTwoBhkObj = new SellTwoBedroomFlatWithCash("Area",5,"facing");
        totalCost = sellTwoBhkObj.calculateTotalCost(3500,1000,200000);
        System.out.println("Total Cost to buy the Flat "+totalCost);
        sellTwoBhkObj.paymentFromCustomer(totalCost);
        sellTwoBhkObj.registration(sellTwoBhkObj.area,5,506);

        //Bought a  ThreeBHKFlat with cash  and loan option
        System.out.println("================================================================");
        SellHouseWithCashAndLoan sellThreeBhkObj = new SellThreeBedroomFlatWithCashAndLoan();
        flooringCost = sellThreeBhkObj.CustomizedFlooringCost(100);
        sellThreeBhkObj.setFlooringCost(flooringCost);
        totalCost = sellThreeBhkObj.calculateTotalCost(5000,1700,500000);
        System.out.println("Total Cost to buy the Flat "+totalCost);
        sellThreeBhkObj.paymentFromCustomer(200000);
        sellThreeBhkObj.applyLoan();
        sellThreeBhkObj.legalAndVerification();
        sellThreeBhkObj.paymentFromBank();
        sellThreeBhkObj.registration("Sample Area",3,303);
        System.out.println("================================================================");

    }
}
