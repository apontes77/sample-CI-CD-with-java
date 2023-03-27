package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

public class RentControllerIT extends IntegrationTest {

    @Test
    public void whenRentControllerIsCalledThenSuccess() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/available-rents"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
    }

    @Test
    public void whenRentControllerIsCalledThenFailure() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/api/v2/available-rents"))
                .andExpect(MockMvcResultMatchers.status().isNotFound())
                .andDo(print());
    }
}
