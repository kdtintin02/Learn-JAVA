//BeeBux Soal Hashmap
import java.util.Scanner;
import java.util.HashMap;

public class hashMap
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//membuat HashMap coffee
		HashMap<String, Integer> coffee = new HashMap<>();
		
		//input jumlah data
		int n = input.nextInt();
		input.nextLine();
		
		//input data
		for (int i=0; i<n; i++){
		     String barisInput = input.nextLine();
		     String[] data = barisInput.split(" ");
		     String jenis=data[0];
		     int harga = Integer.parseInt(data[1]);
		     
		     //cek jenis
		     coffee.put(jenis, coffee.getOrDefault(jenis,0) + harga);
		}
		//output data
		for (String jenisKopi : coffee.keySet()){
		     System.out.println(jenisKopi+" "+coffee.get(jenisKopi));
		}
	}
}
