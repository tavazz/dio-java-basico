package POO;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) {

        
        double valorGasolina = 5.85d;



        Scanner scan = new Scanner(System.in);

        Carro carro1 = new Carro();

        System.out.print("Cor: ");
        
        carro1.setCor(scan.nextLine());

        System.out.println("Modelo:");
        
        carro1.setModelo(scan.nextLine());

        System.out.println("Qtd Tanque: ");
        carro1.setCapacidadeTanque(scan.nextInt());


        System.out.println("A cor é: " + carro1.getCor());
        System.out.println("O Modelo é: " + carro1.getModelo());
        System.out.println("Capacidade do tanque: " + carro1.getCapacidadeTanque() + "l");

        



        System.out.println("Valor de tanque cheio: R$" + carro1.totalTanque(valorGasolina));




        
        



    }
    
}
