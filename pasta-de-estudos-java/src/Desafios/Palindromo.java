package Desafios;
import java.util.Scanner;
public class Palindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String contrario = "";
        
        
        boolean resultado = retornarValor(palavra, contrario);
            if(resultado == true){
                System.out.println("TRUE");}
                else{ System.out.println("FALSE");}
    }
        


        public static boolean retornarValor(String palavra, String contrario){
          
            int i;
          for(i = palavra.length() - 1; i >= 0; i--){
           contrario += palavra.charAt(i);
           
          
           
            if(contrario.equals(palavra))
              return true;
            }
              return false;
        }



    }



        
            
          
          
          
        
        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.
    
    

