public class ExemploDadosPrimitivos {
    public static void main(String[] args) {
        //números inteiros
        byte valorByte = 127; //-128 - 127
        short valorShort = 32767; //-32768 - 32767
        int valorInt = 2147483647; //-2147483648 - 2147483647
        long valorLong = 9223372036854775807L; //-9223372036854775808L- 9223372036854775807

        //números flutuantes
        float valorFloat = 3.14f;
        double valorDouble = 3.14159265359;

        //tipos caracter
        char caracter = 'A';

        //tipo booleano
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(valorByte);
        System.out.println(valorShort);
        System.out.println(valorInt);
        System.out.println(valorLong);
        System.out.println(valorFloat);
        System.out.println(valorDouble);
        System.out.println(caracter);
        System.out.println(verdadeiro);
        System.out.println(falso);

    }
}
