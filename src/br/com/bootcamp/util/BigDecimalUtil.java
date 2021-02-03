package br.com.bootcamp.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalUtil {

    public static BigDecimal zeroIfNull(BigDecimal value) {
        if (value == null) {
            return BigDecimal.ZERO;
        }
        return value;
    }

    public static BigDecimal getValorByPercentual(BigDecimal valor, BigDecimal percentual) {
        return zeroIfNull(valor)
                .multiply(zeroIfNull(percentual))
                .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
    }

    public static boolean isMaior(BigDecimal valor1, BigDecimal valor2) {
        //1
        return valor1.compareTo(valor2) > 0;
    }

    public static boolean isIgual(BigDecimal valor1, BigDecimal valor2) {
        //0
        return valor1.compareTo(valor2) == 0;
    }

    public static boolean isMenor(BigDecimal valor1, BigDecimal valor2) {
        //-1
        return valor1.compareTo(valor2) < 0;
    }

    public static boolean isMaiorOuIgual(BigDecimal valor1, BigDecimal valor2) {
        return isMaior(valor1, valor2) || isIgual(valor1, valor2);
    }

    public static boolean isMenorOuIgual(BigDecimal valor1, BigDecimal valor2) {
        return isMenor(valor1, valor2) || isIgual(valor1, valor2);
    }

    public static BigDecimal setScale(BigDecimal valor) {
        return zeroIfNull(valor).setScale(2, RoundingMode.HALF_UP);
    }

}
