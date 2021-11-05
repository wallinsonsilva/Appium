package appium.test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import appium.page.DragAndDropPage;
import appium.page.MenuPage;

public class DragAndDropTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private DragAndDropPage page = new DragAndDropPage();
	
	private String[] estadoInicial = new String[] {"Esta","� uma lista","Drag em Drop!","Fa�a um clique longo,","e arraste para","qualquer local desejado."};
	private String[] estadoIntermediario = new String[] {"� uma lista","Drag em Drop!","Fa�a um clique longo,","e arraste para","Esta","qualquer local desejado."};
	private String[] estadoFinal = new String[] {"Fa�a um clique longo,","� uma lista","Drag em Drop!","e arraste para","Esta","qualquer local desejado."};
	
	
	@Test
	public void deveEfetuarDragAndDrop() {
		//Acessar Menu
		menu.acessarDragAndDrop();
		
		//Verificar estado Inicial
		Assert.assertArrayEquals(estadoInicial,page.obterLista());
		
		//arrastar "Esta" para "e arraste para"
		page.arrastar("Esta", "e arraste para");
		
		//Verificar estado intermedi�rio
		Assert.assertArrayEquals(estadoIntermediario,page.obterLista());
		
		//arrastar "Fa�a um clique longo," para "� uma lista"
		page.arrastar("Fa�a um clique longo,", "� uma lista");
		
		//Verificar estado final
		Assert.assertArrayEquals(estadoFinal,page.obterLista());
	}

}
