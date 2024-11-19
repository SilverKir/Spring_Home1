package ru.home;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;

public class Serialize {

    public void serialObjJson(Object o, String file) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
            objectMapper.writeValue(new File(file), o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Person deSerialObjJson( String file) {
        Person result = new Person ();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            result = objectMapper.readValue(new File(file), Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Person.class.cast(result);
    }

}
