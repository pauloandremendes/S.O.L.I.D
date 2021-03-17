package dip;

public interface Lampada Implements AparelhoAcionar {
	
	String acao1 = "Ligar";
	String acao2 = "";
	
	if (acao1 == "Ligar") {
		acao2 = "Lampada ligada";
 } else acao2 = "Lampada desligada";	
	
	return acao2;

}
