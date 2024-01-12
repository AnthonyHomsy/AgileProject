import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.example.Instrument;
import org.example.Musicien;

import java.util.Objects;

public class MyStepdefs3 {

    Musicien coltrane = new Musicien();
    Instrument saxophone = new Instrument();
    Instrument piano = new Instrument();
    @Given("Un musicien existant nommé {string} avec un instrument de la famille {string}")
    public void unMusicienExistantNommeNomAvecUnInstrumentDeLaFamilleFamille(String nom, String famille) {
        coltrane.setInstrument(saxophone);
        saxophone.setProprio(coltrane);
        coltrane.setName(nom);
        saxophone.setFamille(famille);
        Assert.assertNotNull(coltrane);
        Assert.assertNotNull(saxophone);
        Assert.assertNotNull(coltrane.getInstrument());
        Assert.assertNotNull(saxophone.getFamille());
    }

    @When("On change l'instrument du musicien")
    public void onChangeLInstrumentDuMusicien() {
        piano.setTonalite("ut");
        coltrane.setInstrument(piano);
        Assert.assertNotNull(piano);
        Assert.assertEquals(piano, coltrane.getInstrument());
    }

    @Then("Un nouvel instrument a pour propriétaire le musicien et cet instrument est d'une nouvelle famille")
    public void unNouvelInstrumentAPourProprietaireLeMusicienEtCetInstrumentEstDUneNouvelleFamilleFamille() {
        piano.setFamille("cordes");
        piano.setProprio(coltrane);
        Assert.assertNotEquals(piano.getFamille(), saxophone.getFamille());
    }

}
