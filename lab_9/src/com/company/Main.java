package com.company;


import com.classes.JSONGetter;
import com.classes.Text;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class Main
{

    public static void main(String[] args) throws IOException {
        JSONGetter jsonGetter = new JSONGetter();
        ObjectMapper mapper = new ObjectMapper();
        JSONGetter.url = "https://bible-api.com/john%203:16";
        jsonGetter.run();

        System.out.println((mapper.readValue((jsonGetter.jsonIn
                .replaceAll("\\[", "").replaceAll("\\]","")), Text.class)));

    }
}