package com.SplitWise.models;

import java.util.Map;

public class BalanceMap {
    private final Map<String, Amount> userBalances;

    public BalanceMap(Map<String, Amount> userBalances){
        this.userBalances = userBalances;
    }

    public Map<String, Amount> getUserBalances(){
        return userBalances;
    }

}
