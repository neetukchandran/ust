package mercurytour;


import io.cucumber.testng.*;



@CucumberOptions(features="src/test/resources/features",glue= {"mercurytour"},
monochrome=true)

public class TestRunner extends AbstractTestNGCucumberTests{

}
