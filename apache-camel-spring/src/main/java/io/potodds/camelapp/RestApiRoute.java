package io.potodds.camelapp;

import org.springframework.core.env.Environment;

public class RestApiRoute extends RouteBuilder {

    private Environment env;

    @Override
    public void configure() throws Exception {
        restConfiguration()
            .contextPath("/ecommapp")
            .appiContextPath("/api-doc")
            .apiProperty("api.title", "REST API for processing Order")
            .apiProperty("api.version", "1.0")
            .apiProperty("cors", "true")
            .appiContextRouteId("doc-api")
            .port(env.getProperty("server.port", "8080"))
            .bindingMode(RestBindingMode.json);

        rest("/order")
            .get("/process").description("Process order")
            .route().routeId("orders-api")
            .bean(OrderService.class, "generateOrder")
            .to("direct:fetchProcess")
            .endRest();
        
    }
    
}
