package Modul01;

import javax.swing.JOptionPane;
import java.util.Scanner;


public class DataTypes{
	public static void main (String [] args ){

	    Scanner scanner = new Scanner (System.in);

	String namaDepan = "jamal";
	String namaBelakang = "ludin";
	int usia = 22;
	int targetTahunKuliah = 4;
	double ipk = 3.89764512;
	char nilaiAbjad = 'A';
	boolean tampan = true;

	System.out.print("Input nama Depan : ");
	namaDepan = scanner.nextLine();
	System.out.print("input Usia : ");
	usia = scanner.nextInt();
	System.out.print("Input IPK : ");
	ipk = scanner.nextDouble();
	System.out.print("");
	System.out.print("Input Nilai Abjad : ");
	nilaiAbjad = scanner.next().charAt(0);
	System.out.print("Tampan? : ");
	tampan = scanner.nextBoolean();

	

	System.out.println("Nama depan : " + namaDepan);
	System.out.println("Nama belakang : " + namaBelakang);
	System.out.println("Usia : "+ usia);
	System.out.println("Target Kuliah : " +targetTahunKuliah + " tahun ");
	System.out.println("Ipk : "+ ipk);
	System.out.println("Nilai PBO : "+ nilaiAbjad);
	System.err.println("Tampan :" +tampan);

	JOptionPane.showMessageDialog(null,"Hai," + namaDepan + namaBelakang);

	}
}