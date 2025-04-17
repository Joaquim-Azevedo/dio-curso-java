package com.estudos.sobrescrita.Animal;

class Gato extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("O gato faz: Miau!");
    }
}