import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.superΩ.SuperHeros;

public class MyStepdefs {

    private SuperHeros super1;
    private String infos;

    @Given("We have a super hero")
    public void weHaveASuperHero() {
        super1 = new SuperHeros("Magma Mama", "Contrôle du Magma");
    }

    @When("I request infos")
    public void iRequestInfos() {
        infos = super1.getInfo();
    }

    @Then("I should see the informations about it")
    public void iShouldSeeTheInformationsAboutIt() {
        assert(infos == "Mamga Mama : Contrôle du magma");

    }

}
