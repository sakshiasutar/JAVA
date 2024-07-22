package list.vector;
import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
    	Vector list = new Vector();
    	list.addElement("Ram");
    	list.addElement("Lakshman");
    	list.addElement("Sita");
    	
    	System.out.println("Vector elements are " + list);
    	
    	list.insertElementAt("Siya", 0);
    	System.out.println("Vector elements are " + list);
    }
}
