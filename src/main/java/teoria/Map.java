package teoria;

/*
 * ==================== TEORÍA DE MAP EN JAVA ====================
 * 
 * Un Map es una estructura de datos que almacena datos en pares CLAVE-VALOR.
 * Piensa en un diccionario: cada palabra (key) tiene una definición (values).
 * 
 * CONCEPTOS PRINCIPALES:
 * 
 * 1. PAR CLAVE-VALOR
 *    - key: identificador único (no puede haber key duplicadas)
 *    - values: el dato asociado a esa clave (sí pueden haber values repetidos)
 *    
 *    Ejemplo: {
 *             "Juan" → 25
 *             "María" → 30
 *             "Pedro" → 25
 *            }
 *    Las keys "Juan", "María", "Pedro" son únicas
 *    Pero el values 25 aparece dos veces (está permitido)
 * 
 * 2. ACCESO A DATOS
 *    En una lista accedes por POSICIÓN: lista.get(0), lista.get(1)
 *    En un Map accedes por CLAVE: map.get("Juan")
 *    Esto es mucho más eficiente cuando tienes muchos datos
 * 
 * 3. USOS COMUNES
 *    - Almacenar datos de usuarios: key=ID, values=datos del usuario
 *    - Contar frecuencias: key=palabra, values=cuántas veces aparece
 *    - Traductor: key=palabra en español, values=palabra en inglés
 *    - Caché: key=URL, values=contenido descargado
 * 
 * 4. OPERACIONES BÁSICAS
 *    put(clave, valor)      → Añadir o actualizar un par
 *    get(clave)             → Obtener el valor de una clave
 *    remove(clave)          → Eliminar un par
 *    containsKey(clave)     → Verificar si existe una clave
 *    keySet()               → Obtener todas las claves
 *    values()               → Obtener todos los valores
 *    size()                 → Cuántos pares hay
 *    isEmpty()              → ¿Está vacío?
 * 
 * 5. EJEMPLO PRÁCTICO
 *    
 *    Map<String, Integer> edades = new HashMap<>();
 *    
 *    edades.put("Juan", 25);     // Guardar que Juan tiene 25 años
 *    edades.put("María", 30);    // Guardar que María tiene 30 años
 *    
 *    int edadJuan = edades.get("Juan");  // Obtener: 25
 *    
 *    edades.remove("Juan");      // Eliminar a Juan
 *    
 *    if (edades.containsKey("María")) {
 *        System.out.println("María existe en el mapa");
 *    }
 * 
 * 6. DIFERENCIA ENTRE TIPOS DE MAP
 *    - HashMap: NO mantiene orden. Acceso RÁPIDO. Mejor para búsquedas.
 *    - LinkedHashMap: Mantiene el ORDEN DE INSERCIÓN.
 *    - (Hay otros tipos, pero estos son los más comunes)
 * 
 * 7. RECORRER UN MAP
 *    
 *    // Opción 1: Recorrer solo claves
 *    for (String clave : mapa.keySet()) {
 *        System.out.println(clave);
 *    }
 *    
 *    // Opción 2: Recorrer solo valores
 *    for (Integer valor : mapa.values()) {
 *        System.out.println(valor);
 *    }
 *    
 *    // Opción 3: Recorrer pares clave-valor (más común)
 *    for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
 *        String clave = entrada.getKey();
 *        Integer valor = entrada.getValue();
 *        System.out.println(clave + " → " + valor);
 *    }
 * 
 * 8. VENTAJAS DE USAR MAP
 *    ✓ Búsqueda muy rápida por clave
 *    ✓ Código más legible y semántico
 *    ✓ Ideal para pares de datos relacionados
 *    ✓ Flexible: puedes usar cualquier tipo como clave y valor
 * 
 * 9. EJEMPLO REAL: CONTADOR DE PALABRAS
 *    
 *    Map<String, Integer> contador = new HashMap<>();
 *    
 *    String[] palabras = {"casa", "gato", "casa", "perro", "casa"};
 *    
 *    for (String palabra : palabras) {
 *        if (contador.containsKey(palabra)) {
 *            contador.put(palabra, contador.get(palabra) + 1);
 *        } else {
 *            contador.put(palabra, 1);
 *        }
 *    }
 *    
 *    // Resultado:
 *    // casa → 3
 *    // gato → 1
 *    // perro → 1
 */

public class Map {
    
}
