package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Exercicio1 {


    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
            

        int i;

        

        for(i = 0; i < 6; i++){
            System.out.println("Insira a temperatura: ");
            double temp = sc.nextDouble();
            temperaturas.add(temp);
            


        }
        System.out.println("--------------------------");

        System.out.println("Lista de Temperaturas: ");
        temperaturas.forEach(t -> System.out.println(t + " "));

        ListIterator <Double> iterator = temperaturas.listIterator();

        double soma = 0d;

        while (iterator.hasNext()) {
            soma += iterator.next();
        }

        System.out.println("Média das temperaturas: " + soma/temperaturas.size());

        ListIterator <Double> iterator2 = temperaturas.listIterator();

        if (iterator2.next() > soma/temperaturas.size()) {
            System.out.println(iterator2.next() + " ");

        while (iterator2.hasNext()) {
            if (iterator2.next() > soma/temperaturas.size()) {
                System.out.println(iterator2.next() + " ");
                
            }
            
        }

       
        


        



        






        


        

        






    }


 






    
}
}
