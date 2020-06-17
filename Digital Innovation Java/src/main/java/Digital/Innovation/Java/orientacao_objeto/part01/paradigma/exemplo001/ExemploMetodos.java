package Digital.Innovation.Java.orientacao_objeto.part01.paradigma.exemplo001;

public class ExemploMetodos {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        System.out.println(pessoa.falarMeuProprioNome());
        // OlÃ¡, meu nome Ã© Marco

        System.out.println(pessoa.andar());
        
        //exercicioFinal();
    }
    
    // Execução para teste do exercício final da parte 01
   /* private static void exercicioFinal() {
    	var santana = new Carro(5, 2);
    	var ferrari = new Carro(2, 0);
    	var landal = new Carro(7, 3);
    	
    	System.out.println(santana.adicionaPessoa(4)+" , "+santana.getPessoasNoCarro()+" pessoa(s) no santana.");
    	System.out.println(santana.removePessoa(1)+" , "+santana.getPessoasNoCarro()+" pessoa(s) no santana.");
    	System.out.println(santana.adicionaPessoa(2)+" , "+santana.getPessoasNoCarro()+" pessoa(s) no santana."+"\n"+"-------------------");
    	System.out.println(ferrari.adicionaPessoa(3)+" , "+ferrari.getPessoasNoCarro()+" pessoa(s) na ferrari.");
    	System.out.println(ferrari.adicionaPessoa(4)+" , "+ferrari.getPessoasNoCarro()+" pessoa(s) na ferrari.");
    	System.out.println(ferrari.removePessoa(0)+" , "+ferrari.getPessoasNoCarro()+" pessoa(s) na ferrari."+"\n"+"-------------------");
    	System.out.println(landal.adicionaPessoa(4)+" , "+landal.getPessoasNoCarro()+" pessoa(s) no landal.");
    	System.out.println(landal.removePessoa(5)+" , "+landal.getPessoasNoCarro()+" pessoa(s) no landal.");
    	System.out.println(landal.adicionaPessoa(2)+" , "+landal.getPessoasNoCarro()+" pessoa(s) no landal."+"\n"+"-------------------");
    }*/
}
