package Digital.Innovation.Java.orientacao_objeto.part02.construtores.exemplo003;

public class Pessoa {

    public Pessoa(String nome) {
        this.nome = nome;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
