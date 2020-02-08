package br.com.codenation.calculadora;

public class CalculadoraSalario {

	/*public static void main(String[] args) { 
		
		CalculadoraSalario calcSalario;
		calcSalario = new CalculadoraSalario();
		long liquidoReal = calcSalario.calcularSalarioLiquido(1320);
	
	}*/
				
	private double variavelGloba;
	
	public long calcularSalarioLiquido(double salarioBase) {
		 if (teste(salarioBase) == 0.0) {
			 System.out.println(0);	 
			 return (0);
			 }
		 this.variavelGloba = salarioBase;
		 
		 double valorInss = calcularInss(salarioBase);
		 double semiLiquido = salarioBase - valorInss ;
		 double valorIrrf = calcularIrrf(semiLiquido);
		 double liquidoReal = semiLiquido - valorIrrf;
		 
		 
		 System.out.println ("O salário com os descontos é: R$ "+ liquidoReal);
		 return Math.round(liquidoReal);

		 
	}
	
	private double teste(double salarioBase) {
		if (salarioBase<1032) {
			return (0.0);}
		
			else  {
				return salarioBase;
			
		}
	}
	
	
	private double calcularInss(double salarioCheio) {
		
		if (salarioCheio<= 1500) {
			return (salarioCheio*.08); }
		
		else if (salarioCheio>= 1500.01 && salarioCheio<=4000) {
			return (salarioCheio*.09); }
		
		else {
			return (salarioCheio*.11); }
			
		
			}
	
	private double calcularIrrf(double salarioMenosInss) {
		
		if (salarioMenosInss<= 3000) {
			return 0.00; }
		
		else if (salarioMenosInss>= 3000.01 && salarioMenosInss<=6000) {
			return (salarioMenosInss*.075); }
		
		else {
			return (salarioMenosInss*.15); }
		
		
			
		
			}

}
