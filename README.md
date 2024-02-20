PRIMERA PARTE

Suponer un sistema de reserva de asientos par un anfiteatro. El teatro cuenta
con 10 filas de 10 asientos. Se necesita desarrollar un sistema, sin uso de base de datos,
unicamente manejo de datos de forma lógica que permita llevar a cabo lo siguiente:

1. cargar el mapa de la filas y asientos. Indicados con una "X" los asientos ocupados
y con una "L" los asientos libres. Al iniciar el programa, todos los asientos deben estar libres.

2. Manejar la reserva de asientos contemplados que un asiento SOLO PUEDE ESTAR RESERVADO, si se encuentra en estado "L"; en caso de que este en estado "X"
se debera permitir al comprador elegir otro asiento.
si se encuentra en estado "L", debera pasar automaticamente al estado "X".

3. Para finalizar el programa se deberá ingresar un valor en particular. Contemplar que no existe una cantidad exacta de veces que el programa se pueda ejecutar.

4. Contemplar que SOLO EXISTEN 10 FILAS y 10 ASIENTOS, No se pueden vender asientos fuera de esas numeracion. No se permite sobreventa.

Extra: En caso de que un cliente solicite visualizar cuales son los asientos libres, el sistema debe permitir mostrar de forma grafica el mapa de asientos.


SEGUNDA PARTE

Basandose en el mismo sistema de reserva de asientos para un anfiteatro, llego el momento de plantear el "sistema de tickets"
que obtendra cada persona al reservar su asiento. Para ello tener en cuenta:

1. Crear la "plantilla" necesaria para guardar los siguientes datos  por ticket: numero, fila, fecha de compra, fecha de validez, precio.

2. Usar una base de datos logica, mediante una estructura de datos que permita almacenar un numero indeterminado de tickets. Cargar una serie de tickets a dicha estructura.

3. Crea un metodo que recorra dicha estructura seleccionada y sume los precios de todos los tickets. Mostrar por pantalla 
el total.

4. Solicitar al usuario que ingrese un numero de fila. A partir de esto, mostrar por pantalla los datos de los tickets
pertenecientes a esta fila.

Extra: En caso de que se desee agregar una plantilla para clientes con los datos: id, dni, nombre apelliido,.
Como se inplementaria? De que manera se relacionaria con tickets? para que el mismo posea los datos del cliente
que tiene asigndo?.
