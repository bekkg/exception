public class Car extends RuntimeException{


    public  void  close ()  throws RuntimeException {

     throw new RuntimeException( "машина жабылып атат. " )  ;

    }
    public   void  drive () {

        System.out.println("  машина журуп атат. ");
    }
}
