package projetX;

import java.util.InputMismatchException;
import java.util.Scanner;


public class XClass {
	
	int result=0;
	static float tempInput=0;
	
	private static int step1(Scanner sc){
		
		System.out.println("Choisissez le mode de conversion:" +"\n" + "c to f tapez 1" +"\n" + "f to c tapez 2");
		int result=0;
			try{result=sc.nextInt();} 
				catch(InputMismatchException ime){
				System.out.println("Entrez une valeur correcte \n");
				result=0;};
		return result;
		
	};
	
	private static float step2(Scanner sc){
		
		System.out.println("Entrez la temp a convertir:" +"\n");
		float tempInput=0;
		tempInput=sc.nextFloat();
		return tempInput;
		
	};
	
	private static float convertFromCtoF(float tempInput){
		float tempConverted;
		
		tempConverted= (((float) 9/(float) 5)*tempInput)+32;
		return tempConverted;
		
	};
	
	private static float convertFromFtoC(float tempInput){
		float tempConverted2;
		
		tempConverted2 = (tempInput-32)*((float) 5/ (float) 9);
		
		return tempConverted2;

	};
	
	private static String step4(Scanner sc){
		sc.nextLine();
		System.out.println("do you want to continue ? o/n" +"\n");
		String result="";
		try{result=sc.nextLine();} 
			catch(InputMismatchException ime){
			System.out.println("Entrez une valeur correcte \n");
			result="";};
		return result;
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean exit=false;
		Scanner sc = new Scanner(System.in);
		
		while(!exit){
			
				int i;
		
				
				/* Step 1 */
				i = step1(sc);
				while(i!=1 && i!=2) 
					{
					sc = new Scanner(System.in);
					i=step1(sc);
					}
				/* Step 2 */
				try{tempInput = step2(sc);}
					catch(InputMismatchException ime){
						System.out.println("Entrez une température valable \n");
				
				}
				
				/* Step 3 */
				if (i==1) {
					float newTemp = convertFromCtoF(tempInput);
					System.out.println(tempInput +" C = " + String.valueOf(newTemp) + "F \n");
				}
				else if (i==2) {
					float newTemp = convertFromFtoC(tempInput);
					System.out.println(tempInput + " F = " + String.valueOf(newTemp) + "C \n");
				}
				
				/* Step 4*/
				String res = "";
				while(!res.equals("o") && !res.equals("y") && !res.equals("n")) res=step4(sc);
				if(res.equals("n")) exit=true;
		}
		
		sc.close();
		
	}

}
