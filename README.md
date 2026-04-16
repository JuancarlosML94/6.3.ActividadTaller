# Sistema de Gestión de un Taller de Vehículos
## Justificación del diseño

### ¿Por qué he elegido composición entre Vehiculo y Reparacion?

He elegido una relación de composición entre `Vehiculo` y `Reparacion` porque una reparación no tiene sentido sin un vehículo, tal y como indica el enunciado.

Esto significa que la reparación depende completamente del vehículo al que pertenece. Forma parte de su historial y no existe de manera independiente dentro del sistema. Por tanto, si un vehículo desaparece, sus reparaciones también deberían desaparecer.

Por este motivo, la composición representa mejor esta relación que una agregación o una asociación simple.

---

### ¿Qué ventaja tiene usar la interfaz Especialista?

La interfaz `Especialista` permite definir un comportamiento común mediante el método `reparar()`. Gracias a esto, cualquier clase que implemente esta interfaz estará obligada a implementar ese método.

Esto aporta varias ventajas:
- Permite usar polimorfismo
- Hace el sistema más flexible
- Facilita añadir nuevos tipos de especialistas en el futuro (por ejemplo, chapistas o electricistas) sin modificar el código existente

En resumen, mejora la mantenibilidad y escalabilidad del sistema.

## UML generado 

Este diagrama ha sido generado automáticamente a partir del código fuente utilizando PlantUML, como parte de la fase de ingeniería inversa.

Nota: GitHub no permite visualizar directamente archivos `.puml`, por lo que te incluyo una captura del diagrama generado para facilitarte la revisión.

<img width="881" height="480" alt="image" src="https://github.com/user-attachments/assets/9ac7f9ba-4dac-456a-88da-d299c5885aa8" />
