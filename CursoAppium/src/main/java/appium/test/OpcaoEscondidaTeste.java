package appium.test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import appium.page.MenuPage;

public class OpcaoEscondidaTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	
	@Test
	public void deveEncontrarOpcaoEscondida() {
		//Scroll down
		menu.scrollDown();
		
		//clicar menu
		menu.clicarPorTexto("Op��o bem escondida");
		
		//Verificar msg
		Assert.assertEquals("Voc� achou essa op��o",menu.obterMensagemAlerta());
		
		//Sair mensagem
		menu.clicarPorTexto("OK");

	}

}
