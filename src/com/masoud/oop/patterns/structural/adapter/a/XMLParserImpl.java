package com.masoud.oop.patterns.structural.adapter.a;

public class XMLParserImpl implements XMLParser{

    @Override
    public void parseXML(String xml) {
        System.out.println(">>>> parse XML String .......");
    }
}
