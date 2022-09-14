package test;

import java.net.MalformedURLException;

import org.junit.Test;

import page.ClicksPage;
import page.TextsPage;

public class OutAndBack {

	private ClicksPage click = new ClicksPage();
	private CadastroTest dado = new CadastroTest();
	private TextsPage text = new TextsPage();

	@Test
	public void checktexts() throws MalformedURLException {
		click.clickText(dado.text2);
		click.clickText(dado.button5);
		text.checkText(dado.text1);
		text.checkText(dado.text2);
	}

}
