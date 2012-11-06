package com.dearshor.research.testdrive;

import java.io.File;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.myschema.JobSchedulingData;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringMarshallingTests {

	private static final String FILE_NAME = "settings.xml";
	private String settingsDir;
	private File settingsFile;

	@Autowired
	private MarshallingService marshallingService;

	private JobSchedulingData jobSchedulingData;

	@PostConstruct
	public void setup() {
		jobSchedulingData = new JobSchedulingData();
//		jobSchedulingData.getPreProcessingCommandsAndProcessingDirectivesAndSchedule()
		
		
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
		marshallingService.saveSettings(settingsFile, jobSchedulingData);
	}

	@Test
	public void testLoadSettings() throws IOException {
		marshallingService.loadSettings(settingsFile, jobSchedulingData);
	}

}
