package appium.test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import appium.page.DragAndDropPage;
import appium.page.MenuPage;

public class DragAndDropTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private DragAndDropPage page = new DragAndDropPage();
	
	private String[] estadoInicial = new String[] {"Esta","é uma lista","Drag em Drop!","Faça um clique longo,","e arraste para","qualquer local desejado."};
	private String[] estadoIntermediario = new String[] {"é uma lista","Drag em Drop!","Faça um clique longo,","e arraste para","Esta","qualquer local desejado."};
	private String[] estadoFinal = new String[] {"Faça um clique longo,","é uma lista","Drag em Drop!","e arraste para","Esta","qualquer local desejado."};
	
	
	@Test
	public void deveEfetuarDragAndDrop() {
		//Acessar Menu
		menu.acessarDragAndDrop();
		
		//Verificar estado Inicial
		Assert.assertArrayEquals(estadoInicial,page.obterLista());
		
		//arrastar "Esta" para "e arraste para"
		page.arrastar("Esta", "e arraste para");
		
		//Verificar estado intermediário
		Assert.assertArrayEquals(estadoIntermediario,page.obterLista());
		
		//arrastar "Faça um clique longo," para "é uma lista"
		page.arrastar("Faça um clique longo,", "é uma lista");
		
		//Verificar estado final
		Assert.assertArrayEquals(estadoFinal,page.obterLista());
	}

}
