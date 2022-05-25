public class Retangulo extends Figura{

    private double lado;
    private double lado1;

    public Retangulo(double lado, double lado1, String cor) {
        setCor(cor);
        this.lado = lado;
        this.lado1 = lado1;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double setArea(double l1, double l2){

        double area = l1*l2;
        return area;

    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "cor='" + cor + '\'' +
                ", lado=" + lado +
                ", lado1=" + lado1 +
                '}';
    }
}
