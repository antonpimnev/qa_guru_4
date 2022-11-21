package org.example;

public class Main {
    public static void main(String[] args) {

        //Инстанцирование переменных по типу данных
        byte varByte = 127;
        short varShort = 32767;
        int varInteger = 2147483647;
        long varLong = 9223372036854775807L;
        float varFloat = 1000.99f;
        double varDouble = 100000000000000.99d;
        char varChar = 65535;
        boolean varBoolean = true;

        //Операции с типами данных
        System.out.println(varByte+varShort);
        System.out.println(varInteger%varFloat);
        System.out.println(varInteger*varLong);
        System.out.println(varDouble/varByte);
        System.out.println(varChar-1);

        //Переполнение
        System.out.println((byte)(varByte+1));
        System.out.println((short)(varShort+1));
        System.out.println(varInteger+1);
        System.out.println(varInteger+Integer.MAX_VALUE);
        //System.out.println(varChar+1);

        //Логические опретаторы + условные конструкции
        if (varByte>20){
            System.out.println("varByte больше 20");
        }
        else if (varByte==127){
            System.out.println("varByte равно 20");
        }
        else {
            System.out.println("varByte меньше 20");
        }

        if(varBoolean || (varByte < 1)){
            System.out.println("TRUE FOREVER :)");
        }
    }
}