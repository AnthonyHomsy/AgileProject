import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.superΩ.SuperHeros;
import org.example.superΩ.SuperVilain;
import org.junit.Assert;

public class MyStepdefs0 {

    private SuperHeros super1;
    private String infos;
    private SuperVilain vilain;
    @Given("We have a super hero and a villain")
    public void weHaveASuperHeroAndAVillain() {
        super1 = new SuperHeros("Magma Mama", "Contrôle du Magma");
        vilain = new SuperVilain(super1);
    }

    @When("I request infos from villain")
    public void iRequestInfosFromVillain() {
        infos = vilain.getInfo();
    }

    @Then("I should see the the villain's info")
    public void iShouldSeeTheTheVillainSInfo() {
        Assert.assertEquals("Nom : Tante Plante; Faiblesse : Feu; Ennemie/Pouvoir : Magma Mama : Contrôle du Magma;", vilain.getInfo());
    }
}
