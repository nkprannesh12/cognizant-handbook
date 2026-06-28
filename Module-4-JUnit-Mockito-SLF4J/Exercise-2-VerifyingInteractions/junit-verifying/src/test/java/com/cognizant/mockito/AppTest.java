package com.cognizant.mockito;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AppTest {

    @Test
    void testVerifyInteraction() {

        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);
        UserService userService = new UserService(mockApi);

        // Act
        userService.processData();

        // Assert
        verify(mockApi).sendData("Hello Mockito");
    }
}