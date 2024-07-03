package Bapp;

public class cart {
    private int ruedas;


    {
        System.out.println("inicializacion antes de la clase de carro");

    }

    public cart(int ruedas){

        this.ruedas=ruedas;
        System.out.println("constructor de carro");

    }

    private void trying(){

        System.out.println("probando");
    }

    public void getRuedas(){

        this.trying();
        System.out.println("ruedas"+ruedas);
    }
}
