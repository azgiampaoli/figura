public class main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(2,5,"verde");
        System.out.println(retangulo);
        System.out.println(retangulo.setArea(2,5));

        Triangulo triangulo = new Triangulo(5,8,"amarelo");
        System.out.println(triangulo);
        System.out.println(triangulo.area(5,8));

        Circulo circulo = new Circulo(5,"rosa");
        System.out.println(circulo);
        System.out.println(circulo.area(5));
        System.out.println(circulo.getDiametro(2));

        Quadrado quadrado = new Quadrado(8, "Roxo");
        System.out.println(quadrado);
        System.out.println(quadrado.setArea(8));




    }
}
