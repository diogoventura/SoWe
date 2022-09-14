package test;

import java.net.MalformedURLException;

import org.junit.Test;

import page.ClicksPage;
import page.TextsPage;

public class LauncherTest {

	private TextsPage text = new TextsPage();
	private ClicksPage click = new ClicksPage();
	private CadastroTest dado = new CadastroTest();

	@Test
	public void verificarTextos() throws MalformedURLException {
		click.clickText(dado.button5);
		text.checkText(dado.text1);
		text.checkText(dado.text2);
	}

	@Test
	public void compartilhar() throws MalformedURLException {
		click.clickText(dado.button5);
		click.tap(540, 2083);
		click.clickText(dado.button4);
	}
}
