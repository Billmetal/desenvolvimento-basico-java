package Digital.Innovation.Java.datas_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class Exercicio001 {


    public static void main(String[] args) {

        Exercicio001 e = new Exercicio001();

        System.out.println(e.checaLong(1563385317992L));
        
        // Testanto resolução de Exercício 1
        
        System.out.println(e.dateToLong(18, 06, 1979));
        
        System.out.println(e.checaLong(e.dateToLong(18, 06, 1979)));
    }


    /**
     * Exercicio 1
     *
     * Você tem um epoch (formato long) converta no formato Date
     *
     * Epoch 1563385317992
     *
     * Ponto de atenção: como Você está manipulando um numero do tipo long, dependendo da maneira que Você estiver
     *                   manipulando essa informação, Você precisa colocar a letra l no final do numero
     *
     *
     *
     * @param epoch
     * @return
     */
    public Date checaLong(long epoch) {

        Date date = new Date(epoch);

        return date;
    }

    /**
     *
     * @return
     */
    public long dateToLong(int dia,int mes,int ano) {
    	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    	Date data = new Date();
		try {
			data = format.parse(dia+"/"+mes+"/"+ano);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        return data.getTime();
    }

}
