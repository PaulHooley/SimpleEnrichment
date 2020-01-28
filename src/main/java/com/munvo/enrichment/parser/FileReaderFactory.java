package com.munvo.enrichment.parser;

public class FileReaderFactory {
    public FileReaderParser createParser(String type) {
        if (type.equals("CSV")) {
            return new CSVFileReaderParser();
        } else if (type.equals("JSON")) {
            return new JSONFileReaderParser();
        } else {
            return null;
        }
    }
}