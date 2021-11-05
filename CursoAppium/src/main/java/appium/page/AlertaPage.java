package appium.page;

import appium.core.BasePage;

public class AlertaPage extends BasePage{
	
	public void clicarAlertaConfirm() {
		clicarPorTexto("ALERTA CONFIRM");
	}
	
	public void clicarAlertaSimples() {
		clicarPorTexto("ALERTA SIMPLES");
	}
	
	public void confirmarAlerta() {
		clicarPorTexto("CONFIRMAR");
	}
	
	public void clicarSair() {
		clicarPorTexto("SAIR");
	}

	public void clicarForaCaixa() {
		tapPress(100,150);
	}
}
