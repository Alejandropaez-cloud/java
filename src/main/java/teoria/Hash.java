package teoria;

/**
 * Clase Hash: Teoría y conceptos relacionados con las colecciones basadas en hash en Java
 *
 * Las colecciones basadas en hash utilizan tablas de hash para almacenar y recuperar elementos de manera eficiente.
 * La clave es el método hashCode() de los objetos, que determina la posición en la tabla.
 *
 * Principales implementaciones:
 * 1. HashMap: Mapa que asocia claves con valores. No ordenado, permite null como clave y valores.
 * 2. HashSet: Conjunto que no permite duplicados. Basado en HashMap internamente.
 * 3. LinkedHashMap: Similar a HashMap pero mantiene el orden de inserción.
 * 4. LinkedHashSet: Similar a HashSet pero mantiene el orden de inserción.
 * 5. Hashtable: Versión sincronizada de HashMap (legacy, usar ConcurrentHashMap en su lugar).
 * 6. ConcurrentHashMap: Versión thread-safe de HashMap para entornos concurrentes.
 *
 * Características comunes:
 * - Acceso promedio O(1) para operaciones básicas (put, get, remove).
 * - No garantizan orden (excepto LinkedHashMap/Set que mantienen orden de inserción).
 * - Permiten null: HashMap/HashSet sí, Hashtable no.
 * - No thread-safe por defecto (excepto Hashtable).
 *
 * HashMap:
 * - Interfaz: Map<K,V>
 * - Métodos clave: put(K,V), get(K), remove(K), containsKey(K), containsValue(V), size(), isEmpty()
 * - Iteración: keySet(), values(), entrySet()
 * - Rendimiento: Factor de carga (load factor) por defecto 0.75, se redimensiona cuando se alcanza.
 *
 * HashSet:
 * - Interfaz: Set<E>
 * - Basado en HashMap donde las claves son los elementos y el valor es un dummy.
 * - Métodos: add(E), remove(E), contains(E), etc.
 *
 * LinkedHashMap/LinkedHashSet:
 * - Mantiene orden de inserción.
 * - Un poco más de overhead de memoria por los enlaces.
 * - Útil cuando el orden importa pero no necesitas ordenamiento (como TreeMap).
 *
 * Hashtable:
 * - Sincronizado: Thread-safe pero más lento.
 * - No permite null.
 * - Legacy: Preferir ConcurrentHashMap para concurrencia.
 *
 * ConcurrentHashMap:
 * - Thread-safe con mejor rendimiento que Hashtable.
 * - Permite operaciones concurrentes sin bloquear toda la tabla.
 * - Usa segmentos (buckets) para concurrencia.
 *
 * Consideraciones de rendimiento:
 * - El hashCode bueno distribuye uniformemente para evitar colisiones.
 * - Redimensionamiento es costoso, elegir capacidad inicial adecuada.
 * - Para pocos elementos, ArrayList puede ser más rápido.
 *
 * Comparación con otras colecciones:
 * - TreeMap/TreeSet: Ordenados, O(log n), basados en árbol rojo-negro.
 * - ArrayList: Ordenado por índice, O(1) acceso por índice.
 *
 * Buenas prácticas:
 * - Sobreescribir equals() y hashCode() en clases usadas como claves.
 * - Usar generics para type safety.
 * - Para concurrencia, usar ConcurrentHashMap en lugar de Collections.synchronizedMap().
 *
 * Esta clase no implementa funcionalidad ejecutable, sino que sirve como referencia teórica.
 */
public class Hash {

    // Esta clase está vacía intencionalmente, ya que su propósito es educativo.
    // En un proyecto real, podrías implementar métodos de utilidad relacionados con hashes.

    /**
     * Método de ejemplo: Imprimir teoría básica de colecciones hash
     */
    public static void imprimirTeoria() {
        System.out.println("Teoría de Colecciones Basadas en Hash en Java:");
        System.out.println("- HashMap: Mapa clave-valor, O(1) promedio");
        System.out.println("- HashSet: Conjunto sin duplicados");
        System.out.println("- LinkedHashMap/Set: Mantienen orden de inserción");
        System.out.println("- Hashtable: Sincronizado, legacy");
        System.out.println("- ConcurrentHashMap: Thread-safe moderno");
    }
}