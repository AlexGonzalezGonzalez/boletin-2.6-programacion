
package boletin.pkg2.pkg1;
import java.util.Scanner;
public class Boletin21 {

    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       float prezot,prezop,desconto;
       System.out.println("teclea prezo tarifa:");
       prezot=sc.nextFloat();
       System.out.println("teclea prezo pagado:");
       prezop=sc.nextFloat();
       desconto=100-prezop/prezot*100;
       System.out.println("desconto= "+ desconto+"%");
    
    }
}
