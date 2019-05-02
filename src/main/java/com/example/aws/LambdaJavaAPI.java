package com.example.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;


import java.util.Collections;

public class LambdaJavaAPI implements RequestHandler<Object,GatewayResponse > {

    @Override
    public GatewayResponse handleRequest(Object object, Context context) {
        String message = "Hello AWS World";
        System.out.println(message);
        GatewayResponse gatewayResponse = new GatewayResponse(
                message,
                200,
                Collections.singletonMap("Header Key", "Header Value"),
                false);
        return gatewayResponse;
    }
}
