package models;

import base.Fiscal;
import base.Income;

public class Product implements Income, Fiscal {

    private String name;
    private int quantity;
    private double price;

    public final double TAX = 0.05;

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getTotalIncome() {
        double totalIncome = quantity * price;
        return totalIncome;
    }

    @Override
    public double getTax() {
        double tax = getTotalIncome() * TAX;
        return tax;
    }

    @Override
    public double getNetIncome() {
        double netIncome = getTotalIncome() - getTax();
        return netIncome;
    }
}
