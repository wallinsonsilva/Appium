package appium.test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import appium.page.AbaPage;
import appium.page.MenuPage;

public class AbasTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AbaPage aba = new AbaPage();
	
	
	@Test
	public void deveInteragirComAbas() {
		//Acessar Menu Abas
		menu.acessarAbas();
		
		//Verificar se est� na Aba 01
		Assert.assertTrue(aba.isAba01());
		
		//Acessar Aba 02
		aba.selecionarAba02();
		
		//Verificar que est� na Aba 02
		Assert.assertTrue(aba.isAba02());
	}

}
