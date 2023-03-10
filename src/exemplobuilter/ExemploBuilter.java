
package exemplobuilter;


public class ExemploBuilter {

    
    public static void main(String[] args) {
         Carro carro = new CarroBuilder()
                        .setMarca("Fiat")
                        .setModelo("Uno")
                        .setCor("Branco")
                        .build();
        System.out.println(carro.getMarca() + " " + carro.getModelo() + " " + carro.getCor() + " " + "cv");
    
    }
    
}
