package sgcib.eliot.ewos.datalake.HBernate_orm.services;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.IOException;

import org.junit.Test;

public class XmlToJSONTest {

	private static final String CONFIG_FILE_NAME = "config.xml";
	private static final String FAKE_CONFIG_FILE_NAME = "fakeConfig.xml";

	@Test
	public void testingFileExists() throws IOException {
		assertNotNull(XmlToJSON.xmlToJSON(CONFIG_FILE_NAME));
	}

	@Test
	public void testingFileNotExists() {
		try {
			assertNull(XmlToJSON.xmlToJSON(FAKE_CONFIG_FILE_NAME));
		} catch (IOException e) {

		}
	}

}
