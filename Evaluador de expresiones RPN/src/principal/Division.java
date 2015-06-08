package principal;

public class Division extends Expression{
	
	private Expression izquierdo;
	private Expression derecho;	
	
	public Division(Expression exp1, Expression exp2){
		this.izquierdo = exp1;
		this.derecho = exp2;
	}
	
	@Override
	public double evaluar(double valores[]) {
		return izquierdo.evaluar(valores) / derecho.evaluar(valores);
	}
}
