# Introduction #

Add your content here.


# Details #

Servicios Asociados a Nodos

**Nodo 1: Ventas**

**Método: Consulta Clientes**

**Descripción:** Este método consiste si el cliente está registrado  en la base de datos, si en caso no se encuentra registrado se pasa al registro.


**Parámetros:** dni

**Valor de Retorno:** lis objeto existe


**Método: Consulta ruta x horario**

**Descripción:** Para poder determinar si una ruta pre terminada existe pasaje disponible con la ruta, fecha y hora especificada.


**Parámetros:** destino, fecha,hora

**Valor de retorno:** list objeto ruta


**Método: Consulta asientos disponibles x Bus**

**Descripción:** Permite encontrar si existe asiento disponible


**Parámetros:** lugar, hora, fecha

**Valor de retorno:** list objeto asiento


**Método: Registro Pasaje**

**Descripción:** Esta método registra el pasaje con las descripciones del cliente cuando se hayan encontrado ruta y asiento disponibles


**Parámetros:** dni, apellidos, nombres

**Valor de retorno:** codigo de pasaje


**Nodo 2: Rutas**

**Servicio Consulta Rutas x Bus Disponible**

Descripción: Se requiere la información de los buses disponibles los cuales serán usados en la ruta.


> Operación:Consulta Rutas x Bus Disponible

> Valores de Retorno: Listado de Buses

> Parametros: Placa


**Servicio Consulta Personal Disponible**

Descripción: Se  requiere asignar al personal disponible para la ruta.


> Operación: Consulta Personal Disponible

> Valores de Retorno: Listado de Personal

> Parametros: DNI, Apellido



**Nodo 3: Clientes**

**Servicio Busqueda Clientes**


Descripcion: Este servicio permitira visualizar los clientes que se tienen ingresados en el sistema y sus puntos acumulados. Por cada viaje que el cliente realiza se el asigna 1 punto.



> Operacion: Consulta Clientes X DNI


> Valores de Retorno: List objetos Cliente


> Parametros: Nombre Cliente, DNI


**Servicio Promociones**


Descripcion: Este servicio permitira visualizar las rutas que cada persona tiene, de acuerdo a la cantidad de puntos que dispone.


> Operacion: Consulta Rutas X Puntos


> Valores de Retorno: List objetos Rutas


> Parametros: Nombre Cliente, DNI


**Servicio Registro Clientes**

Descripcion: Este servicio permitira registrar clientes en el sistema.


> Operacion: Registrar Clientes


> Valores de Retorno: Cliente


> Parametros: Nombre Cliente, DNI , fecha Nacimiento,edad,direccion.