package eci.edu.cvd.parcialback.servicios;

import eci.edu.cvd.parcialback.model.product;
import eci.edu.cvd.parcialback.mongoconnection.productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private productrepository productRepository;

    public product createProduct(product productRequest) {
        return productRepository.save(productRequest);
    }

    public product updateProduct(String id, product productDetails) {
        product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con id: " + id));
        existingProduct.setName(productDetails.getName());
        existingProduct.setUnitPrice(productDetails.getUnitPrice());
        return productRepository.save(existingProduct);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    public List<product> getAllProducts() {
        return productRepository.findAll();
    }
    
}
