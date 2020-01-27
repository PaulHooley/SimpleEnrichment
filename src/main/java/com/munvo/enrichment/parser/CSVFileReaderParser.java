package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;

public class CSVFileReaderParser implements FileReaderParser {

	@Override
	public Subscriber parseSubscriber(String subLine) {
		String[] parsedLine = subLine.split(",");
		int id = Integer.parseInt(parsedLine[0]);
		
		return new Subscriber(id, parsedLine[1], parsedLine[2]);
	}
	
}