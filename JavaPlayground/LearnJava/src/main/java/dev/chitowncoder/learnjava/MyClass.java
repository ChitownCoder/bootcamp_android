package dev.chitowncoder.learnjava;

public class MyClass {
    public static void main(String[] args) {
//        VARIABLE IS THE SAME AS BUCKET IN MEMORY
        String firstName = "Tony";
        int age = 48;
        int year = 1966;
        long bigNumber = 196612345678L;
        System.out.println(bigNumber);
        float celsius = 45.9f;
        System.out.println(celsius);
        double height = 5.9d;

        byte myByte = 127;
        System.out.println(myByte); // 8 bits
        short myShort = 290; // 16 bits

        char letter ='A';
        System.out.println(letter);


        System.out.println("Hello my name is " + firstName + ".");
        System.out.println(year);

    }
}