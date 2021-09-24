//Uma classe Wrapper é uma classe cujo objeto corresponde a um primitivo

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {

    public static void main(String[] args) {

        int primitive = Integer.parseInt("123"); // converte um string em um primitivo
        Integer wrapper = Integer.valueOf("123"); // converte uma string em uma classe wrapper integer

        // int bad1 = Integer.parseInt("a"); // este código lança uma NumberFormatException
        // int bad2 = Integer.valueOf("123.45"); // este código também lança uma NumberFormatException

/*
    Classe Wrapper      Convert String --> primitivo            Convert String --> wrapper class
    Boolean             Boolean.parseBoolean("true")            Boolean.valueOf("TRUE")
    Byte                Byte.parseByte("1")                     Byte.valueOf("2")
    Short               Short.parseShort("1")                   Short.valueOf("2")
    Integer             Integer.parseInt("1")                   Integer.valueOf("2")
    Long                Long.parseLong("1")                     Long.valueOf("2")
    Float               Float.parseFloat("1")                   Float.valueOf("2")
    Double              Double.parseDouble("1")                 Double.valueOf("2")
    Character           Nada                                    Nada

*/

/* AUTOBOXING e UNBOXING
    O java automaticamente converte entre primitivo e classe wrapper e vice e versa
    Primitivo --> classe wrapper = autoboxing
    Classe wrapper --> primitivo = unboxing

*/
        List<Integer> pesos = new ArrayList<>();
        Integer w = 50; //automaticamente converte o int primitivo em um objeto Integer
        pesos.add(w); // [50]
        pesos.add(Integer.valueOf(60)); // [50, 60]
        pesos.remove(50); // [60]
        double primeiro = pesos.get(0); // 60.0

        //Cuidado com o autoboxing de Integer::::

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1); //aqui ele irá tirar o "2" pois ele está tirando o ELEMENTO 1, pois existe o método que recebe um inteiro e remove o elemento naquele índice
        numbers.remove(new Integer(1)); //aqui ele irá tirar o elemento 1 e não o índice 1
        

    }
}
