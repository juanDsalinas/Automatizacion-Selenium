package runners

import io.cucumber.junit.CucumberOptions
import net.serenitybdd.cucumber.CucumberWithSerenity
import org.junit.runner.RunWith


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "src/test/java/stepsdefinitions"
)
class LoginRunner {


}
