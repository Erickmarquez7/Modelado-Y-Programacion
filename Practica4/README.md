## Práctica 4: Factory, Abstract Factory y Builder
### Menciona los principios de diseño esenciales del patrón Factory, Abstract Factory y Builder

+ __Factory__: Define una interfaz para crear un objeto pero deja que las subclases decidan cual

  Los principios que sigue este patrón son:
   - Principio de inversión de dependencia: Depende de las abstracciones, no de las clases concretas

+ __Abstract Factory__:  Proporciona una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas

  Los principios que sigue este patrón son:
   - Principio de inversión de dependencia: Depende de las abstracciones, no de las clases concretas

+ __Builder__: Permite construir distintas representaciones de objetos complejos paso a paso usando constructores de objetos simples. La construcción de los objetos complejos dependerá de un director que tratará a cada componente (que debe estar modularizado) como una etapa de la construcción.

  Los principios que sigue este patrón son:
   - Responsabilidad unica

 
### Menciona una desventaja de cada patrón.

- __Factory__: Puede complicarse si tenemos varias subclases

- __Abstract Fctory__: Puede complicarse aún más si tenemos varias subclases y varios diseños, mas que comlicado es, quizá, tedioso.

- __Builder__: La complejidad puede aumentar puesto que hay que crear varias clases para un objeto


### Justifiación
El patrón __factory__ definitivamente no es conveniente, pues hay que crear varios tipos de objetos de las partes de un auto, fabrica solo funcionaria si
tuviéramos un tipo de componente Armas o Blindaje o Carrocería..., pero en este caso tenemos 5 tipos de componente.

__Builder__ presenta un problema similar pero “al revés”, es decir, podemos tener los 5 tipos de componentes pero no subtipos para crear el auto.
Es por esto que decidimos implementar __Abstract Factory__ porque nos permite crear distintos tipos, así como subtipos de los mismos.

No se necesita de algún software adicional para el funcionamiento de la práctica. Puede ser fácilmente compilada con:

`$javac *.java`

Y ejecutada con

`$java Main.java`

### Diagrama de clases

![](https://github.com/Erickmarquez7/ModeladoYProgramacion/blob/master/Practica04%20Abstract%20factory/diagrama.png)
