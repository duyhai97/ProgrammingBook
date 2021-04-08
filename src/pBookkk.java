import java.util.Arrays;
import java.util.Scanner;
public class pBookkk {
    public static void main(String[] args) {
        ProgrammingBook array[] = new ProgrammingBook[10];

        array[0] = new ProgrammingBook(40000, "java", "aa1");
        array[1] = new ProgrammingBook(45000, "PHP", "aa2");
        array[2] = new ProgrammingBook(50000, "C#", "aa3");
        array[3] = new ProgrammingBook(55000, "java", "aa4");
        array[4] = new ProgrammingBook(50000, "C++", "aa5");
        array[5] = new ProgrammingBook(48000, "PHP", "aa6");
        array[6] = new ProgrammingBook(80000, "java", "aa7");
        array[7] = new ProgrammingBook(60000, "C+", "aa8");
        array[8] = new ProgrammingBook(65000, "java", "aa9");
        array[9] = new ProgrammingBook(64000, "PHP", "aa10");
        int total = 0;
        int dem = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            total += array[i].price;

            if (array[i].language == "java"){
                dem++;
            }
        }
        System.out.println("tong tien la: " + total);
        System.out.println("tong so sach co ngon ngu java la: " + dem);

        System.out.println("nhap so tien muon mua sach: ");
        int money = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i].price < money){
                System.out.println("cuon sach it tien hon " + money + "la: " + array[i].name );
            }
        }
    }
}
