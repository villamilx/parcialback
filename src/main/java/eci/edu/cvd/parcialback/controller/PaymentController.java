package eci.edu.cvd.parcialback.controller;

import eci.edu.cvd.parcialback.model.*;
import eci.edu.cvd.parcialback.servicios.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<?> createPayment(@RequestBody payment paymentRequest) {
        try {
            payment processedPayment = paymentService.processPayment(paymentRequest);
            return ResponseEntity.ok(processedPayment);
        } catch (RuntimeException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }
    
    @GetMapping
    public ResponseEntity<?> getPayments(@RequestParam("userId") String userId) {
        List<payment> payments = paymentService.getPaymentsByUser(userId);
        return ResponseEntity.ok(payments);
    }
}

