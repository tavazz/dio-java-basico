package Metodos;


import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        
        int x;
        
        
        x = scan.nextInt();
        
        int resultado = BuscaSequencial.retornarPosicao(x, elementos);
            if (resultado == -1){
              System.out.println("Numero " + x + " nao encontrado!");
            }
            else{
              System.out.println("Achei " + x + " na posicao " + resultado);
            }
            
        

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

    }
    
    
    
    public static int retornarPosicao(int x, int[] elementos){
      
      int i;
      
      for(i = 0; i < elementos.length; i++){
        
        
        if (elementos[i] == x)
            return i;
          
      }  
       return -1;
          
        }
          
        
      }
      