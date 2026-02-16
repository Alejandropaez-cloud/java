package teoria;

public class TreeMap {
    /*
     * ========================= TEORÍA DE TREEMAP =========================
     *
     * TreeMap es una implementación de Map que almacena sus elementos ordenados
     * basándose en las claves. Extiende AbstractMap e implementa NavigableMap.
     *
     * CARACTERÍSTICAS PRINCIPALES:
     * 1. Mantiene los elementos ORDENADOS por sus claves
     * 2. NO permite claves null
     * 3. No es sincronizado (no thread-safe)
     * 4. Basa el ordenamiento en un Comparator o en el orden natural (Comparable)
     *
     * ORDENAMIENTO:
     * - Por defecto: usa el orden natural de las claves (interfaz Comparable)
     * - Personalizado: usa un Comparator pasado en el constructor
     *
     * COMPLEJIDAD TEMPORAL:
     * - get(key): O(log n)
     * - put(key, value): O(log n)
     * - remove(key): O(log n)
     * - containsKey(key): O(log n)
     *
     * CONSTRUCTORES:
     * - TreeMap(): Crea un TreeMap vacío con orden natural
     * - TreeMap(Comparator c): Crea un TreeMap con comparator personalizado
     * - TreeMap(Map m): Crea un TreeMap a partir de un Map existente
     * - TreeMap(SortedMap m): Crea un TreeMap a partir de un SortedMap
     *
     * MÉTODOS IMPORTANTES:
     * - put(K key, V value): Añade un elemento
     * - get(Object key): Obtiene el valor de una clave
     * - remove(Object key): Elimina un elemento
     * - containsKey(Object key): Verifica si existe la clave
     * - containsValue(Object value): Verifica si existe el valor
     * - firstKey(): Retorna la primera clave (la menor)
     * - lastKey(): Retorna la última clave (la mayor)
     * - headMap(K toKey): Retorna un submapa con claves menores a toKey
     * - tailMap(K fromKey): Retorna un submapa con claves mayores o iguales a fromKey
     * - subMap(K fromKey, K toKey): Retorna un submapa entre dos claves
     *
     * EJEMPLO DE USO:
     * TreeMap<String, Integer> map = new TreeMap<>();
     * map.put("Carlos", 25);
     * map.put("Ana", 30);
     * map.put("Bruno", 28);
     * // El orden será: Ana (30), Bruno (28), Carlos (25)
     *
     * CON COMPARATOR PERSONALIZADO:
     * TreeMap<String, Integer> mapOrdenado = 
     *     new TreeMap<>(Comparator.reverseOrder());
     * // Ordena en sentido inverso
     *
     * ========================= FIN TEORÍA TREEMAP =========================
     */
}


