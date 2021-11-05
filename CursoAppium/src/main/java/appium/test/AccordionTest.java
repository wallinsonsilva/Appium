package appium.test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import appium.page.AccordionPage;
import appium.page.MenuPage;

public class AccordionTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AccordionPage page = new AccordionPage();
	
	@Test
	public void deveAcessarAccordion() throws InterruptedException {
		//deve acessar menu accordion
		menu.acessarAccordion();
		
		//Clicar Op 01
		page.clicarOpcao01();
		
		//Verificar texto op 01
		Thread.sleep(1000L);
		Assert.assertEquals("Esta é a descrição da opção 1",page.obterValorOP01());
	}

}
