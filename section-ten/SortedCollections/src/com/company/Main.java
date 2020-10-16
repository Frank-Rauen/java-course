package com.company;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 1.29, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 15.15, 28);
        stockList.addStock(temp);

        temp = new StockItem("Beer", 10.15, 200);
        stockList.addStock(temp);

        temp = new StockItem("Paper Towels", 3.75, 2000);
        stockList.addStock(temp);

        temp = new StockItem("Candy", 5.50, 400);
        stockList.addStock(temp);

        temp = new StockItem("Lint Roller", 8.00, 5);
        stockList.addStock(temp);

        temp = new StockItem("Toy", 15.15, 2);
        stockList.addStock(temp);

        temp = new StockItem("Milk", 3.14, 200);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s : stockList.Items().keySet()) {
            System.out.println(s);
        }
    }
}
