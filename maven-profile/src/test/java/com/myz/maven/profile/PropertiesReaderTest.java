package com.myz.maven.profile;

import org.junit.Test;

import java.util.Properties;

/**
 * Created by yzMa on 2020/3/22.
 */
public class PropertiesReaderTest {

    @Test
    public void getString(){
        Properties properties = PropertiesReader.readFile("Test.properties");
        System.out.println(properties.getProperty("key"));
    }
}
