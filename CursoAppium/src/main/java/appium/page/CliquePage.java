package appium.page;

import static appium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

import appium.core.BasePage;

public class CliquePage extends BasePage{
	
	public void cliqueLongo() {
		new TouchActions(getDriver())
		.longPress(getDriver()
				.findElement(By.xpath("//*[@text='Clique Longo']")))
		.perform();
	}
	
	
	public String obterTextoCampo() {
		return getDriver().findElement(By.xpath("//android.view.ViewGroup/android.widget.TextView[@text='Clique duplo lento']/preceding::android.widget.TextView")).getText();
	}
	
	public void cliqueDuplo() {
		clicarPorTexto("Clique duplo");
		clicarPorTexto("Clique duplo");
	}
	
	
}
