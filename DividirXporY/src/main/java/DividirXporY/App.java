package DividirXporY;
import java.io.IOException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
		int n;
		double x, y;
		
		n = sc.nextInt();
		
		while (n > 0){
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			if (y == 0){
				System.out.println("divisao impossivel");
			}
			else {
				System.out.printf("%.1f\n",x/y);
			}
			n = n - 1;
		}
		sc.close();
    }
}
