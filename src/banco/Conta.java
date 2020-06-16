package banco;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class Conta {
    public int numero;
    private String cpf;
    private double saldo = 0.0;



    public Conta(int numero, String cpf) {
        this.numero = numero;
        this.cpf = cpf;
    }


    public void deposit(double valor){
        this.saldo += valor;
    }

    public void saque(double valor){
        this.saldo -= valor;
    }

    public int getNumero(){
        return this.numero;
    }
    public String getCpf(){
        return this.cpf;
    }
}
