package io.potodds.camelapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResource {

    @Autowired
    private ProducerTemplate producerTemplate;

    public List<Product> getProductsByCategory(@PathVariable("category") final String category) {
        producerTemplate.start();

        List<Product> products = producerTemplate.requestBody("direct:fetchProducts", category, List.class);

        producerTemplate.stop();
        return products;
    }
}
