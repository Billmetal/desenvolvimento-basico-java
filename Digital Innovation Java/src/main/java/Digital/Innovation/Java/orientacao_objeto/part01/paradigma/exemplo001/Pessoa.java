package Digital.Innovation.Java.orientacao_objeto.part01.paradigma.exemplo001;

public class Pessoa {

    private String nome = "Marco";

    public String getNome() {
        return nome;
    }

    public String falarMeuProprioNome(){
        return "Ol�, meu nome � " + getNome();
    }

    public String andar() {
        return "Andando...";
    }
}
