package io.potodds.camelapp;

public class PricingService {
    public OrderLine calculatorPrice(final OrderLine orderLine) {
        String category = orderLine.getProduct().getProductCategory();
        if ("Electronics".equalsIgnoreCase(category))
            orderLine.setPrice(300.0);

    }
    return orderLine;
}
