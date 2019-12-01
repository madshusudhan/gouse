package io.micronaut.example;

import io.micronaut.function.client.FunctionClient;
import io.reactivex.Single;

import javax.inject.Named;

@FunctionClient
public interface Client {

    @Named("micronaut-java-cli")
    Single<String> index();

}