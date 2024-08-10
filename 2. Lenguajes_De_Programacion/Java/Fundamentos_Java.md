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
    - short -> tiene 2 bytes de tamaño y almacena numeros entre -32,768 y 32,767
    - int -> tiene 4 bytes de tamaño y almacena numeros entre -2,147,483,648 y 2,147,483,647
    - long -> tiene 8 bytes de tamaño y almacena numeros entre -9,223,372,036,854,775,808 y 9,223,372,036,854,775,807
    - float -> tiene 4 bytes de tamaño y almacena numeros decimales (entre 6 y 7 digitos despues de la coma)
    - double -> tiene 8 bytes de tamaño y almacena numeros decimales (15 digitos despues de la coma)
    - boolean -> tiene 1 byte de tamaño y almacena true o false
    - char -> tiene 2 bytes de tamaño y almacena un letra
  - Tipos de datos no primitivos: matrices y clases

## Numeros
- 



> [!NOTE]
> - Java se puede usar y es mejor usarlo en un IDE (Integrated Development Environment) como Intellij IDEA, Netbeans o Eclipse
> - Las llaves {} marcan el comienzo y el final de un bloque de codigo
> - 'System' es una palabra incorporada en Java que contiene miembros utiles, el mas conocido es 'out' que es la abreviatura de output(salida); por ende, la combinacion 'System.out.println()' simplemente lo que hace es imprimir lineas de texto en pantalla
> - Cada declaracion de codigo se debe de terminar con un punto y coma (;)
> - Hay que tener en cuenta que si se le asigna un nuevo valor a alguna variable, sobreescribira el valor de dicha variable, si no queremos que esto pase se le agrega la palabra 'final' al inicio de toda la secuencia de declaracion de variables ' final int myNum = 15; '
> - El signo y/o operador del mas ( + ) sirve tanto para concatenar variables, strings, numeros, como tambien funcion matematica de sumar numeros