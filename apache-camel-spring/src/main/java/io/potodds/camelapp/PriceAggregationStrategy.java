package io.potodds.camelapp;

import org.springframework.stereotype.Component;

@Component
public class PriceAggregationStrategy implements AggregationStrategy {

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        OrderLine newBody = newExchange.getIn().getBody(OderLine.class);

    }
    
}
