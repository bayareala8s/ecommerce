package com.bayareala8s.ecommerce.service;

import com.bayareala8s.ecommerce.dto.Purchase;
import com.bayareala8s.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
