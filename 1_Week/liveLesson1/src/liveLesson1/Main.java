package liveLesson1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!");
		
		// Değişken isimleri Java'da camelCase yazılır
		
		String ortaMetin = "ilginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		
		// integer
		
		int vade = 12;
		
		double dolarDun = 18.14;
		double dolarBugun = 18.10;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
			
		
		// İf - Else
		
		System.out.println("İf - Else");

		
		if (dolarBugun < dolarDun) {
			okYonu = "down.swg";
			System.out.println(okYonu);
		} else if(dolarBugun > dolarDun) {
			okYonu = "up.swg";
			System.out.println(okYonu);
		}else {
			okYonu = "equal.swg";
			System.out.println(okYonu);
		}
		
		
		// array
		
		System.out.println("Array");

		
		String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli"};
		
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		
		// For loop
		
		System.out.println("For loop");
		
		for(int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
	}

}
