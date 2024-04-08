// Objeto
package Carro;

public class Carro {
        String nome;
        String marca;
        String cor;
        int ano;
        int vel;

        void acelerar(int aceleracao) {
            vel += aceleracao;
        }
        void freio(int freiar){
            vel -= freiar;
        }
    }


// Carro Teste
package Carro;

public class CarroTeste {

    public static void main (String [] args){
        Carro carro1 = new Carro();
        carro1.nome = "Gol";
        carro1.marca = "Vw";
        carro1.cor = "Branco";
        carro1.ano = 2011;
        carro1.vel = 100;

        carro1.acelerar(20);

        System.out.println("Velocidade do carro: " + carro1.vel + "Km/h");

        carro1.freio(40);

        System.out.println("Velocidade do carro: " + carro1.vel + "Km/h");


    }
}
