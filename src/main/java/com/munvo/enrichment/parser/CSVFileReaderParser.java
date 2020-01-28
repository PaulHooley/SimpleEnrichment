package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;

public class CSVFileReaderParser implements FileReaderParser {

	@Override
	public Subscriber parseSubscriber(String subLine) {
		String[] parsedLine = subLine.split(",");
		if(parsedLine.length < 3){
			throw new IllegalArgumentException("Invalid CSV Lenght");
		}
		try{
			int id = Integer.parseInt(parsedLine[0]);
			return new Subscriber(id, parsedLine[1], parsedLine[2]);
		} catch(NumberFormatException e){
			throw new NumberFormatException(e.getMessage());
		}
		
	}
	
}