import java.util.Scanner;

public class Ex11{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 4 números:");
		Float num1 = scan.nextFloat();
		Float num2 = scan.nextFloat();
		Float num3 = scan.nextFloat();
		Float num4 = scan.nextFloat();
		
		Float result = (num1 + num2 + num3 + num4) / 4;
		
		System.out.println("A média é: " + result);
		
	}
	
}