package main.questions;

import java.util.Scanner;
/**
 * Classe para resolução da questão 1.
 * @author Mariana Lima.
*/
public class Question1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);      
        n = sc.nextInt();

        printLadder(n);
        
        sc.close();
    }

    /**
     * Função que imprime na tela uma escada de tamanho n formada pelo caracter '*' e espaços.
     * 
     * @param n número que define altura e base da escada.
    */
    private static void printLadder(int n){
        int i,j,k;
        for(i=0; i<n; i++){
            for(j=n-1; j>i; j--)
                System.out.print(" ");
            for(k=0; k<=i;k++)
                System.out.print("*");
            if(i<n-1)
                System.out.println();
        }
    }
}
