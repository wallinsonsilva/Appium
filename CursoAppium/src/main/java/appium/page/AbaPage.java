package appium.page;

import appium.core.BasePage;

public class AbaPage extends BasePage{
	
	public boolean isAba01() {
		return existeElementoPorTexto("Este é o conteúdo da Aba 1");
	}
	
	public boolean isAba02() {
		return existeElementoPorTexto("Este é o conteúdo da Aba 2");
	}
	
	public void selecionarAba02() {
		clicarPorTexto("ABA 2");
	}

}
