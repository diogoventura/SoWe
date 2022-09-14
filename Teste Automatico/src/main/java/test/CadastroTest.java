package test;

import java.net.MalformedURLException;

import org.junit.Test;

import page.CampoPage;
import page.ClicksPage;
import page.TextsPage;

public class CadastroTest {

	private TextsPage text = new TextsPage();
	private ClicksPage click = new ClicksPage();
	private CampoPage field = new CampoPage();

	// Dados
	String stringFone = "81982221104";
	String button1 = "Cadastrar";
	String fieldName = "Diogo Ventura De Almeida";
	String codeNumber = "111111";
	String button2 = ">";
	String button3 = "LOCALIZAÇÃO AUTOMÁTICA";
	String button4 = "Sim";
	String button5 = "Entrar";
	String title1 = "Explore climas locais socialmente, com o Sowe";
	String description1 = "Saiba quantas pessoas próximas a você reportaram chuva e receba um aviso antes de sair de casa.";
	String title2 = "Celular";
	String description2 = "Você receberá um código de confirmação no número de telefone celular informado.";
	String title3 = "Código de confirmação";
	String title4 = "Nome";
	String title5 = "Localização";
	String description3 = "Para entregarmos informações mais precisas sobre o seu micro-clima, precisamos utilizar a sua localização automática";
	String title6 = "Compartilhar a localização";
	String description4 = "Blablabla, enquanto usa o app. Lorem ipsum dolor sit amet.";
	String text1 = "SoWe";
	String text2 = "Sair";

	@Test
	public void checktextLauncher() throws MalformedURLException {
		text.checkText(title1);
		text.checkText(description1);
		text.checkText(button1);
		text.checkText(button5);
	}

	@Test
	public void putNumber() throws MalformedURLException {
		click.clickText(button1);
		text.checkText(title2);
		text.checkText(description2);
		field.putFone(stringFone);
		text.checkText(stringFone);
		click.clickText(button2);
	}

	@Test
	public void code() throws MalformedURLException {
		putNumber();
		text.checkText(title3);
		field.putCode(codeNumber);
		text.checkText(codeNumber);
	}

	@Test
	public void name() throws MalformedURLException {
		putNumber();
		code();
		text.checkText(title4);
		field.putName(fieldName);
		text.checkText(fieldName);
		click.clickText(button2);
	}

	@Test
	public void location() throws MalformedURLException {
		putNumber();
		code();
		name();
		text.checkText(title5);
		text.checkText(description3);
		click.clickText(button3);
		text.checkText(title6);
		text.checkText(description4);
		click.clickText(button4);
		text.checkText(text1);
		text.checkText(text2);
	}
}
