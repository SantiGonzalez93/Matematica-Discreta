import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String read;
        boolean breaker = false;



        while (breaker == false) {
            read = JOptionPane.showInputDialog("Ingrese un numero binario de maximo 16 bits");
            if (read.length() <= 16 && read.matches("[01]+")) {

                //pasaje a decimal
                double resultDecimal = 0;
                for (int i = 0; i < read.length(); i++){
                    char charDigit = read.charAt(i);
                    int digit = Character.getNumericValue(charDigit);
                    int exponent = (read.length()-1) - i;
                    resultDecimal = resultDecimal + digit * Math.pow(2, exponent);
                }

                //completar con 0 a la izquierda
                while (read.length() < 16) {
                    read = "0"+read;
                }

                //pasaje a octal
                String octal = "";
                if (read.length() == 16) {
                    double resultOctal = 0;
                    for (int i = read.length(); i > 0; i -= 3) {
                        int startIndex = Math.max(0, i - 3);
                        String part = read.substring(startIndex, i);
                        int contador = 0;
                        for (int j = 0; j < part.length(); j++) {
                            char charDigit = part.charAt(j);
                            int digit = Character.getNumericValue(charDigit);
                            int exponent = (part.length()-1) - j;
                            resultOctal = resultOctal + digit * Math.pow(2, exponent);
                            contador =  (int) resultOctal;
                        }
                        resultOctal = 0;
                        octal = contador + octal ;
                    }
                }

                //pasaje a Hexadecimal
                String hexa = "";
                if (read.length() == 16) {
                    double resultHexa = 0;
                    for (int i = read.length(); i > 0; i -= 4) {
                        int startIndex = Math.max(0, i - 4);
                        String part = read.substring(startIndex, i);
                        int contador = 0;
                        for (int j = 0; j < part.length(); j++) {
                            char charDigit = part.charAt(j);
                            int digit = Character.getNumericValue(charDigit);
                            int exponent = (part.length()-1) - j;
                            resultHexa = resultHexa + digit * Math.pow(2, exponent);
                            contador =  (int) resultHexa;
                        }
                        resultHexa = 0;
                        String contaHexa = "";
                        switch (contador) {
                            case 0:
                                contaHexa = "0";
                                break;
                            case 1:
                                contaHexa = "1";
                                break;
                            case 2:
                                contaHexa = "2";
                                break;
                            case 3:
                                contaHexa = "3";
                                break;
                            case 4:
                                contaHexa = "4";
                                break;
                            case 5:
                                contaHexa = "5";
                                break;
                            case 6:
                                contaHexa = "6";
                                break;
                            case 7:
                                contaHexa = "7";
                                break;
                            case 8:
                                contaHexa = "8";
                                break;
                            case 9:
                                contaHexa = "9";
                                break;
                            case 10:
                                contaHexa = "A";
                                break;
                            case 11:
                                contaHexa = "B";
                                break;
                            case 12:
                                contaHexa = "C";
                                break;
                            case 13:
                                contaHexa = "D";
                                break;
                            case 14:
                                contaHexa = "E";
                                break;
                            case 15:
                                contaHexa = "F";
                                break;

                        }
                        hexa = contaHexa + hexa ;
                    }
                }

                JOptionPane.showMessageDialog(null, "El nro :" + read + " Es equivalente a: " + " Decimal: " + resultDecimal + " " + " Octal: " + octal + " "+ "Hexadecimal: " + hexa );
                breaker = true;

            } else {
                JOptionPane.showMessageDialog(null, "Valor incorrecto, debe tener maximo 16 digitos con 0 y 1 unicamente");
                breaker = false;
            }
        }

    }
}