package com.estudos.sobrescrita.Animal;

class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au au!");
    }
}
