package com.dearshor.research.testdrive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import mytld.mycompany.myapp.Settings;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringMarshallingTests {

	private static final String FILE_NAME = "settings.xml";
	private String settingsDir;
	private File settingsFile;

	@Autowired
	private MarshallingService marshallingService;

	private Settings settings = new Settings();

	@PostConstruct
	public void setup() {
		if (StringUtils.isEmpty(settingsDir)) {
			File defaultSettingsDir = new File(new StringBuilder(
					System.getProperty("user.dir")).append(File.separator)
					.append("target").append(File.separator).append("conf")
					.toString());
			settingsFile = new File(defaultSettingsDir, FILE_NAME);
		} else {
			settingsFile = new File(new StringBuilder(settingsDir)
					.append(File.separator).append(FILE_NAME).toString());
		}
		if (!settingsFile.getParentFile().exists()) {
			settingsFile.getParentFile().mkdirs();
		}
	}

	@Test
	public void testSaveSettings() throws IOException {
		marshallingService.saveSettings(settingsFile, settings);
	}

	@Test
	public void testLoadSettings() throws IOException {
		marshallingService.loadSettings(settingsFile, settings);
	}

}
