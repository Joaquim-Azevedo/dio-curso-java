package com.estudos.sobrescrita.Animal;

/*
 * Crie uma classe Animal com um método fazerSom(). 
 * Depois crie classes Cachorro e Gato que herdam de Animal e 
 * sobrescrevem o método fazerSom() com sons respectivos.
 */
public class TesteAnimais {
    public static void main(String[] args) {

        Animal meuAnimal = new Animal();
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        meuAnimal.fazerSom();
        cachorro.fazerSom();
        gato.fazerSom();

    }

}
