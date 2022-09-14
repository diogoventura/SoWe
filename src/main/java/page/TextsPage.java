package page;

import org.openqa.selenium.By;

import core.BaseCore;
import io.appium.java_client.MobileBy;

public class TextsPage extends BaseCore {

	// textos
	String title1 = "Explore climas locais socialmente, com o Sowe";
	String description1 = "Saiba quantas pessoas próximas a você reportaram chuva e receba um aviso antes de sair de casa.";
	String title2 = "Celular";
	String description2 = "Você receberá um código de confirmação no número de telefone celular informado.";
	String stringFone = "81982221104";
	String codeNumber = "111111";
	String fieldName = "Diogo Ventura De Almeida";
	String title3 = "Localização";
	String title4 = "Nome";
	String description3 = "Para entregarmos informações mais precisas sobre o seu micro-clima, precisamos utilizar a sua localização automática";
	String title5 = "Compartilhar a localização";
	String description4 = "Blablabla, enquanto usa o app. Lorem ipsum dolor sit amet.";
	String button1 = "Cadastrar";
	String button2 = "Entrar";

	// Verificar botão do texto
		public void checkText(String text) {
			checkTexts(By.xpath("//*[@text='" + text + "']"));
		}
}
