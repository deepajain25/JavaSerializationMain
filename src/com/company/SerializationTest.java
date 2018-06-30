package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest implements Serializable {

    private static final long serialVersionUID = 1L;
    String a;
    transient Integer b;
    Long c;
   String ref;
   long data;

    public SerializationTest(String a, Integer b, Long c, String ref, int data) {
       this.a = a;
       this.b = b;
       this.c = c;
       this.ref = ref;
       this.data = data;
    }

    @Override
    public String toString() {
        return "SerializationTest{" +
                "a='" + a + '\'' +
                ", b=" + b +
                ", c=" + c +
                ", ref='" + ref + '\'' +
                ", data=" + data +
                '}';
    }

    private void writeObject(ObjectOutputStream aOutputStream) throws IOException
    {
        System.out.println("my write");
        aOutputStream.defaultWriteObject();



    }
}
