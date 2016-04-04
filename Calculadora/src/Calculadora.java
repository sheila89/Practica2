
public class Calculadora {
	int numero;
	int numero2;
	public Calculadora(int n1, int n2){
		numero=n1;
		numero2=n2;
	}
	public int suma(){
		return numero+numero2;
	}
	public int resta(){
		return numero-numero2;
	}
	public int multiplicar(){
		return numero*numero2;
	}
	public double division(){
		return (double)this.numero/this.numero2;
	}
}
