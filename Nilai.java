import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double strukturData,PemrogramanBO,BasisData,algoritmaPemrograman,RekayasaPerangkatLunak;


        System.out.print("Masukkan Nilai Struktur Data: ");
        strukturData = sc.nextDouble();
        System.out.print("Masukkan Nilai Pemrograman Berorientasi Objek: ");
        PemrogramanBO = sc.nextDouble();
        System.out.print("Masukkan Nilai Basis Data: ");
        BasisData = sc.nextDouble();
        System.out.print("Masukkan Nilai Algoritma dan Pemrograman: ");
        algoritmaPemrograman = sc.nextDouble();
        System.out.print("Masukkan Nilai Rekayasa Perangkat: ");
        RekayasaPerangkatLunak = sc.nextDouble();


        double rataRata = (strukturData + PemrogramanBO + BasisData + algoritmaPemrograman + RekayasaPerangkatLunak) / 5;
        double ipk = (rataRata / 100) * 4;    
    }
}