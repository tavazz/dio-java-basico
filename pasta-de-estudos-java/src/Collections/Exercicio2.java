package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import javax.xml.transform.Source;

public class Exercicio2 {


    public static void main(String[] args) {
        
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Perguntas: ");
        System.out.print("\nTelefonou para vítima? ");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Devia para vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);


        int count = 0;
        ListIterator <String> contador = respostas.listIterator();

        while(contador.hasNext()){
            if(contador.next().contains("s"))
                count++;
        }


        switch (count) {
            case 2:

                System.out.println("SUSPEITO");
                
                break;
            
            case 3:
            case 4:
                
                System.out.println("CUMPLICE");

                break;
            
            case 5:

                System.out.println("ASSASSINO");
        
            default:

                System.out.println("INOCENTE");
                break;
        }

    }
    
}
