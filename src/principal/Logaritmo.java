package principal;

public class Logaritmo extends Expression{
	
	private Expression izquierdo;
	
	public Logaritmo(Expression exp){
		this.izquierdo = exp;
	}
	
	@Override
	public double evaluar(double valores[]) {
		return Math.log(izquierdo.evaluar(valores));
	}


}
