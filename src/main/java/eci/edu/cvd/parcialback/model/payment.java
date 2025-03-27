package eci.edu.cvd.parcialback.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document
public class payment {
    @Id
    private String id;
    private String userId;
    private String date;
    private List<Item> items;
    private Double totalAmount;
    private String status;
    private String errorMessage;

    public payment() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getuserId(){
        return userId;
    }

    public void setuserId(String userId){
        this.userId = userId;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Double gettotalAmount(){
        return totalAmount;
    }

    public void settotalAmount(Double totalAmount){
        this.totalAmount = totalAmount;
    }

    public String getstatus(){
        return status;
    }

    public void setstatus(){
        this.status = status;
    }

    public String geterrorMessage(){
        return errorMessage;
    }

    public void seterrorMessage(String errorMessage){
        this.errorMessage = errorMessage;
    }
}
