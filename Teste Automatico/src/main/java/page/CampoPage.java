package page;

import core.BaseCore;
import io.appium.java_client.MobileBy;

public class CampoPage extends BaseCore {

	// Dados
	String fieldFone = "insira o numero de celular";
	String codeNumber = "111111";
	String fieldName = "Diogo Ventura De Almeida";

	// Preencher campo fone
	public void putFone(String fone) {
		write(MobileBy.AccessibilityId(fieldFone), fone);
	}

	// Preencher campo code
	public void putCode(String cone) {
		write(MobileBy.AccessibilityId(codeNumber), cone);
	}

	// Preencher campo name
	public void putName(String name) {
		write(MobileBy.AccessibilityId(fieldName), name);
	}
}
