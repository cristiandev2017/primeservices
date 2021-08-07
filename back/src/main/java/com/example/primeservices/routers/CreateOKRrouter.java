package com.example.primeservices.routers;

import com.example.primeservices.DTO.OKRDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import com.example.primeservices.usecases.CreateOKRUsecase;

@Configuration
@CrossOrigin(origins = "*")
public class CreateOKRrouter {
    @Bean
    public RouterFunction<ServerResponse> createOKR(CreateOKRUsecase createOKRUsecase){
        return route(POST("/createokr").and(accept(MediaType.APPLICATION_JSON )),
                request->request.bodyToMono(OKRDTO.class)
                        .flatMap(OKRDTO->createOKRUsecase.apply(OKRDTO)
                        .flatMap(result->ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(result))));
    }
}
