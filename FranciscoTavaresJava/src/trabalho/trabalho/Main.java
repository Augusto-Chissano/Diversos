package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando objetos do tipo Retangulo, Triangulo e Circulo
        Retangulo retangulo = new Retangulo();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();
        
        // Definindo valores para os atributos dos objetos
        retangulo.setBase(5);
        retangulo.setAltura(3);
        
        triangulo.setBase(4);
        triangulo.setAltura(6);
        
        circulo.setRaio(2.5);
        
        // Adicionando as figuras geométricas em uma lista
        List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>();
        listaFigurasGeometricas.add(retangulo);
        listaFigurasGeometricas.add(triangulo);
        listaFigurasGeometricas.add(circulo);
        
        // Mostrando dados das figuras geométricas
        for (FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {
            System.out.println(figuraGeometrica.getDescricao());
            System.out.printf("Area da figura: %.2f\n", figuraGeometrica.getArea());
        }
    }
}
