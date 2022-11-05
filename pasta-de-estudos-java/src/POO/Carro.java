package POO;

public class Carro extends Veiculo {

    String cor;
    String modelo;
    int capacidadeTanque;


    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

      
    



    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }



    public double totalTanque(double valorGasolina){
        
        

       return capacidadeTanque * valorGasolina;


    }

  
    
}
