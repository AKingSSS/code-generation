package com.aking.code.utils;

import com.aking.code.entity.Properties;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public class YamlUtils {
    private static final Yaml yaml = new Yaml();
    private static InputStream inputStream;
    private static final String PATH = "/application.yml";
    private static final Properties properties;
    static {
        inputStream = YamlUtils.class.getResourceAsStream(PATH);
        properties = yaml.loadAs(inputStream,Properties.class);
    }

    public static Properties getProperties(){
        return properties;
    }

}
