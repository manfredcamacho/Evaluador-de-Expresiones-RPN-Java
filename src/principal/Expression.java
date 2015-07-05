package principal;

public class Expression {
	
	public double evaluar(double valor[]){
		return  this.evaluar(valor);
	}
	
	public static Expression parseTermino(String cad){
		return  new Termino(Double.parseDouble(cad));		
	}
	
	public static Expression parseVariable(String cad){
		return  new Variable(cad.charAt(0));		
	}
}
