package com.solidprinciples.gooddemo;

public class SellTwoBedroomFlatWithCash extends SellHousesWithCash{

    int totalCost;
    public SellTwoBedroomFlatWithCash(String area, int numberOfFloors, String facing)
    {
        this.area = area;
        this.numberOfFloors = numberOfFloors;
        this.facing = facing;
    }

    @Override
    int calculateTotalCost(int perSquareFeetCost, int totalAreaInSquareFeet, int AmenitiesCost) {
        return totalCost = (perSquareFeetCost*totalAreaInSquareFeet) + AmenitiesCost ;
    }

    @Override
    public void paymentFromCustomer(int paymentDoneByCustomer) {
        System.out.println("Payment from customer of rupees " + paymentDoneByCustomer);
    }

    @Override
    void registration(String area, int floorNo, int flatNo) {
        System.out.println("Registration is completed for flatNo - "+flatNo+" of floor - "+floorNo+" in area - "+area);
    }
}
