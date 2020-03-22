package com.myz.maven.profile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by yzMa on 2020/3/22.
 */
public class PropertiesReader {

    private static Properties properties = null;

    /**
     * @description //TODO
     * @author yzMa
     * @date 下午6:06 2020/3/22
     */
    public static Properties readFile(String fileName){
        InputStream ins = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        properties = new Properties();

        try {
            properties.load(ins);
            return properties;
        } catch (IOException e) {
            e.printStackTrace();
            properties = null;
        }finally {
            if(ins!=null) {
                try {
                    ins.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return properties;
        }
    }

}
