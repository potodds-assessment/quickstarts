package io.potodds.camelapp;

public abstract class RouteBuilder {

    abstract void configure() throws Exception;

    public static void main(String[] args) {
        RouteBuilder builder = new RouteBuilder() {

            @Override
            public void configure() throws Exception {
                from("jms:queue:myQueue").to("file://mysrc");
            }
        };
    }
}
