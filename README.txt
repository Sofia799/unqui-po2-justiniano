1) Evaluación de protocolos de una clase
    Sea la clase Rectángulo con 4 variables de instancia (esquinaSuperiorIzquierda, esquinaSuperiorDerecha, esquinaInferiorIzquierda y esquinaInferiorDerecha). Elija uno de los protocolos presentados a continuación y justifique su elección. Recuerde que el protocolo es el conjunto de mensajes que entiende una clase o tipo.
    
      * Elijo la opción 1 porque la instancia de la clase Rectangulo va a saber responder los mensajes esquinaSuperiorIzquierda, esquinaSuperiorDerecha, esquinaInferiorIzquierda y esquinaInferiorDerecha, van a responder a un mismo procotolo.
      
2) Delegación
    En una oficina hay un jefe que tiene un secretario el cual administra un fichero. Dadas las siguientes implementaciones seleccione la mejor alternativa y justifique.
      
      *Elijo la opción 2 porque no está rompiendo encapsulamiento entre los objetos que se envían mensajes, ya que primero en la implementación en Jefe>>trabajarConFicha: unaFicha
       su método va a ser delegado por self secretario, el cual su secretario sabrá responder el mensaje buscarFichero: unaFicha, para luego el método de dicho mensaje será              delegado a self fichero, y Fichero sabrá interpretar el mensaje buscar. No hay anidamiento de mensajes por lo que lo hace más entendible al código.
       
3) Polimorfismo
    Existen cuentas bancarias que pueden ser de tipo CajaDeAhorro y CuentaCorriente. Indique los defectos de cada una de las opciones.
      
      *Opción 1: Uno de los errores que tiene este método es que la primera comparación que realiza es (self class = CuentaCorriente) , self class se refiere a la metaclass de CuentaBancaria y CuentaCorriente es una subclass de CuentaBancaria. Aún así, el código en si esta mal hecho, muy poco legible y muy poco entendible.
      
      *Opcion 2: El error acá es que en la primera comparación que realiza (self tipo = 'cuentacorriente') , el tipo cuenta corriente lo impone como un String y en realidad debería ser una subClass de CuentaBancaria.
      
      *Opcion 3: En esta implementación le falta tener un mensaje de error en una excepción para cuando no haya saldo suficiente para extraer. Si no tiene saldo suficiente o mayor al monto que pasan por colaborador externo, explota. (Para ambas cuentas)
      
      *Opcion 4: En CuentaBancaria>>extraer:unMonto debería haber un subclass responsability para que cada cuenta sepa de que forma extraer. No se estaría aplicando de forma adecuada el polimorfismo ya que cada cuenta tiene su implementacion de extraer:unMonto pero ese mensaje no está implementado en la super clase como subclass responsability y el mensaje chequearSaldoParaExtraccion: unMonto tampoco.
      
 4) 

