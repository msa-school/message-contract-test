package message.contract.test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import message.contract.test.ProductApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProductApplication.class })
public class CucumberSpingConfiguration {}
