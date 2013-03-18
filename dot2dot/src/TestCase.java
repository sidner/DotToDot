

import java.io.IOException;
import java.text.ParseException;

import org.junit.Test;

public class TestCase {

@Test
	public void semTypes() throws ParseException, IOException, Throwable{
		String texto1[] = new String[1]; 
				texto1[0]="src/texto1.dot";
		
		
			Dot2Dot.main(texto1);
		
		
	}
	
	
	@Test
	public void comTypes() throws ParseException, IOException, Throwable{
		String texto2[] = new String[1]; 
				texto2[0]="src/texto2.dot";
		
		
			Dot2Dot.main(texto2);
		
		
	}

}
