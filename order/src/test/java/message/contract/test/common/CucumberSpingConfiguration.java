package message.contract.test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import message.contract.test.OrderApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderApplication.class })
public class CucumberSpingConfiguration {}
