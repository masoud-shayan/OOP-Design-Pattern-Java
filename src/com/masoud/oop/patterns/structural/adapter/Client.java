package com.masoud.oop.patterns.structural.adapter;

import com.masoud.oop.patterns.structural.adapter.a.XMLParser;
import com.masoud.oop.patterns.structural.adapter.b.JSONParserImpl;
import com.masoud.oop.patterns.structural.adapter.c.JSONToXMLAdapter;

public class Client {
    public static void main(String[] args) {
        XMLParser xmlParser = new JSONToXMLAdapter(new JSONParserImpl());
        xmlParser.parseXML("<xml>Data</xml>");
    }
}
