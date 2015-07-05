package principal;

public class Termino extends Expression{
	private double valor;

	public Termino(double valor){
		this.valor = valor;
	}
	
	@Override
	public double evaluar(double valores[]) {		
		return valor;
	}
	
	
}
