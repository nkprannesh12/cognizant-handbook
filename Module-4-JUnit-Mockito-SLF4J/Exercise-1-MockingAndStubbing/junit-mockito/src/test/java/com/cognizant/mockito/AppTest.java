package com.cognizant.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

public class AppTest {

    @Test
    void testFetchData() {

        // Arrange
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        UserService userService = new UserService(mockApi);

        // Act
        String result = userService.fetchData();

        // Assert
        assertEquals("Mock Data", result);
    }
}