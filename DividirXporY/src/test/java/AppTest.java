package DividirXporY;
import java.io.IOException;
import java.util.Scanner;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;
public class AppTest 
{
	private App app = new App();
   @Test
   public void calcularValores(){
		assertThat(app.calculo(4,2), containsString("2,00"));
   }

}
