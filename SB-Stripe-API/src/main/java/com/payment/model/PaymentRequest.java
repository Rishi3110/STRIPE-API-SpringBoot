package com.payment.model;

import lombok.Data;

@Data
public class PaymentRequest {
    private String token;
    private String currency;
    private Long amount;
    private String description;
    private String email;
} 