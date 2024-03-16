
# Proyecto Bank_Poo

  Autenticable       Funcionario
   /        \        /        \
  /          \      /          \
Cliente      Gerente          Asistente
    \      Administrador      Contador
     \         /
    SistemaInterno


## Cuenta

Cuenta      - abstract - superclass
 + ahorro   - extends  - subclass
 + credito  - extends  - subclass

* Métodos Cuenta
  - depositarSaldo
  - consultarSaldo
  - retirarSaldo
  - transferirSaldo
 
* Atributos Cuenta
 - saldo
 - agencia
 - numeroCuenta
 - titular          - Cliente
 - montoComisiones


## Cliente

Cliente

* Atributos Cliente
  - nombre
  - telefono
  - numeroDocumento


## Funcionario

Funcionario  - abstract - superclass
 + Gerente   - extends  - subclass
 + Contador  - extends  - subclass
 + Asistente - extends  - subclass

* Atributos Funcionario
  - nombre
  - salario
  - identificador
  - rol
 
* Método Funcionario
  - bonificacion    - abstract
  


## Sistema Interno

SistemaInterno - interface

* Método SistemaInterno
  - autenticar
  
  
## Clase Utilitaria

CheckLogin - class

Comprueba y devuelve booleano si clave entregada coincide con la del usuario registrado.
