package questions;
import java.util.Scanner;
import java.util.regex.*;
/**
 * Classe para resolução da questão 2.
 * @author Mariana Lima.
*/
public class Question2 {
    public static void main(String[] args) {
        String password;

        Scanner sc = new Scanner(System.in);      
        password = sc.next();
        
        int answer = checkRequirements(password);

        if(password.length()+answer < 6)
            answer += 6-(password.length()+answer);
        
        System.out.println(answer);
        sc.close();
    }

    /**
     * Método que verifica os requisitos para uma senha ser considerada segura.
     * 
     * @param password
     * @return quantidade de requisitos que não estão sendo cumpridos.
     */
    private static int checkRequirements(String password) {
        Pattern pattern1 = Pattern.compile("[!@#$%^&*()-+]");
        Pattern pattern2 = Pattern.compile("[0-9]");
        Pattern pattern3 = Pattern.compile("[a-z]");
        Pattern pattern4 = Pattern.compile("[A-Z]");
        int count=0;

        if(!pattern1.matcher(password).find())
            count++;
        if(!pattern2.matcher(password).find())
            count++;
        if(!pattern3.matcher(password).find())
            count++;
        if(!pattern4.matcher(password).find())
            count++;
        
        return count;
    }
}
