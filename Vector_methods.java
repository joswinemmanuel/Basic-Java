import java.util.Scanner;
import java.util.Vector;

public class Vector_methods {
    public static void main(String[] args) {
        /*
        Vector v1 = new Vector();
        Vector v2 = new Vector(5);
        */

        Vector vec = new Vector();

        /* 1) addElement() */
        vec.addElement("Krishna");
        vec.addElement("rom");
        vec.addElement(25);
        
        for(int i=0; i<vec.size(); i++){
            System.out.println(vec.elementAt(i) + " ");
        }
        /*
        Krishna 
        rom
        25
        */
        
        /* 2) size() */
        System.out.println(vec.size());
        // 3
        
        /* 3) elementAt() */
        System.out.println(vec.elementAt(1));
        // rom
        
        /* 4) removeElement() */
        vec.removeElement("rom");
        for(int i=0; i<vec.size(); i++){
            System.out.println(vec.elementAt(i) + " ");
        }
        // Krishna 
        // 25 
        
        /* 5) insertElementAt(item, n) */
        vec.insertElementAt("car", 1);
        for(int i=0; i<vec.size(); i++){
            System.out.println(vec.elementAt(i) + " ");
        }
        /*
        Krishna 
        car 
        25 
        */
        
        /* 6) copyInto(array_name)
            copy all item from vector to array */
        
        /* 7) removeElement(n) */
        vec.removeElementAt(1);
        for(int i=0; i<vec.size(); i++){
            System.out.println(vec.elementAt(i) + " ");
        }
        /*
        Krishna 
        25 
        */
        
        /* 8) removeAllElements() */
        vec.removeAllElements();
        for(int i=0; i<vec.size(); i++){
            System.out.println(vec.elementAt(i) + " ");
        }
        // it's empty
    }
}