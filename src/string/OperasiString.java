package string;

import java.util.Locale;

public class OperasiString {
    public static void main(String[] args) {
        String kota = "Yogyakarta";
        System.out.println(kota);

        char[] uniskaChar = { 'U', 'N', 'I', 'S', 'K', 'A' };
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(uniskaString.substring(0,3));
        System.out.println(uniskaString.substring(3));
    }
}
