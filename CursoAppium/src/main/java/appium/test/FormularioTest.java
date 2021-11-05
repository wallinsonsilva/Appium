package appium.test;
import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import appium.core.BaseTest;
import appium.page.FormularioPage;
import appium.page.MenuPage;
import io.appium.java_client.MobileBy;

public class FormularioTest extends BaseTest{

	private MenuPage menu = new MenuPage();
	private FormularioPage formPage = new FormularioPage();
	

	@Before
	public void inicializarAppium() throws MalformedURLException {
		menu.acessarFormulario();
	}

	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {
		
		formPage.escreverNome("Wallinson");

		Assert.assertEquals("Wallinson", formPage.obterNome());

	}

	@Test
	public void deveInteragirComCombo() throws MalformedURLException {
		formPage.selecionarCombo("Nintendo Switch");
		Assert.assertEquals("Nintendo Switch",formPage.obterValorCombo());
	}

	@Test
	public void deveInteragirSwitchECheckbox() throws MalformedURLException {

		Assert.assertFalse(formPage.isCheckMarcado());
		Assert.assertTrue(formPage.isSwitchMarcado());

		formPage.clicarCheckbox();
		formPage.clicarSwitch();

		Assert.assertTrue(formPage.isCheckMarcado());
		Assert.assertFalse(formPage.isSwitchMarcado());

	}

	@Test
	public void deveFazerCadastro() throws MalformedURLException {

		formPage.escreverNome("Wallinson");

		Assert.assertEquals("Wallinson", formPage.obterNome());

		formPage.selecionarCombo("Nintendo Switch");

		Assert.assertEquals("Nintendo Switch",formPage.obterValorCombo());

		Assert.assertFalse(formPage.isCheckMarcado());
		Assert.assertTrue(formPage.isSwitchMarcado());

		formPage.clicarCheckbox();
		formPage.clicarSwitch();

		Assert.assertTrue(formPage.isCheckMarcado());
		Assert.assertFalse(formPage.isSwitchMarcado());

		formPage.clicarBotaoSalvar();

		Assert.assertEquals("Nome: Wallinson", formPage.obterNomeCadastrado());

		Assert.assertEquals("Console: switch", formPage.obterNomeConsoleCadastrado());

		Assert.assertTrue(formPage.obterValorCheckbox());
		
		Assert.assertTrue(formPage.obterValorSwitch());
	}
	
	@Test
	public void deveFazerCadastrDemorado() throws MalformedURLException {

		formPage.escreverNome("Wallinson");


		formPage.clicarBotaoSalvarDemorado();

		Assert.assertEquals("Nome: Wallinson", formPage.obterNomeCadastrado());
	}
	
	@Test
	public void deveAlterarData() {
		formPage.clicarPorTexto("01/01/2020");
		
		formPage.clicarPorTexto("20");
		
		formPage.clicarPorTexto("OK");
		
		Assert.assertTrue(formPage.existeElementoPorTexto("20/02/2020"));
	}
	
	
	@Test
	public void deveAlterarHora() {
		formPage.clicarPorTexto("06:00");
		
		formPage.clicar(MobileBy.AccessibilityId("10"));
		formPage.clicar(MobileBy.AccessibilityId("40"));
		formPage.clicarPorTexto("OK");
		
		Assert.assertTrue(formPage.existeElementoPorTexto("10:40"));
	}
	
	@Test
	public void deveInteragirComSeekBar() {
		//Clicar no seekbar
		formPage.clicarSeekBar(0.98);
		
		//Salvar
		formPage.clicarBotaoSalvar();
	}

}
