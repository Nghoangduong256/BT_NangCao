package com.vti.BaiTapMap;


import com.vti.BaiTapMap.Status;
import com.vti.BaiTapMap.User;
import com.vti.BaiTapMap.Product;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private int orderId;
    private User user;
    private Product product;
    private int totalPrice;
    private Status status;
    private LocalDate orderDate;

    public Order(int orderId, User user, Product product, int totalPrice, Status status, LocalDate orderDate) {
        this.orderId = orderId;
        this.user = user;
        this.product = product;
        this.totalPrice = totalPrice;
        this.status = status;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", user=" + user +
                ", product=" + product +
                ", totalPrice=" + totalPrice +
                ", status=" + status +
                ", orderDate=" + orderDate +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Order)) {
            return false;
        }

        Order order = (Order) obj;

        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }
}
