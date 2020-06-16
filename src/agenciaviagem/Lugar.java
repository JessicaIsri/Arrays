package agenciaviagem;

public class Lugar {
    public String nome;
    private String local;

    public Lugar(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }


    public  String getLocal(){
        return this.local;
    }

    public  String getNome(){
        return this.nome;
    }


}
