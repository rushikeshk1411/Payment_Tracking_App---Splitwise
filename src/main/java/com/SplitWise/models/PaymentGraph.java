package com.SplitWise.models;

import java.util.Map;

public class PaymentGraph {
    Map<String, BalanceMap> graph;

    public PaymentGraph(Map<String, BalanceMap> graph){
        this.graph = graph;
    }

    public Map<String, BalanceMap> getGraph() {
        return graph;
    }
}
