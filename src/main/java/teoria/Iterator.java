package teoria;

import java.util.ArrayList;  // Para crear listas dinámicas
import java.util.List;       // Interfaz para trabajar con colecciones

/**
 * CLASE ITERATOR
 * Demuestra cómo usar Iterator para recorrer y modificar listas de forma segura.
 * 
 * QUE ES ITERATOR?
 * Es una interfaz que nos permite recorrer colecciones de forma SEGURA,
 * especialmente cuando queremos ELIMINAR elementos.
 * 
 * USAR ITERATOR CUANDO:
 * - Necesitas eliminar elementos durante la iteración
 * - Quieres acceder a los elementos uno por uno
 * - Quieres control fino sobre el recorrido
 */
public class Iterator {
    
    /**
     * METODO: ejemploIterator
     * Demuestra cómo usar Iterator para eliminar elementos de una lista
     */
    public static void ejemploIterator() {
        // PASO 1: Crear una lista de frutas
        // ArrayList es una lista dinámica que puede crecer o encogerse
        List<String> frutas = new ArrayList<>();
        
        // PASO 2: Agregar elementos a la lista
        frutas.add("Manzana");  // Índice 0
        frutas.add("Platano");  // Índice 1
        frutas.add("Cereza");   // Índice 2
        frutas.add("Dátil");    // Índice 3
        frutas.add("Fresa");    // Índice 4
        
        // PASO 3: Mostrar la lista original
        System.out.println("Lista original: " + frutas);
        
        // PASO 4: Crear un Iterator sobre la lista
        // Iterator nos permite recorrer la lista de forma segura
        java.util.Iterator<String> iterator = frutas.iterator();
        
        // PASO 5: Recorrer la lista usando Iterator
        while(iterator.hasNext()) {
            // Obtener el siguiente elemento de la lista
            String fruta = iterator.next();
            
            // Verificar si la fruta empieza con 'C' (Cereza) o 'F' (Fresa)
            if(fruta.startsWith("C") || fruta.startsWith("F")) {
                // Eliminar de forma SEGURA usando Iterator
                // NO CAUSA ERROR a diferencia de for-each
                iterator.remove();
                
                // Mostrar que fue eliminada
                System.out.println("Eliminada: " + fruta);
            }
        }
        
        // PASO 6: Mostrar la lista después de eliminar elementos
        System.out.println("Lista después de la eliminación: " + frutas);
    }
    
    /**
     * METODO: compararConForEach
     * Demuestra la DIFERENCIA entre usar Iterator y for-each
     * cuando queremos eliminar elementos
     */
    public static void compararConForEach() {
        // Crear una lista de números como palabras
        List<String> numeros = new ArrayList<>();
        numeros.add("Uno");    // Índice 0
        numeros.add("Dos");    // Índice 1
        numeros.add("Tres");   // Índice 2
        
        // Mostrar el título de la demostración
        System.out.println("\n--- Diferencia: for-each vs Iterator ---");
        
        // IMPORTANTE: 
        // MALO: Si intentas eliminar con for-each obtienes una excepción
        // BIEN: Con Iterator es seguro eliminar
        
        System.out.println("Con Iterator (seguro): ");
        
        // Crear el Iterator
        java.util.Iterator<String> it = numeros.iterator();
        
        // Recorrer usando Iterator
        while(it.hasNext()) {
            // Obtener el siguiente número
            String numero = it.next();
            
            // Si el número es "Dos", eliminarlo
            if(numero.equals("Dos")) {
                // Usar it.remove() es SEGURO
                it.remove();
                
                // Mostrar el mensaje de confirmación
                System.out.println(numero + " eliminado correctamente");
            }
        }
        
        // RESULTADO: La lista ahora solo tiene [Uno, Tres]
    }
}
