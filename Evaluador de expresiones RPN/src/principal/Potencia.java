package principal;

public class Potencia extends Expression{
	
	private Expression izquierdo;
	private Expression derecho;	
	
	public Potencia(Expression exp1, Expression exp2){
		this.izquierdo = exp1;
		this.derecho = exp2;
	}
	
	@Override
	public double evaluar(double valores[]) {
		return Math.pow(izquierdo.evaluar(valores), derecho.evaluar(valores));
	}


}
