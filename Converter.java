package javaapplication;

public class Converter {

    public static String toBinary(int a) {
        String binario = "";
        while (a > 0) {
            binario = (a % 2) + binario;
            a /= 2;
        }
        return binario;
    }
}
