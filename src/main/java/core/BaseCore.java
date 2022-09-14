package core;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class BaseCore {

	// clicar no botão
	public void click(By by) {
		getDriver().findElement(by).click();
	}

	// verificar um texto
	public String checkTexts(By by) {
		return getDriver().findElement(by).getText();
	}
	
	//escrever
	public void write(By by, String text) {
		getDriver().findElement(by).sendKeys(text);
	}
	
	//clicar por coordenada
	public void tap(int x, int y) {
		new TouchAction<>(getDriver())
			.tap(PointOption.point(new Point(x, y)))
			.perform();
	}
}
