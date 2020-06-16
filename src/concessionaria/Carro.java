package concessionaria;

public class Carro {
    private String placa;
    public String modelo;
    public String fabricante;
    private double valor;

    public  Carro(String placa, String modelo, String fabricante, double valor){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.valor = valor;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public String getPlaca(){
        return this.placa;
    }

    public double getValor(){
        return this.valor;
    }


}
