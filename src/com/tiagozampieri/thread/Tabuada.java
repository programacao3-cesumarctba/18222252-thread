package com.tiagozampieri.thread;

public class Tabuada implements Runnable {
    private String nome;
    private int numero;

    public Tabuada(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        Thread tr = new Thread(this);
        tr.start();
    }

    @Override
    public void run() {
        tabuada();
    }

    public void tabuada() {
        for(int i = 0; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", i, numero, i *numero));
        }
    }
}
