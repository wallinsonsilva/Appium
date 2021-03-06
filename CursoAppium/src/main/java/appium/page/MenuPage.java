package appium.page;

import appium.core.BasePage;

public class MenuPage extends BasePage{
	
	public void acessarFormulario() {
		clicarPorTexto("Formul?rio");
	}

	public void acessarSplash() {
		clicarPorTexto("Splash");
	}

	public void acessarAlert() {
		clicarPorTexto("Alertas");
	}
	
	public void acessarAbas() {
		clicarPorTexto("Abas");
	}
	
	public void acessarAccordion() {
		clicarPorTexto("Accordion");
	}
	
	public void acessarCliques() {
		clicarPorTexto("Cliques");
	}

	public void acessarSwipe() {
		scrollDown();
		clicarPorTexto("Swipe");
	}
	
	public void acessarSwipeList() {
		scrollDown();
		clicarPorTexto("Swipe List");
	}

	public void acessarDragAndDrop() {
		scrollDown();
		clicarPorTexto("Drag and drop");
	}

	public void acessarSeuBarrigaHibrido() {
		clicarPorTexto("SeuBarriga H?brido");
	}
	
	

}
