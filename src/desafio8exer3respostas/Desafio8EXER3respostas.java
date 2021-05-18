package desafio8exer3respostas;
/**
 *
 * @author Felipe
 * Escreva um algoritmo que gere o números de 1000 a 
 * 1999 e escreva aqueles que,divididos por 11, dão resto igual a 5.
 */
public class Desafio8EXER3respostas {
    public static void main(String[] args) {
       int cont;
       cont = 1000;
       while(cont<=1999){
           if (cont % 11 == 0 || cont % 5 == 0){
               System.out.println(cont);
           }
           cont++;
       }
    }
    
}
