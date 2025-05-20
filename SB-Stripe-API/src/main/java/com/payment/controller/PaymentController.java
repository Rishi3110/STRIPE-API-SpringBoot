package com.payment.controller;

import com.payment.model.PaymentRequest;
import com.payment.service.StripeService;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PaymentController {

    @Autowired
    private StripeService stripeService;

    @Value("${stripe.public.key}")
    private String stripePublicKey;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("stripePublicKey", stripePublicKey);
        return "index";
    }

    @PostMapping("/charge")
    @ResponseBody
    public String charge(@RequestBody PaymentRequest paymentRequest) {
        try {
            Charge charge = stripeService.charge(paymentRequest);
            return "Payment successful! Charge ID: " + charge.getId();
        } catch (StripeException e) {
            return "Payment failed: " + e.getMessage();
        }
    }
} 