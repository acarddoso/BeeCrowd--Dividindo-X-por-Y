package DividirXporY;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat; 


public class App 
{
	public static String calculo(double x, double y){
		String frase = "";

		if (y == 0){
			frase = "divisao impossivel";
		}
		else {
			DecimalFormat df = new DecimalFormat("#,###.00");
			frase =""+df.format(x/y); 

		}
		return frase;
	}
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
		int n;
		double x, y;
		
		n = sc.nextInt();
		
		while (n > 0){
			x = sc.nextDouble();
			y = sc.nextDouble();
			System.out.print(calculo(x,y));
			n = n - 1;
		}
		sc.close();
    }
}
