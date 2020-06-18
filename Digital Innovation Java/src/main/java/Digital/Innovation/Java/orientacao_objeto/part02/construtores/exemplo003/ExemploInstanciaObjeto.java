package Digital.Innovation.Java.orientacao_objeto.part02.construtores.exemplo003;

public class ExemploInstanciaObjeto {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Marco");

        System.out.println(pessoa.getNome());
        
        // Exercício Final testes
        
        var uno = new Carro("Uno 1.5","Fiat",2002);
        var gol = new Carro("Gol 1.6","Volkswagem",2005);
        
        System.out.println("Carro : "+uno.getModelo()+" , Marca : "+uno.getMarca()+" , Ano : "+uno.getAno()+" .");
        System.out.println("Carro : "+gol.getModelo()+" , Marca : "+gol.getMarca()+" , Ano : "+gol.getAno()+" .");

    }

}
