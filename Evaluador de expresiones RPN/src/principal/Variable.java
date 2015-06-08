package principal;

public class Variable extends Expression{
	private char var;
	
	public Variable(char var){
		this.var = var;
	}
	
	@Override
	public double evaluar(double valores[]) {
		try {
			//Solo sirve para 3 variables, suponiendo que vengan en orden
			if(var == 'x')
				return valores[0];
			if(var == 'y')
				return valores[1];
			return valores[2];
		} catch (NullPointerException e) {
			System.out.println("Error: la expresion contiene variables, pero no se recibieron la cantidad de valores suficientes.");
			System.exit(0);
			return 0;
		}
	}
	
	public char getVar(){
		return this.var;
	}
	
}