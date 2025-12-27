package com.example.orders.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ORDERS")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String itemName;

    private Integer quantity;

    public OrderEntity() {}

    public OrderEntity(String itemName, Integer quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public Long getId() { return id; }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
}
