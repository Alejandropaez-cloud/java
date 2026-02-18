package teoria;

/**
 * Clase List: Teoría y conceptos relacionados con las Listas en Java
 *
 * En Java, una List es una interfaz que pertenece al framework de colecciones (java.util).
 * Representa una colección ordenada de elementos que permite duplicados. A diferencia de los Sets,
 * las Lists mantienen el orden de inserción de los elementos y permiten acceso por índice.
 *
 * Características principales de las List:
 * - Ordenadas: Los elementos se mantienen en el orden en que se insertan.
 * - Permiten duplicados: Un mismo elemento puede aparecer múltiples veces.
 * - Acceso por índice: Se puede acceder a elementos usando posiciones numéricas (0-based).
 * - Tamaño dinámico: Pueden crecer o encogerse según sea necesario.
 *
 * Implementaciones principales:
 * 1. ArrayList: Basada en un array dinámico. Buena para acceso aleatorio rápido, pero inserciones/eliminaciones
 *    en posiciones intermedias son costosas.
 * 2. LinkedList: Basada en una lista doblemente enlazada. Buena para inserciones/eliminaciones frecuentes,
 *    pero acceso aleatorio es más lento.
 * 3. Vector: Similar a ArrayList pero sincronizada (thread-safe). Menos usada actualmente.
 * 4. Stack: Extiende Vector, implementa una pila LIFO.
 *
 * Métodos importantes de la interfaz List:
 * - add(E element): Agrega un elemento al final.
 * - add(int index, E element): Inserta un elemento en una posición específica.
 * - get(int index): Obtiene el elemento en la posición dada.
 * - set(int index, E element): Reemplaza el elemento en la posición dada.
 * - remove(int index): Elimina el elemento en la posición dada.
 * - remove(Object o): Elimina la primera ocurrencia del objeto.
 * - size(): Devuelve el número de elementos.
 * - isEmpty(): Verifica si la lista está vacía.
 * - contains(Object o): Verifica si la lista contiene el objeto.
 * - indexOf(Object o): Devuelve el índice de la primera ocurrencia.
 * - lastIndexOf(Object o): Devuelve el índice de la última ocurrencia.
 * - subList(int fromIndex, int toIndex): Devuelve una vista de sublista.
 * - clear(): Elimina todos los elementos.
 *
 * Iteración sobre Lists:
 * - Usando for-each: for (Tipo elemento : lista) { ... }
 * - Usando Iterator: Iterator<Tipo> it = lista.iterator(); while (it.hasNext()) { ... }
 * - Usando ListIterator: Para iteración bidireccional con modificación.
 * - Usando índices: for (int i = 0; i < lista.size(); i++) { ... }
 *
 * Consideraciones de rendimiento:
 * - ArrayList: O(1) para acceso por índice, O(n) para inserción/eliminación en medio.
 * - LinkedList: O(n) para acceso por índice, O(1) para inserción/eliminación en extremos.
 *
 * Sincronización:
 * - Las implementaciones estándar no son thread-safe. Para uso concurrente, usar Collections.synchronizedList()
 *   o clases de java.util.concurrent como CopyOnWriteArrayList.
 *
 * Comparación con otras colecciones:
 * - Set: No permite duplicados, no ordenado (excepto LinkedHashSet y TreeSet).
 * - Queue: Para estructuras FIFO/LIFO.
 * - Map: Para pares clave-valor.
 *
 * Ejemplos de uso común:
 * - Almacenar elementos en orden de llegada.
 * - Implementar pilas, colas, deques.
 * - Procesamiento de datos secuenciales.
 *
 * Esta clase no implementa funcionalidad ejecutable, sino que sirve como referencia teórica.
 */
public class List {

    // Esta clase está vacía intencionalmente, ya que su propósito es educativo.
    // En un proyecto real, podrías implementar métodos de utilidad relacionados con Lists.

    /**
     * Método de ejemplo: Imprimir teoría básica
     */
    public static void imprimirTeoria() {
        System.out.println("Teoría de Lists en Java:");
        System.out.println("- Interfaz ordenada que permite duplicados");
        System.out.println("- Implementaciones: ArrayList, LinkedList, etc.");
        System.out.println("- Acceso por índice, tamaño dinámico");
    }
}