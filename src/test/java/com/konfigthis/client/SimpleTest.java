package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.lob.com/v1";
        
        // Configure HTTP basic authorization: basicAuth
        configuration.username = "YOUR USERNAME";
        configuration.password = "YOUR PASSWORD";
        Lob client = new Lob(configuration);
        assertNotNull(client);
    }
}
