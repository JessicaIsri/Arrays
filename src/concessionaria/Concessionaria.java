package concessionaria;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;


public class Concessionaria {
    public ArrayList <Carro> cars = new ArrayList<Carro>();
    public Map <String, Double>  tabela_preço = new HashMap<String, Double>();

    public void cadastraCarro(Carro carro){

        this.cars.add(carro);
    }

    public void mapearPlaca(){
        this.cars.forEach(car ->tabela_preço.put(car.getPlaca(), car.getValor()));
    }

    public void getValueByBoard(String placa){
        System.out.println(tabela_preço.get(placa));
        double valor = tabela_preço.get(placa);
        JOptionPane.showMessageDialog(null, "Preço: " + valor);
    }


}
