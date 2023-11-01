package py.com.semp.lib.log.internal;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Locale;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MessagesTest
{
	private Locale originalLocale;
	
	@BeforeEach
	void setUp()
	{
		this.originalLocale = Locale.getDefault();
	}
	
	@AfterEach
	void tearDown()
	{
		MessageUtil.setLocale(this.originalLocale);
	}
	
	@Test
	void testSpanish()
	{
		MessageUtil.setLocale(new Locale("es"));
		
		String message = MessageUtil.getMessage(Messages.INVALID_NAME_ERROR, (Object)null);
		
		assertNotNull("Nombre inválido: 'null'.", message);
	}
	
	@Test
	void testEnglish()
	{
		MessageUtil.setLocale(Locale.ENGLISH);
		
		String message = MessageUtil.getMessage(Messages.INVALID_NAME_ERROR, (Object)null);
		
		assertNotNull("Invalid name: 'null'.", message);
	}
}