package com.masoud.oop.patterns.structural.adapter.c;

import com.masoud.oop.patterns.structural.adapter.a.XMLParser;
import com.masoud.oop.patterns.structural.adapter.b.JSONParser;

public class JSONToXMLAdapter implements XMLParser {

    private JSONParser jsonParser;

    public JSONToXMLAdapter(JSONParser jsonParser) {
        this.jsonParser = jsonParser;
    }


    @Override
    public void parseXML(String xml) {
        // Convert XML to JSON
        String json = convertXMLtoJSON(xml);

        // Use the JSONParser to parse the JSON
        jsonParser.parseJSON(json);
    }

    private String convertXMLtoJSON(String xml) {
        // Conversion logic from XML to JSON
        System.out.println("Converting XML to JSON: " + xml);
        return "<json>Data</json>";
    }
}
