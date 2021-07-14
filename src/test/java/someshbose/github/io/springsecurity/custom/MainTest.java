package someshbose.github.io.springsecurity.custom;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MainTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithCustomUser(username = "Somesh")
    public void helloAuthenticated() throws Exception{
        mockMvc.perform(get("/hello")).andExpect(status().isOk());
    }
}
