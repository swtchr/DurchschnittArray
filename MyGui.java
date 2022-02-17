import java.util.Scanner;

public class MyGui{
	
	Scanner tastatur=new Scanner(System.in);
	
	public MyGui(){}
	
	public int eingabeLaenge(){
		
		int laenge=0;
		
		System.out.println("Geben Sie die Laenge des Arrays ein");
		laenge=tastatur.nextInt();
		
		return laenge;
	}
	
	public int eingabeUntereGrenze(){
		
		int untereGrenze=0;
		
		System.out.println("Geben Sie den Bereich der Zufallszahlen ein, untere Grenze:");
		untereGrenze=tastatur.nextInt();
		
		return untereGrenze;
	}
	
	public int eingabeObereGrenze(){
		
		int obereGrenze=0;
		
		System.out.println("Geben Sie den Bereich der Zufallszahlen ein, obere Grenze:");
		obereGrenze=tastatur.nextInt();
		
		return obereGrenze;
	}
	
	public void ausgabeRandom(int[] array){
		
		for(int i=0; i<array.length; i++)
		{
			if(i<array.length-1)
				System.out.print(array[i]+" ");
			else
				System.out.println(array[i]+" ");
		}
	}
	
	public void ausgabeMinimum(int minimum){
	
		System.out.println("Minimum:"+minimum);
	}
	
	public void ausgabeMaximum(int maximum){
	
		System.out.println("Maximum:"+maximum);
	}
}