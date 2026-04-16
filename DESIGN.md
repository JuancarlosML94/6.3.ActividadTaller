# Diseño UML - Taller MerceDAWs

```mermaid
classDiagram

class Vehiculo {
  -matricula : String
  -modelo : String
  +Vehiculo(matricula : String, modelo : String)
  +getMatricula() String
  +setMatricula(matricula : String) void
  +getModelo() String
  +setModelo(modelo : String) void
}

class Coche {
  +Coche(matricula : String, modelo : String)
}

class Moto {
  +Moto(matricula : String, modelo : String)
}

class Cliente {
  -nombre : String
  -vehiculos : List~Vehiculo~
  +Cliente(nombre : String)
  +getNombre() String
  +setNombre(nombre : String) void
  +getVehiculos() List~Vehiculo~
  +addVehiculo(vehiculo : Vehiculo) void
}

class Reparacion {
  -descripcion : String
  -fecha : String
  -coste : double
  +Reparacion(descripcion : String, fecha : String, coste : double)
  +getDescripcion() String
  +setDescripcion(descripcion : String) void
  +getFecha() String
  +setFecha(fecha : String) void
  +getCoste() double
  +setCoste(coste : double) void
}

class Especialista {
  <<interface>>
  +reparar(reparacion : Reparacion) void
}

class Mecanico {
  -nombre : String
  +Mecanico(nombre : String)
  +getNombre() String
  +setNombre(nombre : String) void
  +reparar(reparacion : Reparacion) void
}

class Taller {
  -nombre : String
  +Taller(nombre : String)
  +asignarReparacion(mecanico : Mecanico, reparacion : Reparacion) void
}

Vehiculo <|-- Coche
Vehiculo <|-- Moto

Cliente "1" o-- "1..*" Vehiculo : posee
Vehiculo "1" *-- "0..*" Reparacion : historial
Especialista <|.. Mecanico
Taller ..> Mecanico : usa
