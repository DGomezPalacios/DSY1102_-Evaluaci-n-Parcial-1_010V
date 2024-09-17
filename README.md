# DSY1102_-Evaluaci-n-Parcial-1_010V

RentCar, se encuentra en una etapa de modernización de sus procesos, por lo cual ha decidido contratar sus servicios para que desarrolle un sistema que permita almacenar la información de sus vehículos en arriendo por categoría.
Los vehículos tienen un precio diario de arriendo (sin IVA) y cantidad de días que se arrendarán. Se clasifican en vehículos de carga y pasajeros. Los vehículos de carga tienen capacidad de carga en que se mide en kilos y los vehículos de pasajeros tienen la cantidad de pasajeros que pueden transportar. El desarrollo de la aplicación debe responder a los siguientes requerimientos:

• Cada vehículo debe poseer patente para identificarlo como único

• La clase padre debe ser abstracta.

• Las clases hijas no deben tener subclases.

• Debe existir un método para mostrar los datos del vehículo dependiendo del tipo (carga o pasajero)

• Debe considerar generar por lo menos un constructor vacío y uno sobrecargado con todos sus datos en cada clase que se deba instanciar

- Debe implementar una interfaz con las siguientes constantes y un método

• IVA: 19%

• DESCUENTO_CARGA: 3%

• DESCUENTO_PASAJEROS: 7%

- Debe existir un método en el archivo de interfaz de java que permita mostrar el detalle de la boleta, considerando el valor de arriendo, el descuento, el IVA y el total
  
- Debe existir una clase auxiliar que permita almacenar los vehículos con las siguientes funcionalidades implementadas:
  
• Debe validar que el vehículo agregado no exista por su patente antes de guardar

• Un método que retorne la lista de vehículos

Todas las clases deben tener los siguientes métodos implementados: constructores, accesadores y mutadores.

- En la clase main debe:
  
• Agregar un vehículo de carga y otro de pasajeros a la colección

• Listar los vehículos

• Mostrar las boletas de pago de cada vehículo
