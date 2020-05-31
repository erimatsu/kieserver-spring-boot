package com.company.model;

import lombok.Data;

@Data
public class 注文 {

    private String 注文ID;
    private String 顧客ID;
    private String 商品ID;
    private int 注文数量;
    private String 加工種別;

    private boolean 注文可否 = true;
    private String コメント;
    
}