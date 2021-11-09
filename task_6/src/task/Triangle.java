
package task;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public boolean isValid() {
        return this.a * this.a > this.b * this.b + this.c * this.c && this.b * this.b > this.a * this.a + this.c * this.c && this.c * this.c > this.b * this.b + this.a * this.a;
    }

    public double square() {
        double p = (this.a + this.b + this.c) / 2.0D;
        return this.isValid() ? Math.sqrt(p * Math.sqrt(p - this.a) * Math.sqrt(p - this.b) * Math.sqrt(p - this.c)) : -1.0D;
    }

    public double perimeter() {
        return this.isValid() ? this.a + this.b + this.c : -1.0D;
    }
}

