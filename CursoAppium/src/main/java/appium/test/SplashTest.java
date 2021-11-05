package appium.test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import appium.page.MenuPage;
import appium.page.SplashPage;

public class SplashTest extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private SplashPage splashPage = new SplashPage();
	
	@Test
	public void deveAguardarSplashSumir() {
		
		//Acessar Menu Aplash
		menuPage.acessarSplash();
		
		//Verificar se o splash est� sendo exibido
		Assert.assertTrue(splashPage.isTelaSplashVisivel());
		
		//Aguardar saida do splash
		splashPage.aguardarSplashSumir();
		Assert.assertFalse(splashPage.isTelaSplashVisivel());
		
		//Verificar se o formul�rio est� aparecendo
		Assert.assertTrue(splashPage.existeElementoPorTexto("Formul�rio"));
	}

}
