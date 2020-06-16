package agenciaviagem;

public class Main {
    public static void main(String [] args){
        AgenciaBancaria ag = new AgenciaBancaria();
        ag.adicionarConta();
        ag.listarDadosPessoais("501568234-98");
        ag.apagarConta(123);
    }
}
