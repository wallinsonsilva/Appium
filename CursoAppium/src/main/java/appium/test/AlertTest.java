package appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import appium.core.BaseTest;
import appium.page.AlertaPage;
import appium.page.MenuPage;

public class AlertTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AlertaPage alerta = new AlertaPage();
	
	
	@Before
	public void setUp() {
		menu.acessarAlert();
	}
	
	@Test
	public void deveConfirmarAlerta() {
		//Deve clicar em alert confirm
		alerta.clicarAlertaConfirm();
		
		//Deve Verificar os textos
		Assert.assertEquals("Info",alerta.obterTituloAlerta());
		Assert.assertEquals("Confirma a operação?",alerta.obterMensagemAlerta());
		
		//Confirmar alerta
		alerta.confirmarAlerta();
		
		//Verificar se estar confirmado
		Assert.assertEquals("Confirmado", alerta.obterMensagemAlerta());

		//Verificar mensagem
		alerta.clicarSair();
	}
	
	
	@Test
	public void deveClicarForaAlerta() throws InterruptedException {
		//Clicar alerta simples
		alerta.clicarAlertaSimples();
		
		//Clicar fora da caixa
		Thread.sleep(1000L);
		alerta.clicarForaCaixa();
		
		//Verificar que a msg não existe mais
		Assert.assertFalse(alerta.existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
		
	}

}
