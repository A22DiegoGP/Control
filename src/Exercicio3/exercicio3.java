package Exercicio3;

public class exercicio3 {
    public static boolean esPalindromo(String str) {

        str = str.toLowerCase();
        // System.out.println(str);
        str.trim();
        str = str.replaceAll("á", "a");
        str = str.replaceAll("é", "e");
        str = str.replaceAll("í", "i");
        str = str.replaceAll("ó", "o");
        str = str.replaceAll("ú", "u");
        str = str.replaceAll("[^a-z0-9]", "");
        // System.out.println(str);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}    