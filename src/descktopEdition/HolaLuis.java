package descktopEdition;

import java.util.*;

public class HolaLuis {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Hola Luis dame un numero entero postivo ");
		int a = Integer.parseInt(s.nextLine());
		System.out.println("Hola Luis dame otro numero entero postivo ");
		int b = Integer.parseInt(s.nextLine());
		System.out.print("El resultado de sumar "+a+" + "+b+" es = ");
		System.out.print(sumar(a,b));
	}
	
	
	public static int sumar(int a , int b) {
		return (a+b);
	}

}
