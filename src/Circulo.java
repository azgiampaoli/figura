public class Circulo extends Figura{

    double raio;


    public Circulo(double raio, String cor) {
        setCor(cor);
        this.raio = raio;
    }

    double area( double raio){
        double pi= 3.14;
        double area;
        area = 2*pi*raio;
        return area;
    }

    double getDiametro(double raio){
        double diametro = 2*raio;
        return diametro;
    }



    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", cor='" + cor + '\'' +
                '}';
    }
}
