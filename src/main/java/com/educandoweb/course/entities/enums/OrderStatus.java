package com.educandoweb.course.entities.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int cod;

    private OrderStatus(int cod) {
        this.cod = cod;
    }

    public int getCod() {
        return this.cod;
    }

    public static OrderStatus valueOf(int cod) {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.getCod() == cod) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
