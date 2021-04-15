package string;

import java.util.Locale;

public class OperasiString {
    public static void main(String[] args) {
        String kota = "Yogyakarta";
        System.out.println(kota);

        char[] pembahasanChar = { 'P', 'E', 'M', 'B', 'A', 'H', 'A', 'S', 'A', 'N' };
        String pembahasanString = new String(pembahasanChar);
        System.out.println(pembahasanString);

        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(pembahasanString.substring(2,6));
        System.out.println(pembahasanString.substring(5));
    }
}
