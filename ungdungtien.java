import java.util.Scanner;

public class ungdungtien {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc= new Scanner(System.in);
        System.out.println("Moi ban nhap so tien usd:");
        usd = sc .nextDouble();
        double quydoi= usd*23000;
        System.out.println("gia tri vnd: "+ quydoi);

    }
}
