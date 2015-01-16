
public class Tesoreria {
	
	
	
	
	public static void main(String args[]){
		
		int ingresos[] = {10,40,60,120,3};
		int balance=0;
		int gastos[] = {-5,-120,-65};
		
		for (int i=0;i<ingresos.length;i++){
			balance = balance + ingresos[i];
		}
		for (int i=0;i<gastos.length;i++){
			balance = balance + gastos[i];
			
		}
		
		System.out.println("Calculo: " +balance);
	}

}
