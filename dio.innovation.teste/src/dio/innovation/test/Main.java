package dio.innovation.test;

import dio.innovation.utils.operacao.Calculadora;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.div(14,2));
    }
}
