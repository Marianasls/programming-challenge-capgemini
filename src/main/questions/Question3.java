package main.questions;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
/**
 * Classe para resolução da questão 3.
 * @author Mariana Lima.
*/
public class Question3 {
    
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);      
        input = sc.next();

        int answer = anagramPairCount(input);
        System.out.println(answer);
        sc.close();
    }

    /**
     * Método que realiza a contagem de pares de anagramas formados pelas substrings de uma string.
     * 
     * @param input string para realizar a contagem.
     * @return quantidade de pares de anagramas da string.
    */
    private static int anagramPairCount(String input) {
        int size = input.length();
        
        HashMap<String, Integer> map = new HashMap<>();

        for (int i=0; i<size; i++) {
            for (int j=i; j<size; j++) {
                char[] value = input.substring(i, j+1).toCharArray();
                Arrays.sort(value);
                String substr = new String(value);

                if (map.containsKey(substr))
                    map.put(substr, map.get(substr)+1);
                else
                    map.put(substr, 1);
            }
        }

        int count = 0;

        for (String key: map.keySet()) {
            int n = map.get(key);
            count += (n * (n-1))/2;
        }

        return count;
    }
  
}
