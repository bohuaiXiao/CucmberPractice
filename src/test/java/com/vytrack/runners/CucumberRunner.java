package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author:
 * @create:
 * @date:
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        glue ="com/vytrack/step_definitions",
        features = "src/test/resources/features"
)
public class CucumberRunner {

}