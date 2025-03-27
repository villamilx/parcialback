package eci.edu.cvd.parcialback.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import eci.edu.cvd.parcialback.model.Item;
import eci.edu.cvd.parcialback.model.payment;
import eci.edu.cvd.parcialback.mongoconnection.paymentrepository;

@Service public class PaymentService {

    @Autowired private paymentrepository paymentRepository;
    
    public payment processPayment(payment paymentRequest) {
        if (paymentRequest.getItems() == null || paymentRequest.getItems().isEmpty()) { 
            throw new RuntimeException("Debe proporcionar al menos un item en la transacción"); } 
            
            double calculatedTotal = 0.0; for (Item item : paymentRequest.getItems()) {
                calculatedTotal += item.getUnitPrice() * item.getQuantity(); } 
                
            if (Double.compare(calculatedTotal, paymentRequest.getTotalAmount()) != 0) {
                paymentRequest.setStatus("DECLINED");
                paymentRequest.setErrorMessage("El total de la transacción no coincide con la suma de los items");
                paymentRepository.save(paymentRequest);
                throw new RuntimeException("El total de la transacción no coincide con la suma de los items"); }
                
                paymentRequest.setStatus("APPROVED");
                
                return paymentRepository.save(paymentRequest); 
            }
    
        public List<payment> getPaymentsByUser(String userId) {
            return paymentRepository.findByUserId(userId); 
            } 
    
    }