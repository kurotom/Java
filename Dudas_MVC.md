# DUDAS MVC

1. Un controlador para gobernarlos a todos

Se puede crear un controlador que cree una instancia de un pool connection entregando una conexion del mismo pool en lugar de llamar la clase del pool connection en cada controlador diferente.

CentralController entregaría una conexión para cada controlador y este deriven en las operaciones necesarias.

CentralController se crearía al principio de la inicialización de la aplicación y utilizaría el mismo pool para toda ella, (un pool por cada apertura de aplicación independiente de otras.)


Esquema de la idea

```
                    CentralController
                                  |
                 |----------------------------|
                 |                                  |
UsuariosController   PedidosController
               |                                 |
    UsuariosDAO             PedidosDAO
```


CentralController : instancia un "FactoryConnection", entregar una conexiona cada Controlador. Estos los entregaría por medio de parámetros de constructor o herencia.

UsuariosController : recibe una conexión para realizar las tareas y derivarlas a UsuariosDAO.

PedidosController : recibe una conexión para realizar las tareas y derivarlas a UsuariosDAO.


¿Esto se resolvería mediante herencia de *CentralController* a *UsuariosController*, *PedidosController* y todos los otros controladores que se creen?

Creo que debería ser heredada porque si se implementa, se debe implementar los métodos y esto llevaría a crear un nuevo pool mediante el uso de la clase pool connection.


