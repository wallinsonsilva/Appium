package appium.page;

import org.openqa.selenium.By;

import appium.core.BasePage;

public class AccordionPage extends BasePage {
	
	public void clicarOpcao01() {
		clicarPorTexto("Opção 1");
	}
	
	public String obterValorOP01() {
		return obterTexto(By.xpath("//*[@text='Opção 1']/../../following-sibling::android.view.ViewGroup//android.widget.TextView"));
	}
}
