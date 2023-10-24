package ir.matiran.library.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import ir.matiran.library.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
