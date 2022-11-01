package sample;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingByKeyword  {
    @ExtendWith(SerenityJUnit5Extension.class)
    @Managed(driver = "remote" )
    WebDriver driver;
    NavigateActions navigate;
    SearchActions search;

    @Test
    void theKeywordShouldAppearInTheResultsSidebar() {
        navigate.toTheDuckDuckGoSearchPage();
      //  search.byKeyword("Cucumber");
    }

}
