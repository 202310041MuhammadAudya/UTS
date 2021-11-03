package UTS;
import java.util.Scanner;

class utama {
public void lingkaran()   
{
        Scanner input = new Scanner(System.in);
        double phi = 3.14;
        double r, luas,keliling;
        System.out.println("\n--> lingkaran <--");
        System.out.println("Masukkan Panjang Jari-jari : ");
        r = input.nextDouble();
        System.out.println("=>");
        luas = phi * r * r;
        keliling = 2 * phi * r;
        System.out.println("Luas  = " + (int)luas + " \nKeliling  = "+ (int)keliling);
        System.out.println("");
        }
public void persegi()
 {
        Scanner input = new Scanner(System.in);
        double s, luas,keliling;
        System.out.println("\n-->Persegi<--");
        System.out.println("Masukkan Panjang sisi : ");
        s = input.nextDouble();
        System.out.println("=>");
        luas = s * s;
        keliling = 4* s;
        System.out.println("Luas  = " + (int)luas + " \nKeliling = "+ (int)keliling);
        System.out.println("");
        }
    public void segitiga()
    {
        Scanner input = new Scanner(System.in);
        double a , t, luas,keliling;
        System.out.println("\n-->Segitiga<--");
        System.out.print("Masukkan Panjang alas : ");
        a = input.nextDouble();
        System.out.println("Masukkan tinggi : ");
        t = input.nextDouble();
        System.out.println("=>");
        luas = 0.5 * a * t;
        keliling = 3 * t;
        System.out.println("Luas  = " + (int)luas + " \nKeliling = "+ (int)keliling);
        System.out.println("");
        }
public void ppanjang()
    {
        Scanner input = new Scanner(System.in);
        double p , l, luas,keliling;
        System.out.println("\n-->Persegi Panjang<--");
        System.out.println("Masukkan Panjang : ");
        p = input.nextDouble();
        System.out.println("Masukkan lebar : ");
        l = input.nextDouble();
        System.out.println("=>");
        luas = p * l;
        keliling = 2*p + 2*l;
        System.out.println("Luas  = " + (int)luas + " \nKeliling  = "+ (int)keliling);
        System.out.println("");
        }
}

public class pilihan{
    public static void main (String [] args){
    {
    utama yudana = new utama ();
            Scanner input = new Scanner(System.in);
            double a;
            System.out.println("Menghitung Luas dan Keliling Bangun Datar");
            System.out.println("1 => lingkaran \n2.=> persegi\n3.=> segitiga\n4.=> Persegi panjang\n");
            System.out.println("Masukan pilihan = ");
            a = input.nextDouble();
    int masukan=0;    
    if (a==1)
       yudana.lingkaran();
    else if (a==2)
       yudana.persegi();
    else if (a==3)
        yudana.segitiga();
    else if (a==4)
        yudana.ppanjang();
    else 
        System.out.println("pilihan salah");
    }}}
    