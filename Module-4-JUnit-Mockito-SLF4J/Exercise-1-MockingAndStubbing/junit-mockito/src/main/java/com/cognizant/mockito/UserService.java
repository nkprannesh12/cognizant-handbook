package com.cognizant.mockito;

public class UserService {

    private ExternalApi externalApi;

    public UserService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}