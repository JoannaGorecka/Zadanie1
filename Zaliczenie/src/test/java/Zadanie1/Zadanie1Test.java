package Zadanie1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/zadanie-one.feature",
        plugin = {"pretty", "html:report/result.html"}
)

public class Zadanie1Test {

}


