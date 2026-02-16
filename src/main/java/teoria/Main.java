package teoria;

import java.util.ArrayList;   // Para crear listas dinámicas
import java.util.Collections; // Para métodos como sort() que ordenan listas
import java.util.List;        // Interfaz para trabajar con colecciones

/**
 * CLASE MAIN
 * Clase principal que demuestra:
 * 1. Cómo usar CompareTo para ordenar objetos
 * 2. Cómo usar Iterator para recorrer y modificar listas
 */
public class Main {
    
    /**
     * METODO: main
     * Punto de entrada del programa
     * Ejecuta las demostraciones de CompareTo e Iterator
     */
    public static void main(String[] args) {
        // Mostrar el título de la primera demostración
        System.out.println("=== DEMOSTRACION DE COMPARETO ===");
        
        // Llamar al método que demuestra CompareTo
        demostrarCompareTo();
        
        // Mostrar el título de la segunda demostración
        System.out.println("\n=== DEMOSTRACION DE ITERATOR ===");
        
        // Llamar al método que demuestra Iterator
        Iterator.ejemploIterator();
        
        // Llamar al método que compara Iterator con for-each
        Iterator.compararConForEach();
    }
    
    /**
     * METODO: demostrarCompareTo
     * Demuestra cómo funciona la comparación entre objetos usando CompareTo
     * 
     * PASOS:
     * 1. Crear una lista de personas
     * 2. Mostrar la lista SIN ORDENAR
     * 3. Ordenar la lista usando Collections.sort() (que usa compareTo internamente)
     * 4. Mostrar la lista ORDENADA
     */
    public static void demostrarCompareTo() {
        // PASO 1: Crear una lista de tipo Personas
        // Esta lista almacenará Persona (clase que implementa Comparable)
        List<Compareto.Persona> personas = new ArrayList<>();
        
        // PASO 2: Agregar 4 personas con diferentes edades
        // Nota: Las edades están desordenadas intencionalmente
        personas.add(new Compareto.Persona("Juan", 25));    // 25 años
        personas.add(new Compareto.Persona("Maria", 30));   // 30 años
        personas.add(new Compareto.Persona("Pedro", 20));   // 20 años
        personas.add(new Compareto.Persona("Ana", 28));     // 28 años
        
        // PASO 3: Mostrar las personas ANTES de ordenar
        System.out.println("Personas antes de ordenar:");
        // for-each: recorre cada persona en la lista
        for(Compareto.Persona p : personas) {
            // Imprime cada persona (usa el método toString)
            System.out.println("  - " + p);
        }
        
        // PASO 4: Ordenar la lista
        // Collections.sort() usa el método compareTo de cada Persona
        // para determinar el orden (por edad, de menor a mayor)
        Collections.sort(personas);
        
        // PASO 5: Mostrar las personas DESPUES de ordenar
        System.out.println("\nPersonas despues de ordenar por edad");
        // for-each: recorre cada persona en la lista (ahora ordenada)
        for(Compareto.Persona p : personas) {
            // Imprime cada persona en el nuevo orden
            System.out.println("  - " + p);
        }
        
        // RESULTADO ESPERADO:
        // Antes: Juan (25), Maria (30), Pedro (20), Ana (28)
        // Después: Pedro (20), Juan (25), Ana (28), Maria (30)
    }
}