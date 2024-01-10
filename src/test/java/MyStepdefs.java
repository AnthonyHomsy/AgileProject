import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.SuperHeros;
import org.example.SuperVilain;
import org.junit.Assert;

public class MyStepdefs {

    private SuperHeros super1;
    private SuperVilain vilain1;
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

    @Given("We have a super hero and a villain")
    public void weHaveASuperHeroAndAVillain() {
        super1 = new SuperHeros("Magma Mama", "Contrôle du Magma");
        vilain1 = new SuperVilain(super1);
    }

    @When("I request infos villains")
    public void iRequestInfosVillains() {
        infos = vilain1.getInfo();
    }

    @Then("I should see the the villain")
    public void iShouldSeeTheTheVillain() {
        Assert.assertEquals("Nom : Tante Plante; Faiblesse : Feu; Ennemie/Pouvoir : Magma Mama : Contrôle du Magma;", vilain1.getInfo());

    }
}
