public class Quadrado extends Figura{

    double lado;


    public double setArea(double l1){

        double area = l1*l1;
        return area;

    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "cor='" + cor + '\'' +
                ", lado=" + lado +
                '}';
    }

    public Quadrado(double lado, String cor) {
        setCor(cor);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
