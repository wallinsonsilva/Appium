package appium.page;

import static appium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import appium.core.BasePage;
import appium.core.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class FormularioPage extends BasePage {
	
	public void escreverNome(String nome) {
		escrever(MobileBy.AccessibilityId("nome"), nome);
	}
	
	public String obterNome() {
		return obterTexto(MobileBy.AccessibilityId("nome"));
	}
	
	public void selecionarCombo(String valor) {
		selecionarCombo(MobileBy.AccessibilityId("console"), valor);
	}
	
	public String obterValorCombo() {
		return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	}
	
	public void clicarCheckbox() {
		clicar(By.className("android.widget.CheckBox"));
	}
	
	public boolean isCheckMarcado() {
		return isCheckMarcado(By.className("android.widget.CheckBox"));
	}
	
	public boolean isSwitchMarcado() {
		return isSwitchMarcado(MobileBy.AccessibilityId("switch"));
	}
	
	public void clicarSwitch() {
		clicar(MobileBy.AccessibilityId("switch"));
	}
	
	public void clicarBotaoSalvar() {
		clicar(MobileBy.AccessibilityId("save"));
	}
	
	public void clicarBotaoSalvarDemorado() {
		clicarPorTexto("SALVAR DEMORADO");
	}
	
	public String obterNomeCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Nome:')]"));
	}
	
	public String obterNomeConsoleCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Console')]"));
	}
	
	public boolean obterValorCheckbox() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]")).endsWith("Off");
	}
	
	public boolean obterValorSwitch() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]")).endsWith("Marcado");
	}
	
	public void clicarSeekBar(double posicao) {
		int delta = 60;
		
		MobileElement seek = getDriver().findElement(MobileBy.AccessibilityId("slid"));
		
		int y = seek.getCenter().getY();
		
		int xinicial = seek.getLocation().x + delta;
		int x = (int) (xinicial + ((seek.getSize().width-(2*delta))*posicao));
		
		pressMove(xinicial, y, x, y);
		
	}

}
