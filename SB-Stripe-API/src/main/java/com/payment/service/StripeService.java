package com.payment.service;

import com.payment.model.PaymentRequest;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StripeService {

    @Value("${stripe.api.key}")
    private String stripeApiKey;

    public Charge charge(PaymentRequest paymentRequest) throws StripeException {
        Stripe.apiKey = stripeApiKey;

        Map<String, Object> chargeParams = new HashMap<>();
        chargeParams.put("amount", paymentRequest.getAmount());
        chargeParams.put("currency", paymentRequest.getCurrency());
        chargeParams.put("description", paymentRequest.getDescription());
        chargeParams.put("source", paymentRequest.getToken());

        return Charge.create(chargeParams);
    }

    public Customer createCustomer(String email, String token) throws StripeException {
        Stripe.apiKey = stripeApiKey;

        Map<String, Object> customerParams = new HashMap<>();
        customerParams.put("email", email);
        customerParams.put("source", token);

        return Customer.create(customerParams);
    }
} 