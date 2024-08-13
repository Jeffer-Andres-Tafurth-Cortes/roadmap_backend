// Toda aplicacion de Java comienza con 'public class'

// El siguiente programa solo retorna en la terminal 'Hello World!'
public class Main {
    public static void main(String[] args) {

      // Imprime en la consola el texto 'Hello World!'
      System.out.println("Hello World");
      System.out.println("I am learning Java");

      // Se puede realizar calculos pequeños para que se impriman
      System.out.println(3 + 3);

      /* The code below will print the words Hello World
      to the screen, and it is amazing */

      String nombre = "Jeffer"; // Esto es una variable tipo String
      System.out.println("Hola, " + nombre);

      int numero = 21; // Esto es una varibale tipo int
      System.out.println("Tengo " + numero + " años");

      float numeroF = 5.99f; // Esto es una variable tipo float
      System.out.println("El numero es " + numeroF);

      char letraUnica = 'A'; // Esto es una variable tipo char
      System.out.println("La letra es " + letraUnica);

      boolean miBooleano = true; // Esto es una variable tipo boolean
      System.out.println("Mi booleano es " + miBooleano);


      // Este es un ejemplo de imprimier variables con el metodo println()
      String firstName = "Andres";
      String lastName = "Cortes";
      System.out.println("Bienvenido " + firstName + " " + lastName);

      // Ejemplo del operador ' + ' como suma
      int number1 = 5;
      int number2 = 3;
      System.out.println(number1 + number2);


      // Declarar multiples variables del mismo tipo de dato
      int num1 = 1, num2 = 2, num3 = 3;
      System.out.println(num1 + num2 + num3);


      // Declarar multiples variables con el mismo valor
      int x, y, z;
      x = y = z = 50;
      System.out.println(x + y + z);



      // Variables Java - Ejemplos
      // Almacenamiento de datos de un estudiante universitario
      String studentName = "John Doe";
      int studentID = 15;
      int studentAge = 23;
      float studentFee = 75.25f;
      char studentGrade = 'B';

      System.out.println("Student name: " + studentName);
      System.out.println("Student ID: " + studentID);
      System.out.println("Student age: " + studentAge);
      System.out.println("Student fee: " + studentFee);
      System.out.println("Student grade: " + studentGrade);

      // Calculo del area de un rectangulo
      int length = 4;
      int width = 6;
      int area;

      area = length * width;
      System.out.println("Area of the rectangle: " + area);


      // Tipos de numeros en Java
      // byte
      byte byteNum = 100;
      System.out.println(byteNum);
      
      // short
      short shortNum = 5000;
      System.out.println(shortNum);

      // int
      int intNum = 1234567;
      System.err.println(intNum);

      // long
      long longNum = 987654321L;
      System.out.println(longNum);

      // float
      float floatNum = 3.14f;
      System.out.println(floatNum);
      
      // double
      double doubleNum = 2.71828d;
      System.out.println(doubleNum);

      // Tipo de dato booleano (boolean)
      boolean isJavaFun = true;
      boolean isFishTasty = false;
      System.out.println(isJavaFun);
      System.out.println(isFishTasty);

      // Tipo de dato char
      char charVariable = 'A';
      System.out.println(charVariable);

      // Tipo de dato string
      String greetings = "Hola Mundo!";
      System.out.println(greetings);


      // EJEMPLOS CON TIPOS DE DATOS
      // Calcular y generar el costo de varios articulos
      int items = 50;
      float costPerItem = 9.99f;
      float totalCost = items * costPerItem;
      char currrency = '$';
      
      System.out.println("Total de costo :" + currrency + totalCost);


      // CONVERSION DE TIPOS (CASTING)
      // Widening Casting
      int myInt = 9;
      double myDouble = myInt;
      System.out.println(myInt); // 9
      System.out.println(myDouble); // 0.9

      // Narrowing Casting
      double yourDouble = 9.78d;
      int yourInt = (int) yourDouble;
      System.out.println(yourDouble); // 9.78
      System.out.println(yourInt); // 9

      // Ejemplo con la Conversion de tipos
      int maxScore = 500;
      int userScore = 423;
      float percent = (float) userScore / maxScore * 100.0f;
      System.out.println("Tu puntaje es: " + percent + "%"); 
      
    }
  }
  