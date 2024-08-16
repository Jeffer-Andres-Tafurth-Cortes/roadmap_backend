# ¿Que es Java?
- Java es un lenguaje de programacion creado en 1995
- Actualmente Oracle es el dueño de Java y es usando en mas de 3 millones de dispositivos
- Los usos mas comunes de Java son:
  - Desarrollo de aplicaciones moviles (especialmente apps de Android)
  - Desarrollo de aplicaciones de escritorio
  - Desarrollo de aplicaciones web
  - Desarrollo de servicios web y servicios de aplicaciones
  - Videojuegos
  - Conexion a bases de datos

# ¿Por que usa Java?
- Java trabaja en diferentes plataformas como: Windows, Mac, Linux, Raspberry Pi, etc
- Es uno de los lenguajes de programacion mas conocidos en el mundo
- Tiene una demanda bastante grande en el mercado laboral
- Es facil de aprender y usar
- Es de codigo abierto y libre
- Es seguro, rapido y poderoso
- Tiene una gran comunidad de soporte
- Java es un lenguaje orientado a objetos lo cual hace que tenga una estructura de programacion clara y permite que el codigo sea reutilizable


# Comienzo rapido con Java
- Cada aplicacion de Java comienza con una 'class name' seguido del nombre del archivo (en este caso el archivo se llamara 'Main.java')

# Sintaxis de Java
- Cada linea de codigo que se escribe en Java debe estar adentro de una 'class'
- El nombre del archivo en el cual estemos trabajando debe de coincidir con la el nombre de la 'class'

## Metodo pricipal
- El 'main()' metodo es obligatorio y de vera en todos los programas de Java
- Dentro del metodo 'main()' podemos usar el metodo 'println()' para imprimir lineas de texto en pantalla y/o terminal 

# Salida de Java (output)
- Como ya sabemos el metodo 'println()' nos sirve para imprimir texto en pantalla y podemos agregar los 'println()' que queramos
- Cuando se trate de textos, se deben de poner en medio de las comillas dobles ""
- Tambien esta el metodo 'print()' este metood tambien imprime texto pero no inserta una nueva linea al final
- El metodo 'println()' tambien sirve para imprimir numeros, la cuestion es que estos no se deben de poner en comillas dobles, podemos poner cualquier numero o tambien realizar pequeños calculos para que los imprima en la terminal 'println(3 * 3)'

# Comentarios
- Tenemos los comentarios de una sola linea, que para poder implementarlos ponemos dos barras inclinadas ( // ) seguido de ello ira el comentario correspondiente
- Tambien esta los comentatios de multi-linea, que para implementarlos ponemos dos barras inclinadas y dentro de ellas dos asteriscos ( /* */ ); todo lo que este adentro de eso es un comentario multi-linea por ende puede abarcar varias lineas del editor de codigo

# Variables en Java
- En cualquier lenguaje de programacion las variables son contenedores para almacenas valores de datos, en este caso en Java tenemos los siguientes tipos de variables:
  - String -> almacena texto y/o cadenas de texto, estos debe estar entre comillas dobles
  - int -> almacena numeros enteros, sin decimales
  - float -> almacena numeros de punto flotante como decimales
  - char -> almacena caracteres individuales, esto debe estar entre comillas simples
  - boolean -> almacena valores con dos estados: true o false 

## Declaracion de variables
- Para declarar una variable se debe de poner primero el tipo de variable, seguido del nombre que le vamos a poner a esa variable y por ultimo se le asigna el valor correspondiente 'type variableName = value; '
 - Ejemplo 1 -> String name = "John";
 - Ejemplo 2 -> int myNum = 15;

## Imprimir variables en Java
- Como ya hemos visto el metodo mas usado para imprimir texto y numero es 'println()', podemos usar este metodo para imprimir el valor(almacenamiento) de una variable simplemente le agregamos el nombre de la variable dentro de los parentesis del metodo
- Se puede usar el signo de mas ( + ) para agregar una variable a otra variable y/o tambien a agregar una variable junto con texto o numeros

## Declarar multiples variables en Java
- Si estamos trabajando con multiples variables y todas estas son del mismo tipo podemos simplemente escribir el tipo de dato y seguido de ello escribir todas las variables con su correspondiente valor (la forma de identificar cada variable es irlas separando por comas) 
  - EJEMPLO -> int num1 = 1, num2 = 2, num3 = 3;
- A su vez podemos asignar un mismo valor a multiples variables

## Identificadores de Java
- Todas las variables deben de tenr un nombre unico, a estos nombres se le pueden llamar identificadores; los identificadores pueden ser nombres cortos o nombres mas descriptivos
  - EJEMPLO -> int minutesPerHour = 60;
- Las reglas generales para nombrar variables son:
  - Los nombres pueden contener letras, digitos, guiones bajos y signos de dolar
  - Los nombres deben comenzar con una letra
  - Los nombres deben comenzar con una letra minuscula y no pueden contener espacios en blanco
  - Los nombres tambien pueden comenzar con $ y _ 
  - Los nombres distinguen entre mayusculas y minusculas ("myVar" y "MyVar" son variables diferentes)
  - Las palabras reservadas no se pueden usar como nombres

## Variables Java - Ejemplos
- Se crean dos ejemplos en el archivo 'Main.java' dentro de la carpeta de 'Java'; uno corresponde a un almacenamiento de datos de un estudiante universitario y el otro es el calculo del area de un rectangulo; los ejemplos estan bajo el comentario de 'Variables Java - Ejemplos'

# Tipos de datos de Java
## Tipos de datos
- Los tipos de datos en Java se dividen en dos grupos
  - Tipos de datos primitivos: 
    - byte -> tiene 1 byte de tamaño y almacena numeros entre -128 y 127
    - short -> tiene 2 bytes de tamaño y almacena numeros entre -32768 y 32767
    - int -> tiene 4 bytes de tamaño y almacena numeros entre -2,147,483,648 y 2,147,483,647
    - long -> tiene 8 bytes de tamaño y almacena numeros entre -9,223,372,036,854,775,808 y 9,223,372,036,854,775,807
    - float -> tiene 4 bytes de tamaño y almacena numeros decimales (entre 6 y 7 digitos despues de la coma)
    - double -> tiene 8 bytes de tamaño y almacena numeros decimales (15 digitos despues de la coma)
    - boolean -> tiene 1 byte de tamaño y almacena true o false
    - char -> tiene 2 bytes de tamaño y almacena un letra
  - Tipos de datos no primitivos: matrices y clases

## Numeros
- Dentro de los tipos de numeros primitivos en Java hay dos grupos:
  - Los tipos enteros: 
    - byte: puede almacenar numeros enteros entre -128 y 127
    - short: puede almacenar numeros enteros entre -32768 y 32767
    - int: puede almacenar numeros enteros entre -2147483648 y 2147483647
    - long: puede almacenar numero enteros entre -9223372036854775808 y 9223372036854775807
  - Los tipos de punto flotante: 
    - float: almacena numeros decimales (fraccionarios)
    - double: almacena numero decimales (fraccionarios)

## Booleanos (boolean)
- En programacion es muy amenudo un tipo de dato que tenga uno de dos valores, como: SI / NO, ENCENDIDO / APAGADO, VERDADERO / FALSE (TRUE / FALSE); para ello se un el booleano
- Se escribe 'boolean' para asignar el tipo de variable, luego el nombre de dicha variable y los valoresa asignar pueden ser 'True' o 'False'

## Caracteres
- El tipo de dato 'char' es usado para asignar una variable en donde el valor es una sola letra (caracter)

## Cadenas de caracteres (strings)
- El tipo de dato 'String' almacena cadenas de caracteres(texto)

## Tipos no primitivos
- Dentro de los tipos no primitivos, son aquellos que se crean como los arrays, las clases, las interfaces, etc.

# Conversion de tipos en Java
- En Java hay dos tipos de conversion de datos(casting), los cuales son:
 - Widening Casting: Este tipo convierte un tipo mas pequeño de dato a un tipo de tamaño mas grande, la secuencia de este tipo es: byte -> short -> char -> int -> long -> float -> double (este pasa de forma automatica)
 - Narrowing Casting: Este tipo convierte un tipo de mayor tamaño a uno de menor tamaño, la secuencia de este tipo es: double -> float -> long -> int -> char -> short -> byte (este pasa de forma manual)

# Operadores de Java
- Los operadores en Java se usan para realizar operaciones sobre variables y valores

## Operador de suma
- El operador se suma se usa para sumar dos valores ( int x = 10 + 10 )




> [!NOTE]
> - Java se puede usar y es mejor usarlo en un IDE (Integrated Development Environment) como Intellij IDEA, Netbeans o Eclipse
> - Las llaves {} marcan el comienzo y el final de un bloque de codigo
> - 'System' es una palabra incorporada en Java que contiene miembros utiles, el mas conocido es 'out' que es la abreviatura de output(salida); por ende, la combinacion 'System.out.println()' simplemente lo que hace es imprimir lineas de texto en pantalla
> - Cada declaracion de codigo se debe de terminar con un punto y coma (;)
> - Hay que tener en cuenta que si se le asigna un nuevo valor a alguna variable, sobreescribira el valor de dicha variable, si no queremos que esto pase se le agrega la palabra 'final' al inicio de toda la secuencia de declaracion de variables ' final int myNum = 15; '
> - El signo y/o operador del mas ( + ) sirve tanto para concatenar variables, strings, numeros, como tambien funcion matematica de sumar numeros
> - Cuando usemos el tipo de dato numerico entero 'long' debemos agregar una L al numero de valor de esa variable
> - Cuando usemos el tipo de datos flotante ya sea 'float' o 'double' debemos agregar la letra en cuestion al final del valor numerico para determinar que el numero es fraccionario, para float se agrega una 'f' y para double es una 'd'
> - Cuando se use el tipo de dato 'char' el caracter como valor de la variable, debe de estar entre comillas simples
> - Cuando se use el tipo de dato 'string' el valor debe estar entre comillas dobles
> - Los tipos de datos no primitivos suelen inciar con mayuscula, ademas que pueden tener como valor 'null'
> - Cuando estemos haciendo un 'Narrowing Casting' debemos de escribir el tipo de dato por el cual estamos haciendo la conversion