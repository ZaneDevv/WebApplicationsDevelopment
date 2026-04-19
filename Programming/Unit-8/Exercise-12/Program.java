import geography.Province;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


/**
 * @version 1.0
 * @author Álvaro Fernández Barrero
 */
public class Program
{
    public static void main(String[] args)
    {
        // Provinces

        Province jaen = new Province("J", "Jaen", 23);   
        Province almeria = new Province("AL", "Almería", 04);   
        Province cordoba = new Province("CO", "Córdoba", 14);   
        Province sevilla = new Province("SE", "Sevilla", 41);   
        Province malaga = new Province("MA", "Málaga", 29);   
        Province cadiz = new Province("CA", "Cádiz", 11);   
        Province huelva = new Province("H", "Huelva", 21);   
        Province granada = new Province("GR", "Granada", 18);

        // Collections

        HashMap<Integer, Province> hashMap = new HashMap<>();
        hashMap.put(jaen.getCode(), jaen);   
        hashMap.put(almeria.getCode(), almeria);   
        hashMap.put(cordoba.getCode(), cordoba);   
        hashMap.put(sevilla.getCode(), sevilla);   
        hashMap.put(malaga.getCode(), malaga);   
        hashMap.put(cadiz.getCode(), cadiz);   
        hashMap.put(huelva.getCode(), huelva);   
        hashMap.put(granada.getCode(), granada);
        hashMap.put(jaen.getCode(), jaen);   
        hashMap.put(almeria.getCode(), almeria);   
        hashMap.put(cordoba.getCode(), cordoba);   
        hashMap.put(sevilla.getCode(), sevilla);   
        hashMap.put(malaga.getCode(), malaga);   
        hashMap.put(cadiz.getCode(), cadiz);   
        hashMap.put(huelva.getCode(), huelva);   
        hashMap.put(granada.getCode(), granada);   

        LinkedHashMap<Integer, Province> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(jaen.getCode(), jaen);   
        linkedHashMap.put(almeria.getCode(), almeria);   
        linkedHashMap.put(cordoba.getCode(), cordoba);   
        linkedHashMap.put(sevilla.getCode(), sevilla);   
        linkedHashMap.put(malaga.getCode(), malaga);   
        linkedHashMap.put(cadiz.getCode(), cadiz);   
        linkedHashMap.put(huelva.getCode(), huelva);   
        linkedHashMap.put(granada.getCode(), granada); 
        linkedHashMap.put(jaen.getCode(), jaen);   
        linkedHashMap.put(almeria.getCode(), almeria);   
        linkedHashMap.put(cordoba.getCode(), cordoba);   
        linkedHashMap.put(sevilla.getCode(), sevilla);   
        linkedHashMap.put(malaga.getCode(), malaga);   
        linkedHashMap.put(cadiz.getCode(), cadiz);   
        linkedHashMap.put(huelva.getCode(), huelva);   
        linkedHashMap.put(granada.getCode(), granada); 

        TreeMap<Integer, Province> treeMap = new TreeMap<>();
        treeMap.put(jaen.getCode(), jaen);   
        treeMap.put(almeria.getCode(), almeria);   
        treeMap.put(cordoba.getCode(), cordoba);   
        treeMap.put(sevilla.getCode(), sevilla);   
        treeMap.put(malaga.getCode(), malaga);   
        treeMap.put(cadiz.getCode(), cadiz);   
        treeMap.put(huelva.getCode(), huelva);   
        treeMap.put(granada.getCode(), granada);
        treeMap.put(jaen.getCode(), jaen);   
        treeMap.put(almeria.getCode(), almeria);   
        treeMap.put(cordoba.getCode(), cordoba);   
        treeMap.put(sevilla.getCode(), sevilla);   
        treeMap.put(malaga.getCode(), malaga);   
        treeMap.put(cadiz.getCode(), cadiz);   
        treeMap.put(huelva.getCode(), huelva);   
        treeMap.put(granada.getCode(), granada);

        // Prints

        System.out.println("HashMap:");
        System.out.println(hashMap);
        System.out.println("\nLinkedHashMap:");
        System.out.println(linkedHashMap);
        System.out.println("\nTreeMap:");
        System.out.println(treeMap);
    }
}