import java.util.Scanner;
public class hipot {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int a,b,c ;
    System.out.println("birinci dik kenar uzunluğunu yazınız");
    a= inp.nextInt();
    System.out.println("ikinci dik kenar uzunluğunu yazınız");
    b= inp.nextInt();
    System.out.println("hipotenüs uzunluğunu yazınız");
    c= inp.nextInt(); 
    int u= (a+b+c)/2;
    double alan = Math.sqrt((u*((u-a)*(u-b)*(u-c))));

    System.out.println("birinci dik kenar uzunluğu "+ a);
    System.out.println("ikinci dik kenar uzunluğu "+ b);     
    System.out.println("hipotenüs uzunluğu "+c);
    System.out.println("üçgenin alanı :"+ alan);
        

}
    
}
