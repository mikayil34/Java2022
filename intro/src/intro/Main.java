package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		String ortaMetin = "ilginizi çekebilir";
		System.out.println(ortaMetin);
		String altMetin = "Vade Süresi";
		System.out.println(altMetin);
		int vade = 12;
		double dolarDun = 22.07;
		double dolarBugun = 22.00;
		boolean dolarDustuMu = false;
		String okYonu = "";

		if (dolarDun > dolarBugun) {
			okYonu = "down.svg";
			System.out.println(okYonu);

		} else if (dolarDun < dolarBugun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);

		}

		String[] krediler = { "Hızlı kredi", "Maaşını halkbank", "mütlu Kredi" };
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
