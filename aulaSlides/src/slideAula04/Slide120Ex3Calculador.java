package slideAula04;

public class Slide120Ex3Calculador {

	//Atributos
	private double num1;
	private double num2;
	private  int operador;
	private  double resp;
	
	//Contrutor
	public Slide120Ex3Calculador() {
	}

	//Metodos
	private double calc () {
		resp = (operador == 1) ? (num1+num2) : 
			   (operador == 2) ? (num1-num2) :
			   (operador == 3) ? (num1*num2) :
			   (operador == 4) ? (num1/num2) :
			    null;
		return resp;
	}
	public String opesc () {
		String op = (operador == 1) ? "+" : 
			   		(operador == 2) ? "-" :
			   		(operador == 3) ? "x" :
			   		(operador == 4) ? "/" :
			   		null;
		return op;
	}
	
	//Getters e Setters
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public int getOperador() {
		return operador;
	}

	public void setOperador(int operador) {
		this.operador = operador;
		calc();
	}

	public double getResp() {
		return resp;
	}
}