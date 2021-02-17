package co.com.migrupo.certification.proyectobase.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import static util.ManualTest.validate;

public class StepDefinitionManualTest {


    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public void open_the_calculator(String step) {
        validate(step, scenario.getName());
    }

}