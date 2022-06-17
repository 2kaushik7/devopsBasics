package com.practice.sai;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.practice.sai.controller.RestController;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = RestController.class)
class DevopsBasicsApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void testCarDetails_carNotFoundException() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.status().isOk());
	}

}
