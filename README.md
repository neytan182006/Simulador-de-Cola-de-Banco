# Simulador de Cola de Banco

Simulación de una fila de atención bancaria usando una **Cola (FIFO)** implementada a mano con nodos enlazados (sin `java.util.Queue`), para el curso de **Estructuras de Datos**.

## Estructura

```
src/
├── Cliente.java   → POJO (nombre, motivo)
├── Nodo.java       → nodo de la cola (cliente + referencia al siguiente)
├── Cola.java       → front/rear, encolar/desencolar/frente/estaVacia, valida underflow
└── Main.java        → menú de consola
```

## Cómo ejecutarlo

```bash
javac -d bin src/*.java
java -cp bin Main
```

> Compilado y verificado con `javac` sin errores.

## Capturas

_Pendiente: agregar capturas en `capturas/`._

## Licencia

MIT — ver [LICENSE](LICENSE).
