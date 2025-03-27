package eci.edu.cvd.parcialback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class product {
    @Id
    private String id;
    private String name;
    private Double unitPrice;

    public product() {}

    public product(String name, Double price) {
        this.name = name;
        this.unitPrice = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double price) {
        this.unitPrice = price;
    }

}
