package srp;

public class CalculadoraImc {
	
	private Double peso; 
	private Double altura;
	
	private Double calcular() {
		return peso/Math.pow(altura, 2);
	}
	
	public String status() {
		
		String resultado = "";
		Double calculoFinal = calcular();
		
		if (calculoFinal < 18.5) {
			resultado = "Abaixo do peso";
		} else if (calculoFinal >= 18.5 && calculoFinal <= 24.9) {
			resultado = "Peso normal";
		} else if (calculoFinal >= 25.0 && calculoFinal <= 29.9) {
			resultado = "Sobrepeso";
		} else if (calculoFinal >= 30.0 && calculoFinal <= 34.9) {
			resultado = "Obesidade Grau 1";
		} else if (calculoFinal >= 35.0 && calculoFinal <= 39.9) {
			resultado = "Obesidade Grau 2";
		} else if (calculoFinal > 40.0) {
			resultado = "Obesidade Grau 3 ou Mórbida";
		} 
		
		return resultado;
		
	}
	
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
}
