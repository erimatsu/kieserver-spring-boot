package com.company.model;

import lombok.Data;

@Data
public class 注文者 {

    private String 顧客ID;
    private String 顧客種別;
    private int 注文上限;
}