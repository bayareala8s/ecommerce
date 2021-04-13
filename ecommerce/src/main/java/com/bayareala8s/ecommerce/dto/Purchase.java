package com.bayareala8s.ecommerce.dto;

import com.bayareala8s.ecommerce.entity.Address;
import com.bayareala8s.ecommerce.entity.Customer;
import com.bayareala8s.ecommerce.entity.Order;
import com.bayareala8s.ecommerce.entity.OrderItem;
import lombok.Data;


import java.util.Set;
@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
