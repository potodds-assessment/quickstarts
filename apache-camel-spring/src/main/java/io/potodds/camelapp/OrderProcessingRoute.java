package io.potodds.camelapp;

import org.springframework.stereotype.Component;

@Component
public class OrderProcessingRoute {
    
    @Autowired
    private PriceAggregationStrategy priceAggregationStrategy;

    @Override
    public void configure() throws Exception {
        from("direct:fetchProcess")
            .split(body(), priceAggregationStrategy).parallelProcessing()
            .to("bean:pricingService?method=calculatePrice")
            .end();
    }

}
