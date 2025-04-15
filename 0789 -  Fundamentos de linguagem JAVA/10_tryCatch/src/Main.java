import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3};



        System.out.print("numero: ");
        int res2 = scanner.nextInt();
        try{

            System.out.print("idade: ");
            int res = scanner.nextInt();


            System.out.println(res);
            System.out.println(arr[res]);

        }catch(InputMismatchException e){
            System.out.println(e);
            System.out.println("------");
            System.out.println(e.getMessage());
            System.out.println("o num é invalido");


        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println(e);
            System.out.println("------");

            System.out.println(e.getMessage());
            System.out.println("o index do array nao e valido");

        }finally{
            System.out.println("finally");
        }



        //  System.out.println(arr[5]);

    }
}