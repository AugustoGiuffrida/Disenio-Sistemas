| Clase 1    | Relación      | Clase 2     | Tipo                                                                                                                                           |
| ---------- | ------------- | ----------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| **Cereal** | requiere      | **Mineral** | **Composición**: cada cereal tiene definidos los minerales necesarios (si desaparece el cereal, la lista de requerimientos también). |
| **Lote**   | tiene         | **Mineral** | **Agregación**: un lote está caracterizado por minerales, pero estos pueden existir en un catálogo independiente.                              |
| **Lote**   | puede sembrar | **Cereal**  | **Asociación / Regla de negocio**: relación débil, sirve para evaluar si un lote cumple con los minerales que requiere un cereal.              |

----

# Enums

En **Java**, un `enum` (abreviatura de *enumeration*) es un **tipo especial de clase** que se utiliza para **representar un conjunto fijo y limitado de constantes**.

Por ejemplo, en tu ejercicio tenés:

```java
public enum TipoCereal {
    GRUESO,
    FINO,
    PASTURA
}
```

### 🔎 ¿Qué significa esto?

* **`enum` define un tipo propio** llamado `TipoCereal`.
* Los valores posibles son exactamente: `GRUESO`, `FINO` y `PASTURA`.
* Es como una "lista cerrada de opciones" que no puede expandirse con valores inventados en tiempo de ejecución.

---

### ✅ Ventajas de usar `enum` en lugar de Strings o números

1. **Legibilidad**: en lugar de comparar con `"GRUESO"` o `"FINO"` como texto, usamos `TipoCereal.GRUESO`.
2. **Seguridad en tiempo de compilación**: el compilador sabe que solo existen esos valores. Si intentás pasar cualquier otra cosa, marca error.
3. **Evita errores tipográficos**: escribir `"Grueso"` vs `"GRUESO"` puede dar problemas con `String`. Con `enum`, no.
4. **Posibilidad de agregar métodos**: un `enum` en Java puede tener atributos y comportamientos propios (no es solo un valor estático).

---

### 📌 Ejemplo práctico

```java
public enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

public class EjemploEnum {
    public static void main(String[] args) {
        DiaSemana hoy = DiaSemana.LUNES;

        if (hoy == DiaSemana.SABADO || hoy == DiaSemana.DOMINGO) {
            System.out.println("Es fin de semana 🎉");
        } else {
            System.out.println("Es día de semana 😓");
        }
    }
}
```

Salida:

```
Es día de semana 😓
```

---
