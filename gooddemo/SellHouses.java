package com.solidprinciples.gooddemo;

abstract public class SellHouses
{
    String area;
    int numberOfFloors;
    String facing;
    int flatNo;
    int floorNo;
    int totalAreaInSquareFeet;
    int perSquareFeetCost;
    int AmenitiesCost;

    abstract int calculateTotalCost(int perSquareFeetCost, int totalAreaInSquareFeet, int AmenitiesCost);
    abstract void registration(String area, int floorNo, int flatN);
}
