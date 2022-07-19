import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeleniumTest extends BaseTest{

    /*
    Tölts be a böngészőbe az alábbi oldalt: https://demo.seleniumeasy.com/basic-first-form-demo.html
    Írj tesztesetet két szám összegének ellenőrzésére a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet. Az oldalon, a Two Input Fields” szekcióban két beviteli mezőjét töltsd ki tetszőleges számokkal, majd végezd el a számok összeadásának ellenőrzését kiolvasva az oldalon megjelenő összeget.
    Használj tetszőleges tesztadatot
     */
    @DisplayName("TC1")
    @Test
    public void TestInputFields() throws InterruptedException {
        String testDataA = "10";
        String testDataB = "20";

        BasePage page = new BasePage(driver);
        page.navigate();
        Thread.sleep(5000);
        page.closePopUp();
        Thread.sleep(5000);
        page.setA(testDataA);
        page.setB(testDataB);
        page.getTotal();

        String actual = page.getDisplayValue();

        Assertions.assertEquals("30", actual);
    }


    /*
    Töltsd be az alábbi oldalt a böngészőbe: zhttps://demo.seleniumeasy.com/basic-select-dropdown-demo.html
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet a következők szerint: a Select List Demo szekció lenyíló mezőjében válaszd ki a hét utolsó napját és ellenőrizd, hogy az oldalon helyesen jelenik meg a kiválasztott érték
    Tesztadatként használd az hét utolsó napját
     */
    @Test
    @DisplayName("TC2")
    public void SelectDayTest()
    {
        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.navigate();
        String actual = dropDownPage.getLastDay();
        String expected = "Saturday";
        Assertions.assertEquals(expected, actual);

    }

    /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/bootstrap-modal-demo.html#
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet. A tesztesetben ellenőrizd a modal alert ablak szöveges tartalmát összahasonlítva egy általad definiált elvárt eredménnyel. Nyisd meg a Single Modal ablakot, tárolt el az ablakon megjelenő szöveget egy változóba és zárd be az ablakot a bezárás gombbal
     */
    @Test
    @DisplayName("TC3")
    public void AlertTest() throws InterruptedException {
        BootstrapPage bootstrapPage = new BootstrapPage(driver);
        bootstrapPage.navigate();
        Thread.sleep(3000);
        bootstrapPage.launchModal();
        Thread.sleep(3000);
        bootstrapPage.saveModal();
        String expected = "This is the place where the content for the modal dialog displays";
        Assertions.assertEquals(expected, bootstrapPage.getModalText());
        bootstrapPage.closeModal();
    }

    /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/data-list-filter-demo.html
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet. A teszteset ellenőrizze a névjegykártyák tartalmát.Olvasd ki a neveket a megjelenő névjegykártyákról és ellenőrzésként hasonlítsd össze egy elvárt eredményként megadott listával.
    Használj relatív útvonalat a névjegykártya név elemeinek kiolvasásához.

    @Test
    @DisplayName("TC4")
    public void NamecardTest()
    {
        DataListFilterPage dataListFilterPage = new DataListFilterPage(driver);
        dataListFilterPage.navigate();
        List<String> expectednameList = new ArrayList<>(Arrays.asList("Tyreese Burn", "Brenda Tree","Glenn Pho shizzle","Brian Hoyies","Glenn Pho shizzle","Arman Cheyia"));
        Assertions.assertArrayEquals(expectednameList, dataListFilterPage.getNames());

    }*/

    /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/table-data-download-demo.html
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet. A tesztesetet ellenőrizze a táblázatból a neveket, amelyeket a táblázat első oszlop tartalmaz. Gyűjtsd össze a neveket és tárold le a names.txt fájlba majd a tesztesetben a fájl tartalmát hasonlítsd össze egy elvárt eredménnyel.
     */
    public void TableTest()
    {}

}
