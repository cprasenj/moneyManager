package com.moneyManager;

import java.util.HashMap;
import java.util.Map;

public class MoneyManager{

    private double initialCash = 0;
    private Map<String, Double> expenseJournal = new HashMap<String, Double>();

    public MoneyManager(int initialCash) {
        this.initialCash = initialCash;
    }

    public double getCashInHand() {
        return this.initialCash;
    }

    public void registerExpense(String expenseAccount, double amount) {
        this.expenseJournal.put(expenseAccount,amount);
        this.initialCash-=amount;
    }

}