package exercise2;


public class student {
    /* Variables */
    private String name;
    private int age;
    private double calif;
    
    /* First Builder */
    public student(String name) {
        this.name = name;
    }
    
    /* Second Builder */
    public student(String name, int age, double calif) {
        this.name = name;
        this.age = age;
        this.calif = calif;
    }
    
    /* Getters and Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCalif() {
        return calif;
    }

    public void setCalif(double calif) {
        this.calif = calif;
    }
    
    /* Methods */
    public void toShow(){
        System.out.println("****** Datos del Alumno ******");
        System.out.println("Nombre: " + this.getName());
        System.out.println("Edad: " + this.getAge());
        System.out.println("Calificación:" + this.getCalif());
    }
    
    public void isAdult(){
        if (this.getAge() > 18){
            System.out.println("Eres Mayor de Edad");
        } else {
            System.out.println("Eres Menor de Edad");
          }
    }
    
    public void Average(){
        if(this.getCalif() == 10){
            System.out.println("EXCELENTE TU PROMEDIO ES DE 10");
        } else if(this.getCalif() > 8 && this.getCalif() < 10){
            System.out.println("APROBADO CON PROMEDIO DE: " + this.getCalif());
        } else{
            System.out.println("REPROBADO CON PROMEDIO DE: " + this.getCalif());
        }
    }
    
    public void initialize(){
        age = 0;
        calif = 0;
    }
}
