import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.music.Instrument;
import org.example.music.Musicien;
import org.junit.Assert;

public class MyStepdefs2 {
    private Musicien mozart;
    private Instrument piano;
    // Assuming you have a Musicien class and Instrument class
    // with appropriate methods for creating and assigning instruments

    @Given("la création d'un musicien nommé {string}")
    public void createMusician(String nom) {
        mozart = new Musicien();
        piano = new Instrument();
        mozart.setName(nom);
        Assert.assertNotNull(mozart);
        Assert.assertNotNull(piano);
        Assert.assertEquals(nom,mozart.getName());
    }

    @When("on attribue un instrument au musicien")
    public void assignInstrument() {
        mozart.setInstrument(piano);
        Assert.assertEquals(piano, mozart.getInstrument());
    }

    @Then("l'instrument du musicien devient l'instrument choisi")
    public void checkInstrument() {
        piano.setProprio(mozart);
        Assert.assertEquals(mozart, piano.getProprio().getLast());
    }
}
