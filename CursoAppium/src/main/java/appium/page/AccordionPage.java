package appium.page;

import org.openqa.selenium.By;

import appium.core.BasePage;

public class AccordionPage extends BasePage {
	
	public void clicarOpcao01() {
		clicarPorTexto("Op��o 1");
	}
	
	public String obterValorOP01() {
		return obterTexto(By.xpath("//*[@text='Op��o 1']/../../following-sibling::android.view.ViewGroup//android.widget.TextView"));
	}
}
