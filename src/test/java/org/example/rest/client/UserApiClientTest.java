package org.example.rest.client;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserApiClientTest {
    private static final String TEST_BASE_URL = "https://test.host";
    @Test
    void ifIstaceOfClient() {
        //GIVEN
        UserApiClient client;
        //WHEN //THEN
        new UserApiClient(TEST_BASE_URL);
    }
}