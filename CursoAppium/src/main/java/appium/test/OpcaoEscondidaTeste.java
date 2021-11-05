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
		menu.clicarPorTexto("Opção bem escondida");
		
		//Verificar msg
		Assert.assertEquals("Você achou essa opção",menu.obterMensagemAlerta());
		
		//Sair mensagem
		menu.clicarPorTexto("OK");

	}

}
