package Digital.Innovation.Java.datas_calendar;

import java.util.Calendar;
import java.util.Date;

/**
 *  Algumas conversões de data
 */
public class Exemplo007 {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        //Dom jul 14 20:58:11 BRT 2019

        System.out.printf("%tF\n", agora);
        //2019-07-14

        System.out.printf("%tD\n", agora);
        //07/14/19

        System.out.printf("%tr\n", agora);
        //08:58:11 PM

        System.out.printf("%tT\n", agora);
        //20:58:11
        
        // Testes de resolução de exercício final
        Exemplo007 e = new Exemplo007();
        
        System.out.println(e.diasParaPagar(15, 07, 2020));
        
        System.out.println(e.diasParaPagar(30, 06, 2020));
        
        System.out.println(e.diasParaPagar(05, 07, 2020));

    }
    
    private String diasParaPagar(int dia,int mes,int ano) {
    	Calendar dataVencimento = Calendar.getInstance();
    	dataVencimento.set(ano, (mes - 1), dia);
    	dataVencimento.add(Calendar.DATE, 10);
    	switch(Calendar.DAY_OF_WEEK) {
    	case 1:
    		dataVencimento.add(Calendar.DATE, 1);
    		break;
    	case 7:
    		dataVencimento.add(Calendar.DATE, 2);
    		break;	
    	}
    	Date hoje = new Date();
    	Date pagarAte = dataVencimento.getTime();
    	return "O cliente tem "+(pagarAte.getTime() - hoje.getTime() + 3600000L) / 86400000L+" dias para pagar a fatura .";
    }
}


/*****Exercício Final*********
 * 
 * Um cliente tem 10 dias para pagar uma fatura após sua data de vencimento
 * 	sem que os juros sejam cobrados.
 * 
 * Caso essa data caia em um Sábado ou Domingo , o cliente pode pagar na segunda-feira
 * 	seguinte
 * 
 * Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele 
 * 	tem para pagar a fatura .*/


