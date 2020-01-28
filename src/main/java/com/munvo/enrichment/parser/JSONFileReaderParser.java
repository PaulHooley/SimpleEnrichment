package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class JSONFileReaderParser implements FileReaderParser {

    @Override
    public Subscriber parseSubscriber(String subLine) {
        Config conf = ConfigFactory.parseString(subLine);
        
        int id = conf.getInt("id");
        String name = conf.getString("name");
        String phone = conf.getString("phone");   

        return new Subscriber(id,name,phone);
    }

}