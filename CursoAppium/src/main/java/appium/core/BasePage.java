package appium.core;

import static appium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class BasePage {

	public void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}

	public void selecionarCombo(By by, String valor) {
		// Clicar no combo
		getDriver().findElement(by).click();

		// Selecionar a opção Desejada
		getDriver().findElement(By.xpath("//android.widget.CheckedTextView[@text='" + valor + "']")).click();
	}

	public void clicar(By by) {
		getDriver().findElement(by).click();
	}

	public void clicarPorTexto(String valor) {
		clicar(By.xpath("//*[@text='" + valor + "']"));
	}

	public boolean isCheckMarcado(By by) {
		return getDriver().findElement(by).getAttribute("checked").equals("true");
	}

	public boolean isSwitchMarcado(By by) {
		return getDriver().findElement(by).getAttribute("checked").equals("true");
	}
	
	public boolean existeElementoPorTexto(String texto) {
		return getDriver().findElements(By.xpath("//*[@text='"+texto+"']")).size() > 0;
	}
	
	public void tapPress(int x, int y) {
		new TouchAction(getDriver())
		.press(PointOption.point(x, y))
		.perform();
	}
	
	public void pressMove(int xi, int yi, int xf, int yf) {
		new TouchAction(getDriver())
		.press(PointOption.point(xi, yi))
		.moveTo(PointOption.point(xf, yf))
		.release()
		.perform();
	}
	
	public void tapTap(int x, int y) {
		new TouchAction(getDriver())
		.press(PointOption.point(x, y))
		.perform();
	}
	
	public void scrollDown() {
		scroll(0.9,0.1);
	}
	
	public void scrollUp() {
		scroll(0.1,0.9);
	}
	
	public void scroll(double inicio, double fim) {
		Dimension size = getDriver().manage().window().getSize();
		
		int x = size.width / 2;
		int start_y = (int)(size.height * inicio); 
		int end_y = (int)(size.height * fim); 
		
		new TouchAction(getDriver())
		.press(PointOption.point(x, start_y))
		.waitAction()
		.moveTo(PointOption.point(x, end_y))
		.release()
		.perform();
	}
	
	public String obterTituloAlerta() {
		return obterTexto(By.id("android:id/alertTitle"));
	}
	
	public String obterMensagemAlerta() {
		return obterTexto(By.id("android:id/message"));
	}
	
	public void swipeRight() {
		swipe(0.9,0.1);
	}
	
	public void swipeLeft() {
		swipe(0.1,0.9);
	}
	
	public void swipe(double inicio, double fim) {
		Dimension size = getDriver().manage().window().getSize();
		
		int y = size.height / 2;
		int start_x = (int)(size.width * inicio); 
		int end_x = (int)(size.width * fim); 
		
		new TouchAction(getDriver())
		.press(PointOption.point(start_x, y))
		.waitAction()
		.moveTo(PointOption.point(end_x, y))
		.release()
		.perform();
	}
	
	public void swipeElemento(MobileElement elemento, double inicio, double fim) {
		int y = elemento.getLocation().y + (elemento.getSize().height / 2);
		
		int start_x = (int)(elemento.getSize().width * inicio); 
		int end_x = (int)(elemento.getSize().width * fim); 
		
		new TouchAction(getDriver())
		.press(PointOption.point(start_x, y))
		.waitAction()
		.moveTo(PointOption.point(end_x, y))
		.release()
		.perform();
	}
	
}
