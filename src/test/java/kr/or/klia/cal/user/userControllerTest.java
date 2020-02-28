package kr.or.klia.cal.user;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest
//@SpringBootTest
@AutoConfigureMockMvc
class userControllerTest {
    @Autowired
    MockMvc mockMvc;

    public void user() throws Exception {
        this.mockMvc.perform(get("/user"))
                .andDo(print())
                .andExpect(content().string("test"));

    }
    @Test
    public void user2() throws Exception {
        this.mockMvc.perform(get("/user"))
                .andExpect(status().isOk());
    }
}