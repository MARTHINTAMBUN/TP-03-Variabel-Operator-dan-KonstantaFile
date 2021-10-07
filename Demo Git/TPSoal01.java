import java.util.Scanner;

public class TPSoal01 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Input Jumlah Tabungan dan Hari
		System.out.println("Uang yang ditabung: ");
		int uang = input.nextInt();
		System.out.println("Hari Tabungan; ");
		int hari = input.nextInt();
		//Output Program
		System.out.println("Jumlah Tabungan: " + uang * hari);
	
	}
}
		