package com.company;

import java.io.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        SerializationTest serializationTest = new SerializationTest("1",2,3L, "56", 7);
        System.out.println(serializationTest);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\HOME\\IdeaProjects\\example.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(serializationTest);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

       /* try {
            FileInputStream fileInputStream = new FileInputStream("example.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SerializationTest serializationTestDes = (SerializationTest) objectInputStream.readObject();
            System.out.println(serializationTestDes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
*/

    }
}
