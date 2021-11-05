package appium.test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import appium.page.CliquePage;
import appium.page.MenuPage;

public class CliqueTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private CliquePage clique = new CliquePage();
	
	@Test
	public void cliqueLongoTeste() {
		
		menu.acessarCliques();
		
		clique.cliqueLongo();
		
		Assert.assertEquals("Clique Longo",clique.obterTextoCampo());
	}
	
	@Test
	public void cliqueDuplo() {
		menu.acessarCliques();
		
		clique.cliqueDuplo();
		
		Assert.assertEquals("Duplo clique",clique.obterTextoCampo());
	}

}
