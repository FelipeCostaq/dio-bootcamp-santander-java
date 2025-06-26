public class Main {

    public static void main(String[] args) {
        int _value1 = 6;
        var _binary1 = Integer.toBinaryString(_value1);
        System.out.printf("Primeiro número da operação %s (Representação Binária %s)\n", _value1, _binary1);

        int _value2 = 5;
        var _binary2 = Integer.toBinaryString(_value1);
        System.out.printf("Segundo número da operação %s (Representação Binária %s)\n", _value2, _binary2);


        var _result = _value1 & _value2;
        var _binaryResult = Integer.toBinaryString(_result);
        System.out.printf("%s | %s = %s (Representação Binária %s)\n", _value1, _value2, _result, _binaryResult);

    }
}
