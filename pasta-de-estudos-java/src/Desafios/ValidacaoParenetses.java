package Desafios;


import java.util.Scanner;

public class ValidacaoParenetses {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
      
      
      
    switch (s){
        case "()":
            return true;
          
        case "[]":
          
          return true;
        case "{}":
          return true;

        default:
            return false;
      }
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.
    }

}
    

