package com.cloud.infrastructure.common.utils.pagination;

public enum Operator {
    EqualTo("=", "="),
    Like("LIKE", "LIKE"),
    Between("BETWEEN", "BETWEEN"),
    LessThan("<", "<"),
    MoreThan(">", ">");

    private String value;
    private String label;

    Operator(String value, String label) {
        this.value = value;
        this.label = label;
    }

    public static void main(String[] args){
        System.out.println(Operator.EqualTo);
    }
}
