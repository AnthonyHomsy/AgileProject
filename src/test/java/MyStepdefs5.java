import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pouvoir;
import org.example.PouvoirFactory;
import org.example.SuperMusicien;
import org.example.music.Instrument;
import org.example.music.Musicien;
import org.example.superΩ.SuperHeros;
import org.junit.Assert;

public class MyStepdefs5 {

    Musicien mozart = new Musicien();
    Instrument piano = new Instrument();
    SuperHeros wolfgang = new SuperHeros();
    SuperMusicien amadeus = new SuperMusicien();
    PouvoirFactory pf = new PouvoirFactory();

    @Given("un musicien nommé {string}")
    public void unMusicienNommeNom() {
        mozart.setName("Mozart");
        Assert.assertNotNull(mozart);
        Assert.assertNotNull(mozart.getName());

    }

    @When("il jouait d'un instrument de la famille {string}")
    public void ilJouaitDUnInstrumentDeLaFamilleFamille() {
        mozart.setInstrument(piano);
        piano.setFamille("Cordes");
        piano.setTonalite("ut");
        Assert.assertNotNull(piano);
        Assert.assertNotNull(piano.getFamille());
    }

    @Then("l usine de pouvoirs attribue automatiquement le pouvoir correspondant à l instrument du musicien")
    public void lUsineDePouvoirsAttribueAutomatiquementLePouvoirCorrespondantÀLInstrumentDuMusicien() {
        amadeus.setMusicien(mozart);
        Pouvoir pvr = pf.createPouvoirFromInstrument(amadeus.getInstrumentMusicien());
        Assert.assertNotNull(pvr);

    }
}
