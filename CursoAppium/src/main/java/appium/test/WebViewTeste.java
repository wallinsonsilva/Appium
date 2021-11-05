package appium.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import appium.page.MenuPage;
import appium.page.WebViewPage;

public class WebViewTeste extends BaseTest{
	
	private MenuPage menu = new MenuPage();
	private WebViewPage page = new WebViewPage();

	
	@Test
	public void deveFazerLogin() {
		//Acessar Menu
		menu.acessarSeuBarrigaHibrido();
		page.entrarContextoWeb();
		
		//preencher email
		page.setEmail("usuarioteste2021@teste.com");
		
		//senha
		page.setSenha("teste");
		
		//entrar
		page.clicarEntrar();
		
		//verificar
		Assert.assertEquals("Bem vindo, usuario teste!",page.getMensagem());
		
	}
	
	@After
	public void tearDown() {
		page.sairContextoWeb();
	}
}
