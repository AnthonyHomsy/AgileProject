import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Instrument;
import org.example.Musicien;
import org.junit.Assert;

public class MyStepdefs4 {

    private Instrument saxophone = new Instrument();
    private Musicien coltrane = new Musicien();

    @Given("un musicien possède un instrument")
    public void unMusicienPossedeUnInstrument() {
        coltrane.setInstrument(saxophone);
        Assert.assertNotNull(coltrane);
        Assert.assertNotNull(saxophone);
        Assert.assertNotNull(coltrane.getInstrument());
    }

    @When("l'instrument est inspecté")
    public void lInstrumentEstInspecte() {
        Assert.assertEquals(saxophone,coltrane.getInstrument());
    }

    @Then("le musicien vérifie si l'instrument est à cordes")
    public void leMusicienVerifieSiLInstrumentEstACordes() {
        Assert.assertEquals(false,saxophone.estCordes());
    }
}