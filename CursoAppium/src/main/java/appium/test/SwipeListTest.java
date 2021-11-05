package appium.test;

import org.junit.Assert;
import org.junit.Test;

import appium.core.BaseTest;
import appium.page.MenuPage;
import appium.page.SwipeListPage;

public class SwipeListTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SwipeListPage swip = new SwipeListPage();
	
	@Test
	public void deveResolverDesafio() {
		//1 - Clicar no menu SwipeList
		menu.acessarSwipeList();
		
		//2 - OP1 para dir
		swip.swipeElementRigth("Op��o 1");
		
		//3 - OP1 +
		swip.clicarBotaoMais();
		
		//4 - Verificar OP+
		Assert.assertTrue(swip.existeElementoPorTexto("Op��o 1 (+)"));
		
		//5 - Op4 para dir
		swip.swipeElementRigth("Op��o 4");
		
		//6 - OP4
		swip.clicarPorTexto("(-)");
		
		//7 - Verificar Op4-
		Assert.assertTrue(swip.existeElementoPorTexto("Op��o 4 (-)"));
		
		//8 - Op5 para esq
		swip.swipeElementLeft("Op��o 5 (-)");
		
		//9 - Verificar Op5
		Assert.assertTrue(swip.existeElementoPorTexto("Op��o 5"));
	}

}
