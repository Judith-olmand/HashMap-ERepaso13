# Almacenamiento por Clave-Valor con HashMap (Repaso 13)

Programa en Java que implementa el uso de mapas para crear asociaciones lógicas entre nombres (claves) y edades (valores), garantizando una recuperación de datos eficiente.

## 🚀 Funcionalidades
* **Asociación de Datos:** Utiliza un `HashMap` para vincular cadenas de texto con números enteros, permitiendo organizar la información como pares clave-valor.
* **Gestión de Claves Únicas:** El mapa asegura que cada nombre funcione como un identificador único, simplificando la búsqueda y actualización de datos.
* **Entrada Robusta:** Implementa un bucle `do-while` con control de excepciones para validar que la edad introducida sea siempre un valor numérico.
* **Recorrido Eficiente:** Utiliza el conjunto de claves (`keySet`) para iterar sobre el mapa y recuperar los valores asociados de forma dinámica.

## 🛠️ Estructura técnica
El código demuestra el manejo de diccionarios y control de flujo avanzado:
* **`HashMap<String, Integer>`**: Estructura que utiliza funciones hash para indexar las claves, ofreciendo un rendimiento constante en operaciones de inserción y búsqueda.
* **Método `put(K, V)`**: Operación principal para añadir o actualizar entradas en el mapa.
* **Método `get(K)`**: Permite recuperar el valor asociado a una clave específica durante la iteración.
* **Limpieza de Búfer**: El uso estratégico de `sc.nextLine()` previene errores comunes de salto de línea al combinar la lectura de enteros y texto.