package com.company;

import java.util.Map;

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
        temp = new StockItem("Candy", 5.25, 300);
        stockList.addStock(temp);

        temp = new StockItem("Lint Roller", 8.00, 5);
        stockList.addStock(temp);

        temp = new StockItem("Toy", 15.15, 2);
        stockList.addStock(temp);

        temp = new StockItem("Milk", 3.14, 200);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket frankBasket = new Basket("Frank");

        sellItem(frankBasket, "Milk", 1);
        System.out.println(frankBasket);

        sellItem(frankBasket, "Candy", 5);
        System.out.println(frankBasket);

        sellItem(frankBasket, "Milk", 7);
        sellItem(frankBasket, "Cigs", 20);
//        System.out.println(frankBasket);

//        System.out.println(stockList);

        Basket basket = new Basket("Customer");
        sellItem(basket, "Milk", 10);
        sellItem(basket, "Lint Roller", 1);
        sellItem(basket, "Toy", 1);

        System.out.println(basket);

        removeItem(basket,"Milk", 5);

        System.out.println(stockList);

        checkout(basket);



//        temp = new StockItem("Pen", 2.12);
//        stockList.Items().put(temp.getName(), temp);

        stockList.Items().get("Bread").adjustStock(15000);
        stockList.Items().get("Bread").adjustStock(-15099);
        System.out.println(stockList);

        for(Map.Entry<String, Double> price: stockList.priceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }
    }
    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("Item not available.");
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("Item not available.");
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity) {

            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkout(Basket basket) {
        for(Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }

}
