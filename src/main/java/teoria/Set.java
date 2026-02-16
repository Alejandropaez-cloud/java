package teoria;

/*
 * ==================== TEORÍA DE SET EN JAVA ====================
 * 
 * Un Set es una colección que almacena elementos ÚNICOS (sin duplicados).
 * Piensa en él como un conjunto matemático: cada elemento aparece una sola vez.
 * 
 * CONCEPTOS PRINCIPALES:
 * 
 * 1. ELEMENTOS ÚNICOS
 *    Un Set NO permite elementos duplicados.
 *    Si intentas añadir un elemento que ya existe, simplemente NO se añade.
 *    
 *    Ejemplo:
 *    Set<String> frutas = new HashSet<>();
 *    frutas.add("manzana");
 *    frutas.add("plátano");
 *    frutas.add("manzana");  // No se añade (ya existe)
 *    
 *    Resultado: {"manzana", "plátano"}  (2 elementos, no 3)
 * 
 * 2. NO TIENE ORDEN
 *    En una lista tienes: [posición 0], [posición 1], [posición 2]
 *    En un Set no hay posiciones. Los elementos están "sueltos"
 *    No puedes hacer: set.get(0) o set.get(1)
 *    
 * 3. COMPARACIÓN CON OTRAS ESTRUCTURAS
 *    
 *    Lista [1, 2, 3, 2]       → Permite duplicados, tiene orden
 *    Set {1, 2, 3}            → NO permite duplicados, no tiene orden
 *    Map {"a"→1, "b"→2}       → Pares clave-valor únicos
 * 
 * 4. USOS COMUNES
 *    - Almacenar elementos únicos (usuarios registrados, ciudades visitadas)
 *    - Eliminar duplicados de una lista
 *    - Comprobar si un elemento existe rápidamente
 *    - Operaciones matemáticas: intersección, unión, diferencia
 * 
 * 5. OPERACIONES BÁSICAS
 *    add(elemento)           → Añadir un elemento
 *    remove(elemento)        → Eliminar un elemento
 *    contains(elemento)      → Verificar si existe
 *    size()                  → Cuántos elementos hay
 *    isEmpty()               → ¿Está vacío?
 *    clear()                 → Eliminar todo
 * 
 * 6. EJEMPLO PRÁCTICO
 *    
 *    Set<String> estudiantes = new HashSet<>();
 *    
 *    estudiantes.add("Juan");
 *    estudiantes.add("María");
 *    estudiantes.add("Juan");      // No se añade
 *    
 *    System.out.println(estudiantes.size());  // Imprime: 2
 *    
 *    if (estudiantes.contains("Juan")) {
 *        System.out.println("Juan está inscrito");
 *    }
 *    
 *    estudiantes.remove("María");   // Eliminar a María
 * 
 * 7. TIPOS DE SET
 *    
 *    - HashSet: NO mantiene orden. Acceso RÁPIDO. Más común.
 *      Ejemplo: {3, 1, 2, 5} (el orden es aleatorio)
 *    
 *    - LinkedHashSet: Mantiene el ORDEN DE INSERCIÓN.
 *      Ejemplo: {3, 1, 2, 5} (en el orden en que se añadieron)
 *    
 *    - TreeSet: Mantiene elementos ORDENADOS (requiere tipos comparables)
 * 
 * 8. RECORRER UN SET
 *    
 *    Set<String> frutas = new HashSet<>();
 *    frutas.add("manzana");
 *    frutas.add("plátano");
 *    frutas.add("naranja");
 *    
 *    // Opción 1: Bucle for-each (más común)
 *    for (String fruta : frutas) {
 *        System.out.println(fruta);
 *    }
 *    
 *    // Opción 2: Usando iterador
 *    Iterator<String> it = frutas.iterator();
 *    while (it.hasNext()) {
 *        System.out.println(it.next());
 *    }
 *    
 *    // Opción 3: Usando streams
 *    frutas.forEach(fruta -> System.out.println(fruta));
 * 
 * 9. EJEMPLO: ELIMINAR DUPLICADOS DE UNA LISTA
 *    
 *    List<Integer> numeros = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
 *    Set<Integer> unicos = new HashSet<>(numeros);
 *    
 *    // unicos contiene: {1, 2, 3, 4}
 *    // De forma muy sencilla, eliminamos todos los duplicados
 * 
 * 10. OPERACIONES MATEMÁTICAS CON SETS
 *     
 *     Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4));
 *     Set<Integer> b = new HashSet<>(Arrays.asList(3, 4, 5, 6));
 *     
 *     // Unión: elementos de a y b
 *     a.addAll(b);  // a ahora contiene {1, 2, 3, 4, 5, 6}
 *     
 *     // Intersección: elementos comunes
 *     a.retainAll(b);  // a ahora contiene {3, 4}
 *     
 *     // Diferencia: elementos de a que NO están en b
 *     a.removeAll(b);  // a ahora contiene {1, 2}
 * 
 * 11. VENTAJAS DE USAR SET
 *     ✓ Garantiza unicidad de elementos automáticamente
 *     ✓ Búsqueda muy rápida para verificar si existe un elemento
 *     ✓ Ideal para datos sin orden específico
 *     ✓ Reduce duplicados sin código extra
 * 
 * 12. DESVENTAJAS
 *     ✗ No puedes acceder por posición (no hay get(0))
 *     ✗ El orden no se garantiza (en HashSet)
 *     ✗ No puedes conocer la posición de un elemento
 * 
 * 13. EJEMPLO REAL: PALABRAS ÚNICAS EN UN TEXTO
 *     
 *     String texto = "java java python javascript java python";
 *     String[] palabras = texto.split(" ");
 *     Set<String> palabrasUnicas = new HashSet<>(Arrays.asList(palabras));
 *     
 *     System.out.println(palabrasUnicas);  
 *     // Output: {java, python, javascript}
 *     // Automáticamente eliminó duplicados
 * 
 * 14. COMPARACIÓN: LISTA vs SET
 *     
 *     List<Integer> lista = new ArrayList<>();
 *     Set<Integer> conjunto = new HashSet<>();
 *     
 *     // Añadir elementos
 *     lista.add(5);  lista.add(5);   // Lista: [5, 5]
 *     conjunto.add(5); conjunto.add(5);  // Set: {5}
 *     
 *     // Acceso
 *     lista.get(0);      // ✓ Funciona
 *     conjunto.get(0);   // ✗ No existe este método
 *     
 *     // Búsqueda
 *     lista.contains(5);      // Busca desde el principio (lenta con muchos elementos)
 *     conjunto.contains(5);   // Búsqueda rápida (optimizada)
 */

public class Set {
    
}
