package com.cloud.infrastructure.common.utils.pagination;

import lombok.Data;

@Data
public class Condition {
    private String columnName;
    private String operator;
    private Object operandA;
    private Object operandB;
}
