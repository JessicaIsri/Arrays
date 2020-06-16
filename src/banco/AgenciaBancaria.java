package banco;

import java.util.*;

public class AgenciaBancaria {
    private ArrayList<Conta> contas;
    private Map<String,Pessoa> dados_pessoas = new HashMap<String, Pessoa>();
    private Set<String> CpfClientess = new HashSet<>();

    public AgenciaBancaria() {
    }

    public void adicionarConta(){
        Conta con = new Conta(123, "501568234-98");
        this.contas.add(con);
        Pessoa pessoa = new Pessoa("Julia", 19, "501568234-98");
        this.dados_pessoas.put("501568234-98", pessoa);

    }

    public void apagarConta(int numero){
        for (int i = 0; i < this.contas.size(); i++){
            this.contas.remove(i);
            if (numero == this.contas.get(i).getNumero()){
                this.contas.remove(i);
            }
        }
    }

    public void listarDadosPessoais(String cpf){
        System.out.println(this.dados_pessoas.get(cpf));
    }
}
