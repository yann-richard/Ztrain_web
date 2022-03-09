package com.Ztrain.runners;

import com.Ztrain.config.Properties;
import com.Ztrain.utils.AllureFileManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
//import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

public class BaseRunner extends AbstractTestNGCucumberTests {


    @Parameters({"browser", "device"})
    @BeforeClass
    public static void beforeTest(@Optional String browser, @Optional String device){
        String browserA;

        browserA = java.util.Optional
                .ofNullable(browser)
                .orElse(Properties.Config.getBrowser());

        Properties.DriverManager.setDriver(browserA);
    }

    @AfterClass
    public static void tearDown() throws IOException {
//        AllureFileManager.createEnvironmentPropertiesFile();
//        AllureFileManager.createCategorieJsonFile();
//        AllureFileManager.createExecutorJsonFile();
        Properties.DriverManager.getDriver().quit();
    }

}
