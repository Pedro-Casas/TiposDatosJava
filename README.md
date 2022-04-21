# Tipo de datos en java

### JVM(java virtual machine)

* Realiza una gestin eficiente de la memorian 
*  distribuye la memoria en dos zonas:
* stock(pila) y heap (monton)
![Ram](ram.jpeg.jpeg)
## stack
* se almacenan: variables locales, llamadas a metodos(parametros y resultados=), variables primitivas, referencias a objetos del heap.
* memoria estatica.

## heap
* es gestionado por el garbage collector.
* espacio de memoria en tiempo de ejecucion donde se registran los objetos.
* es una memoria dinamica.
* no posee estructura de asignacion de espacios.

## variable
* contenedor de memoria donde se almacena informacion.
* en java se declara con un tipo que se conservara durante todo su ciclo de vida.
* en el interior de la aplicacion. 
* la variable debe tener un nombr.
*existe de tipo primitivo y referenciado.

## Primitivos
* contenedores de tamaño especifico que almacena valores y no tienen metodos.
*ejemplo boolean, char, byte, short, long, float, double.

## Referenciales
*almacenaa las referencias a los datos.
*estos atos se escriben en una zona de memoria llamada heap.