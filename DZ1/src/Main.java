public class Main {


    public static void main(String[] args) {

        Object a = null;
        int b = 1;
        int c = 2;

        if(a.equals("NullPointerException")){
            System.out.println("Hello world");
        }

        System.out.println("Hello " + args[0] + "World");


        if (b > c){
            throw new ArrayIndexOutOfBoundsException ();
        }

    }

}





