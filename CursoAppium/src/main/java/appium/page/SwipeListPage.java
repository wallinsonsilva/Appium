package appium.page;

import static appium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import appium.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeListPage extends BasePage {
	
	public void swipeElementLeft(String opcao) {
		swipeElemento(getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.1, 0.9);
	}
	
	public void swipeElementRigth(String opcao) {
		swipeElemento(getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.9, 0.1);
	}
	
	public void clicarBotaoMais() {
		MobileElement findElement = getDriver().findElement(By.xpath("//*[@text='(+)']/.."));
		new TouchAction(getDriver())
		.press(PointOption.point(findElement.getCenter().x-50, findElement.getCenter().y))
		.release()
		.perform();
	}

}
