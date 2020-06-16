package concessionaria;

import javax.swing.*;
import java.util.ArrayList;

public class MainCarro {
    public static void main(String [] args){
        Concessionaria con = new Concessionaria();
        Carro carro1 = new Carro("XYZ1548", "Onix", "GM", 45000);
        Carro carro2 = new Carro("XYC1548", "Mustang", "Ford", 450000);
        Carro carro3 = new Carro("ABC1748", "Xantia", "Citroen", 10000);


        con.cadastraCarro(carro1);
        con.cadastraCarro(carro2);
        con.cadastraCarro(carro3);

        con.mapearPlaca();
        String placa = JOptionPane.showInputDialog("Busca Placa");
        con.getValueByBoard(placa);

    }
}
