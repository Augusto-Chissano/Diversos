package trabalho;

public class Retangulo extends FiguraGeometrica {

    private double base;
    private double altura;

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

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public String getDescricao() {
        return "Retângulo - Base: " + base + ", Altura: " + altura;
    }
}
