import Bapp.cart;

public class Main {


    public  static void main(String[] args) {

          Main main = new Main();
        cart car= new cart(2);

        car.getRuedas();


        int result = main.sum(10,20);
        System.out.println("working"+result);
    }

    public  int sum(int v1, int v2){
        return v1+v2;
    }
}