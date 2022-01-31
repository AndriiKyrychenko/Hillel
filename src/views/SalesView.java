package views;

import models.Product;
import utils.Validator;

import java.util.Scanner;

public class SalesView {

    public String title;
    private String name;
    private int quantity;
    private double price;

    Scanner scanner;

    Product model;

    public SalesView(Product model) {
        this.model = model;
    }

    Validator validator = new Validator();

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        System.out.println(title);
        name = validator.validateName(scanner);
        model.setName(name);

        title = "Введите количество: ";
        System.out.println(title);
        quantity = validator.validateQuantityInput(scanner);
        model.setQuantity(quantity);

        title = "Введите цену: ";
        System.out.println(title);
        price = validator.validatePriceInput(scanner);
        model.setPrice(price);

        scanner.close();
    }

    public void getOutput(String output) {

        System.out.println(output);
    }
}
