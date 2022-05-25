public class Triangulo extends Figura{

    double base;
    double altura;

    public Triangulo(double base, double altura, String cor) {
        setCor(cor);
        this.base = base;
        this.altura = altura;
    }

    public double area(double ba, double al){
        double area;
        area = ba * al;
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "cor='" + cor + '\'' +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
