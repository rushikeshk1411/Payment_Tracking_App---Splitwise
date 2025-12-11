package com.SplitWise.models;

import java.util.Map;

public class Expense {
    BalanceMap userBalances;
    String userId;
    String name;
    String desc;
    String date;
    String groupId;

    public Expense(BalanceMap userExepense, String name, String desc, String date){
        this.userBalances = userExepense;
        this.name = name;
        this.desc = desc;
        this.date = date;
    }

    public BalanceMap getUserBalances(){
        return userBalances;
    }

    public String getGroupId(){
        return groupId;
    }
}
