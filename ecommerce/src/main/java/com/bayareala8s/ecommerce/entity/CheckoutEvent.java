package com.bayareala8s.ecommerce.entity;

import com.bayareala8s.ecommerce.dto.Purchase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.kafka.common.serialization.IntegerSerializer;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CheckoutEvent {

    private Integer checkoutEventId;
    private Purchase purchase;
}
