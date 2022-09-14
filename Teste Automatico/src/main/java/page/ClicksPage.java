package page;

import org.openqa.selenium.By;

import core.BaseCore;

public class ClicksPage extends BaseCore {

	// botão por texto
	public void clickText(String text) {
		click(By.xpath("//*[@text='" + text + "']"));
	}
	
	// botão por coordenada
	public void clicarForaCaixa(int x,int y){
		tap(x, y);
	}
}
