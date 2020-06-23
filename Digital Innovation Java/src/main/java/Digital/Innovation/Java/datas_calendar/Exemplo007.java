package Digital.Innovation.Java.datas_calendar;

import java.util.Calendar;

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


