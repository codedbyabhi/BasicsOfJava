package com.nit.streamPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeSerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File f = new File("C:\\NareshIT\\CoreJava\\Something\\Dog.ser");

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Dog1 d2 = (Dog1) ois.readObject();

        ois.close();

        System.out.println(d2.i + "-----" + d2.j);
    }
}

class Dog1 implements Serializable {
    public int i = 10;
    public int j = 20;
}
