
package exercise2;


public class exercise2 {

    public static void main(String[] args) {
        student alum1 = new student("Omar Flores");
        alum1.initialize();
        alum1.toShow();
        alum1.isAdult();
        alum1.Average();
        
        student alum2 = new student("Omar Flores Hernandez",22,10);
        alum2.toShow();
        alum2.isAdult();
        alum2.Average();
    }
    
}
