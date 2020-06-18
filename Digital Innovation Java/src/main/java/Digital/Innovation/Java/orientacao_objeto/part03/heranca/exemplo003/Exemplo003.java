package Digital.Innovation.Java.orientacao_objeto.part03.heranca.exemplo003;

import java.text.NumberFormat;

public class Exemplo003 {

    public static void main(String[] args) {

        Veiculo generico = new Veiculo();
        generico.setValorVenal(1000.0);
        System.out.println(generico.calculaImposto()); //10.0

        Veiculo carro = new Carro();
        carro.setValorVenal(1000.0);
        System.out.println(carro.calculaImposto()); //70.0

        Veiculo moto = new Motocicleta();
        moto.setValorVenal(1000.0);
        System.out.println(moto.calculaImposto()); //30.0
        
        // Verifica��o da resolu��o do Exerc�cio Final
        
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        
        var gerente = new Gerente(15000);
        var supervisor = new Supervisor(5500.60);
        var atendente = new Atendente(1600);
        
        System.out.println("Gerente vai receber : "+currencyFormat.format(gerente.verSalario())+
        		" e pagar de imposto : "+currencyFormat.format(gerente.pagoDeImposto()));
        System.out.println("Supervisor vai receber : "+currencyFormat.format(supervisor.verSalario())+
        		" e pagar de imposto : "+currencyFormat.format(supervisor.pagoDeImposto()));
        System.out.println("Atendente vai receber : "+currencyFormat.format(atendente.verSalario())+
        		" e pagar de imposto : "+currencyFormat.format(atendente.pagoDeImposto()));
    }
    
    /********Exerc�cio Final**********
     * 
     * Vamos pensar em um cen�rio onde temos Funcion�rios. Esses funcion�rios podem ser:
     * Gerente, Supervisor, e Atendente.
     * 
     * Cada tipo de funcion�rio desses tem pol�ticas diferentes de impostos:
     * 
     * - Gerente paga 0,1% do sal�rio;
     * - supervisor paga 0,05% do sal�rio;
     * - Atendente paga 0,01% do sal�rio .
     * 
     * Monte um modelo que atenda esse cen�rio .*/

}
