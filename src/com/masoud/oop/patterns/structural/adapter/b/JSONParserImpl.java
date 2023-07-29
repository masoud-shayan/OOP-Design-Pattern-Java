package com.masoud.oop.patterns.structural.adapter.b;

public class JSONParserImpl implements JSONParser{
    @Override
    public void parseJSON(String json) {
        System.out.println(">>>> parse JSON String .......");
    }
}
