package agenciaviagem;

import banco.Conta;
import agenciaviagem.Pessoa;

import java.util.*;

public class AgenciaViagem {
    private ArrayList<Lugar> lugar;
    private Map<String, Pessoa> dados_pessoas = new HashMap<String, Pessoa>();
    private Set<String> CpfClientess = new HashSet<>();


    public void adicionarDestino(){
        Lugar lun = new Lugar("Pão de Açucar", "Brasil");
        this.lugar.add(lun);
        Pessoa pessoa = new Pessoa("Julia", 19, "501568234-98");
        this.dados_pessoas.put("501568234-98", pessoa);

    }

    public void listarDadosDestino(int numero){
        for (int i = 0; i < this.lugar.size(); i++){
            System.out.println("Nome: " + this.lugar.get(i).getNome() + "\n Pais: " + this.lugar.get(i).getLocal());
        }
    }

    public void listarDadosPessoais(String cpf){
        System.out.println(this.dados_pessoas.get(cpf));
    }
}

