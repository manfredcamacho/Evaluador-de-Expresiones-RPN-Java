package principal;

import java.util.Stack;

public class Funcion {
	
	private String rpn[];
	private Expression expresion;
	
	public Funcion(String rpn){
		this.rpn = rpn.split(" ");
		resolver();
	}
	
	public void resolver(){
		
		Stack<Expression> pila = new Stack<Expression>();
		for (int i = 0; i < rpn.length; i++) {
			if(rpn[i].equals("+")){
				Expression exp1 = pila.pop();
				Expression exp2 = pila.pop();
				Expression suma = new Suma(exp2, exp1);
				pila.push(suma);
			}
			else if(rpn[i].equals("-")){
				Expression exp1 = pila.pop();
				Expression exp2 = pila.pop();
				Expression resta = new Resta(exp2, exp1);
				pila.push(resta);
			}
			else if(rpn[i].equals("*")){
				Expression exp1 = pila.pop();
				Expression exp2 = pila.pop();
				Expression multiplicar = new Multiplicacion(exp2, exp1);
				pila.push(multiplicar);
			}
			else if(rpn[i].equals("/")){
				Expression exp1 = pila.pop();
				Expression exp2 = pila.pop();
				Expression dividir = new Division(exp2, exp1);
				pila.push(dividir);
			}
			else if(rpn[i].equals("^")){
				Expression exp1 = pila.pop();
				Expression exp2 = pila.pop();
				Expression potencia = new Potencia(exp2, exp1);
				pila.push(potencia);
			}
			else if(rpn[i].equals("ln")){
				Expression exp = pila.pop();
				Expression logaritmo = new Logaritmo(exp);
				pila.push(logaritmo);
			}
			else{
				if(rpn[i].equals("x") || rpn[i].equals("y") || rpn[i].equals("z")){
					pila.push(Expression.parseVariable(rpn[i]));
				}
				else
					pila.push(Expression.parseTermino(rpn[i]));
			}
		}
		
		expresion = pila.pop();
	}
	
	public double evaluar( double valores[]){
		return this.expresion.evaluar(valores);
	}
	
	public double evaluar(){
		return this.expresion.evaluar(null);
	}
}
