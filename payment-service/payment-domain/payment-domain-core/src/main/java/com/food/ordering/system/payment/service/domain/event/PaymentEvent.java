package com.food.ordering.system.payment.service.domain.event;

import com.food.ordering.system.domain.event.DomainEvent;
import com.food.ordering.system.payment.service.domain.entity.Payment;

import java.time.ZonedDateTime;
import java.util.List;

public abstract class PaymentEvent implements DomainEvent<Payment> {

    private final Payment payment;
    private final ZonedDateTime createdAt;
    private final List<String> failuerMessages;

    public PaymentEvent(Payment payment, ZonedDateTime createdAt, List<String> failuerMessages) {
        this.payment = payment;
        this.createdAt = createdAt;
        this.failuerMessages = failuerMessages;
    }

    public Payment getPayment() {
        return payment;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public List<String> getFailuerMessages() {
        return failuerMessages;
    }
}
