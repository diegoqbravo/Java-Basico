class Cafetera {

    private double capacidadMaxima;
    private double cantidadActual;

    Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = 0;
    }

    Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = (cantidadActual > capacidadMaxima) ? capacidadMaxima : cantidadActual;
    }

    @Override
    public String toString() {
        return "Capacidad Maxima: " + this.capacidadMaxima + "\nCapacidad Actual: " + this.cantidadActual;
    }

    public void printCafetera() {
        System.out.println(this);
    }

    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public void servirTaza(double capacidadTaza) {
        this.cantidadActual = (this.cantidadActual >= capacidadTaza) ? this.cantidadActual - capacidadTaza : 0;
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    public void agregarCafe(double cantidadCafe) {
        this.cantidadActual = (this.cantidadActual + cantidadCafe > capacidadMaxima) ? this.capacidadMaxima : this.cantidadActual + cantidadCafe;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Creando un objeto con un constructor vacio");
        Cafetera cafetera = new Cafetera();
        cafetera.printCafetera();
        System.out.println("Creando un objeto con un constructor que recibe solo la capacidad maxima (2500)");
        cafetera = new Cafetera(2500);
        cafetera.printCafetera();
        System.out.println("Creando un objeto con un constructor que recibe la capacidad maxima (2500) y cantidad actual (2000)");
        cafetera = new Cafetera(2500, 2000);
        cafetera.printCafetera();
        System.out.println("Creando un objeto con un constructor que recibe solo la capacidad maxima (2500) y cantidad actual (3000)");
        cafetera = new Cafetera(2500, 3000);
        cafetera.printCafetera();
        System.out.println("Vaciamos la cafetera");
        cafetera.vaciarCafetera();
        cafetera.printCafetera();
        System.out.println("Agregamos cafe (95)");
        cafetera.agregarCafe(95);
        cafetera.printCafetera();
        System.out.println("Servimos una taza de cafe (100)");
        cafetera.servirTaza(100);
        cafetera.printCafetera();
        System.out.println("Agregamos cafe (3500)");
        cafetera.agregarCafe(3500);
        cafetera.printCafetera();
        System.out.println("Servimos una taza de cafe (100)");
        cafetera.servirTaza(100);
        cafetera.printCafetera();
        System.out.println("Llenamos la cafetera");
        cafetera.llenarCafetera();
        cafetera.printCafetera();
    }
}