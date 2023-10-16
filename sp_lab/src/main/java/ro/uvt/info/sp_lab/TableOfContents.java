package ro.uvt.info.sp_lab;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class TableOfContents {
    Dictionary<String, String> dict= new Hashtable<>();

    public TableOfContents(Dictionary<String, String> dict) {
        this.dict = dict;
    }

    public void print() {
        System.out.println("Table of Contents:");
        Enumeration<String> keys = dict.keys();

        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = dict.get(key);
            System.out.println(key + ": " + value);
        }
    }}
