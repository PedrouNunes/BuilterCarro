
package exemplobuilter;


public class CarroBuilder {
    private String modelo;
    private String marca;
    private String cor;

    public CarroBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CarroBuilder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public CarroBuilder setCor(String cor) {
        this.cor = cor;
        return this;
    }


    public Carro build() {
        return new Carro(modelo, marca, cor);
    }
}

