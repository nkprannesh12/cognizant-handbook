package com.cognizant.mockito;

public class UserService {

    private ExternalApi externalApi;

    public UserService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void processData() {
        externalApi.sendData("Hello Mockito");
    }
}