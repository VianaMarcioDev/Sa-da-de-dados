import java.util.Locale;

public class DeclaracaoVariaveis {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.println(x);
		System.out.println("Bom dia!");
		System.out.printf("%.2f", x);
		Locale.setDefault(Locale.US);
		System.out.print(x);

	}

}
