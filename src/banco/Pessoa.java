package banco;

import java.util.HashMap;
import java.util.Map;

public class Pessoa {
    public String nome;
    public int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Map<String, String> getDadosPessoais(){
        Map <String, String> dados = new HashMap<>();
        dados.put("Nome", this.nome);
        dados.put("Idade", String.valueOf(this.idade));
        dados.put("cpf", this.cpf);

        return dados;
    }

}
