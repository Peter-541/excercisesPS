
package exercise3;


public class exercise3Class {
    /* Variables */
        private double side1;
        private double side2;
        private double side3;
    
    /* Builder */
    public exercise3Class() {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
       
    /* Getter and Setter */
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
       
    /* Methods */    
    public void initialize(double side1, double side2, double side3) {
        this.setSide1(side1);
        this.setSide2(side2);
        this.setSide3(side3);
    }

    public void majorSide() {
        double sideMayor = side1;

        if (side1 == side2 && side2 == side3 && side1 == side3) {
            System.out.println("No Hay Lado Mayor Los Tres Lados son Iguales y miden: " + sideMayor);
        } else {
            if (side2 > sideMayor) {
                sideMayor = side2;
            } else if (side3 > sideMayor) {
                sideMayor = side3;
            } else if (side2 > side3) {
                sideMayor = side2;
            } else if (side3 > side2) {
                sideMayor = side3;
            } else {
                sideMayor = side1;
            }
            System.out.println("El Lado Mayor del Triángulo es: " + sideMayor);
        }
    }

    public void isEquilatero() {

        if (side1 == side2 && side2 == side3 && side1 == side3) {
            System.out.println("Los Tres Lados del Triángulo son Iguales por lo cual es un Triangulo Equilátero");
        } else {
            System.out.println("Los Tres Lados del Triángulo NO son Iguales por lo cual NO es un Triangulo Equilátero");
        }
    }
}
