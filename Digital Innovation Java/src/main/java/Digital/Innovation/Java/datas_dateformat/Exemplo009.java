package Digital.Innovation.Java.datas_dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Exemplo de formata��o de data com SimpleDateFormat
 */
public class Exemplo009 {
    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
        // 14/07/2019

    }
}