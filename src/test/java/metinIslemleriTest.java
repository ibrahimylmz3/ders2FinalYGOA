import org.junit.Assert;
import org.junit.Test;

public class metinIslemleriTest {

	@Test
	public void testBuyukHarf() {
		String sonuc = metinIslemleri.buyukHarf("okul");
		Assert.assertEquals("OKUL", sonuc);
	}

}
