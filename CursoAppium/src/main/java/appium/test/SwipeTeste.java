package appium.test;

import org.junit.Assert;
import org.junit.Test;

import appium.page.MenuPage;

public class SwipeTeste extends appium.core.BaseTest {
	
	private MenuPage menu = new MenuPage();
	
	
	@Test
	public void deveRealizarSwipe() {
		//Acessar Menu
		menu.acessarSwipe();
		
		//Verificar Texto 'a esquerda'
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
		
		//swipe para direita
		menu.swipeRight();
		
		//verificar o texto 'E veja se'
		Assert.assertTrue(menu.existeElementoPorTexto("E veja se"));
		
		//Clicar botão direita
		menu.clicarPorTexto("›");
		
		//Verificar o texto 'Chegar até o fim!'
		Assert.assertTrue(menu.existeElementoPorTexto("Chegar até o fim!"));
		
		//swipe esquerda
		menu.swipeLeft();
		
		//clicar botão da esquerda
		menu.clicarPorTexto("‹");
		
		//Verificar 'Mova a tela para esquerda'
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
		
		
	}

}
