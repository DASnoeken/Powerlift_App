package PowerLifters.PowerLiften;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import PowerLifters.PowerLiften.domein.Voortgang;

@SpringBootTest
class PowerLiftenApplicationTests {

	@Test
	void contextLoads() {
		int a = 2;
		Voortgang v = new Voortgang();
		v.setLiftaantal(-35);
		Assertions.assertEquals(v.getLiftaantal(),-35);
		v.setAntwoorden("hoi");
		Assertions.assertEquals(v.getAntwoorden(),"hoi");
	}

}
