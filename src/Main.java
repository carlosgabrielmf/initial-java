public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        // Declaracion de un bucle for tradicional
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Declaracion de una variable de tipo string
        String myString = "Esto es una cadena de texto";
        System.out.println(myString);

        // Declaracion de una variable de tipo Entero o Integer
        Integer myNumber = 1212;
        System.out.println(myNumber);

        // Declaracion de una variable de tipo boolean o buleana
        Boolean myBoolean = true;
        System.out.println(myBoolean);

        // Declaracion de una variable de tipo float, en este caso se debe agregar una F mayuscula al final
        Float myNumberFloat = 12.2365F;
        System.out.println(myNumberFloat);

        // Declaracion de un condicional if else
        Integer edad = 12;
        if (edad >= 18){

            System.out.println("Es mayor de edad");

        } else {

            System.out.println("Es menor de edad");

        }

    }
}