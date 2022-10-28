import java.util.Scanner;
import java.util.Random;




public class SistemaSorteio {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        
        System.out.println("Deseja sortear um número?");
        System.out.println("1-SIM");
        System.out.println("2-NÃO");
        int escolha = scan.nextInt();


        do {
            if(escolha == 2)
                break;
            int numero = rand.nextInt(50);
            System.out.println("Número sorteado:");
            System.out.println(numero);

            

            System.out.println("Deseja sortear novamente?");
            System.out.println("1-SIM");
            System.out.println("2-NÃO");
            escolha = scan.nextInt();

            


            
        } while (escolha == 1);


        





             


            


                
                
        }
        


        

        
            
        }
        








        




        


                      
            



            
            

            

                 
        
                
                
                


            

        
            
    
            
        


        

    

