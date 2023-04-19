package servicios;

import entidades.Raiz;
import java.util.Scanner;

public class ServiciosRaiz {

    Scanner leer = new Scanner(System.in);

    double a;
    double b;
    double c;

    public Raiz crearRaiz() {
        System.out.println("Ingrese el valor de los tres coeficientes");
        a = leer.nextDouble();
        b = leer.nextDouble();
        c = leer.nextDouble();
        System.out.println("La ecuación cuadrática tiene la forma " + a + "x^2 + " + b + "x + " + c);

        return new Raiz(a, b, c);
    }

    public double getDiscriminante(Raiz r) {
        double discri = (Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC());
        return discri;
    }

    public boolean tieneRaiz(double discri) {
        Raiz r = new Raiz(a, b, c);
        boolean tiene;
        double discriminante = getDiscriminante(r);
        if (discriminante == 0) {
            tiene = true;
        } else {
            tiene = false;
        }
        return tiene;
    }

    public boolean tieneRaices(double discri) {
        Raiz r = new Raiz(a, b, c);
        boolean tiene;
        double discriminante = getDiscriminante(r);
        if (discriminante > 0) {
            tiene = true;
        } else {
            tiene = false;
        }
        return tiene;
    }

    public double obtenerRaiz(boolean tiene) {
        double R1 = 0;
        Raiz r = new Raiz(a, b, c);
        boolean tieneR = tieneRaiz(getDiscriminante(r));
        if (tieneR) {
            R1 = -r.getB() / (2 * r.getA());
        }
        return R1;
    }

    public void obtenerRaices(boolean tiene) {
        double R1 = 0;
        double R2 = 0;
        Raiz r = new Raiz(a, b, c);
        boolean tieneR = tieneRaices(getDiscriminante(r));
        if (tieneR) {
            R1 = (-r.getB() + Math.sqrt(Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC())) / (2 * r.getA());
            R2 = (-r.getB() - Math.sqrt(Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC())) / (2 * r.getA());
        }
        System.out.println("La primera raiz de la cuadrática es: " + R1);
        System.out.println("La segunda raiz de la cuadrática es: " + R2);
    }

}
