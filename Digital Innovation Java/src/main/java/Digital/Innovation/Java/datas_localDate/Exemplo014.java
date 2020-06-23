package Digital.Innovation.Java.datas_localDate;

import java.time.LocalDateTime;

/**
 * Exemplo de como manipular LocalDateTime
 */
public class Exemplo014 {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);
        // 2019-07-15T00:02:16.076

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
        // 2019-07-17T01:02:28.076

    }
}

/******Exercício Final*******
 * 
 * Adicione 4 anos , 6 meses , e 13 horas ao momento 15/05/2010 10:00:00*/
