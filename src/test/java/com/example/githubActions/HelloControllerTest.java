package com.example.githubActions;



import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class HelloControllerTest {

    

    @Test
    void testHelloEndpoint() {
    	 RestTemplate restTemplate = new RestTemplate(); // 👈 create manually
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/hello", String.class);
        assertThat(response.getBody()).isEqualTo("Hello, GitHub Actions!");
    }
}
