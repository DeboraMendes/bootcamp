package br.com.bootcamp.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {

    public static boolean isMaior(LocalDate data1, LocalDate data2) {
        //1
        return data1.compareTo(data2) > 0;
    }

    public static boolean isIgual(LocalDate data1, LocalDate data2) {
        //0
        return data1.compareTo(data2) == 0;
    }

    public static boolean isMenor(LocalDate data1, LocalDate data2) {
        //-1
        return data1.compareTo(data2) < 0;
    }

    public static boolean isMaiorOuIgual(LocalDate data1, LocalDate data2) {
        return isMaior(data1, data2) || isIgual(data1, data2);
    }

    public static boolean isMenorOuIgual(LocalDate data1, LocalDate data2) {
        return isMenor(data1, data2) || isIgual(data1, data2);
    }

    public static boolean isEntre(LocalDate data,
                                  LocalDate dataInicial,
                                  LocalDate dataFinal) {
        return isMaiorOuIgual(data, dataInicial) && isMenorOuIgual(data, dataFinal);
    }

    public static String getDataFormatada(LocalDate data) {
        if (data != null) {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return formato.format(data);
        }
        return null;
    }

}
