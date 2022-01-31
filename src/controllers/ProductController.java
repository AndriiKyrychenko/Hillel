package controllers;

import models.Product;
import views.SalesView;
import utils.Rounder;

public class ProductController {

    Product model;
    SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String name = model.getName();

        double totalIncome = model.getTotalIncome();
        double tax = model.getTax();
        double netIncome = model.getNetIncome();

        String totalIncomeRound = Rounder.getRound(totalIncome);
        String taxRound = Rounder.getRound(tax);
        String netIncomeRound = Rounder.getRound(netIncome);

        String output = "Наименование товара: " + name + "\nОбщий доход (грн.): " + totalIncomeRound + "\nСумма налога (грн.): " + taxRound + "\nЧистый доход (грн.): " + netIncomeRound;

        view.getOutput(output);
    }
}
