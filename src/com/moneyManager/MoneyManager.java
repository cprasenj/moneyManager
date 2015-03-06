package com.moneyManager;

import java.util.HashMap;
import java.util.Map;

public class MoneyManager{

    private double initialCash = 0;
    public Map<String, Double> expenseJournal = new HashMap<String, Double>();
    public MoneyManager(int initialCash) {
        this.initialCash = initialCash;
    }

    public double getCashInHand() {
        return this.initialCash;
    }

    public void registerExpensen(String expenseAccount, double amount) {
        this.expenseJournal.put(expenseAccount,amount);
        this.initialCash-=amount;
    }
}