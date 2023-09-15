package io.potodds.camelapp;

import org.springframework.stereotype.Component;

@Component
public class FetchProductRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("direct:fetchProducts")
            .routeId("direct-fetchProducts")
            .tracing()
            .log(">>> ${body}")
            .bean(ProductService.class, "fetchProductsByCategory")
            .end();
    }
}
