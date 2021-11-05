package appium.page;

import static appium.core.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;

import appium.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class DragAndDropPage extends BasePage {
	
	public void arrastar(String origem, String destino) {
		MobileElement inicio = getDriver().findElement(By.xpath("//*[@text='"+origem+"']"));
		MobileElement fim = getDriver().findElement(By.xpath("//*[@text='"+destino+"']"));
		
		new TouchAction(getDriver())
			.longPress(PointOption.point(inicio.getCenter().x, inicio.getCenter().y))
			.moveTo(PointOption.point(fim.getCenter().x, fim.getCenter().y))
			.release()
			.perform();
		
	}
	
	public String[] obterLista() {
		List<MobileElement> elements = getDriver().findElements(By.className("android.widget.TextView"));
		String retorno[] = new String[elements.size()];
		for (int i = 0; i < retorno.length; i++) {
			retorno[i] = elements.get(i).getText();
		}
		return retorno;
	}

}
