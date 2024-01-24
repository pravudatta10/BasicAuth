package com.security.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sbi")
public class BankController {

    @GetMapping("/home")
    public String home() {
        return "Welcome to the Bank Application!";
    }

    @GetMapping("/account")
    public String getAccountDetails() {
        return "Account details retrieved successfully!";
    }

    @GetMapping("/transaction")
    public String performTransaction() {
        return "Transaction completed successfully!";
    }
    @GetMapping("/customer")
    public String getCustomerDetails() {
        return "Customer details retrieved successfully!";
    }

    @GetMapping("/loan")
    public String applyForLoan() {
        return "Loan application submitted successfully!";
    }
}