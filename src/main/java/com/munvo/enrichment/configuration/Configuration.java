package com.munvo.enrichment.configuration;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public final class Configuration {

    private String studentName;
    private String type;
    private String fileName;
    
    private static final Configuration CONFIGURATION = new Configuration();

    private Configuration() {
        Config config = ConfigFactory.load();
        this.studentName = config.getString("name");
        this.type = config.getString("type");
        this.fileName = config.getString("fileName");
    }
    
    /**
     * 
     * @return Returns the configuration instance
     */
    public static Configuration getConfiguration() {
    	return CONFIGURATION;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getType() {
        return type;
    }

    public String getFileName() {
        return fileName;
    }
}