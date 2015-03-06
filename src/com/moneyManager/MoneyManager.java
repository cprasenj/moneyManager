package com.moneyManager;

public class MoneyManager{

    private int initialCash = 0;

    public MoneyManager(int initialCash) {
        this.initialCash = initialCash;
    }

    public int getStartingCash() {
        return this.initialCash;
    }
}