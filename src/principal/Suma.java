package principal;

public class Suma extends Expression{
	
	private Expression izquierdo;
	private Expression derecho;	
	
	public Suma(Expression exp1, Expression exp2){
		this.izquierdo = exp1;
		this.derecho = exp2;
	}
	
	public double evaluar(double valores[]) {
		return izquierdo.evaluar(valores) + derecho.evaluar(valores);
	}
	
}
