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


        String predikat;
        
        if(ipk < 0 || ipk > 4.00){
           predikat = "Masukkan nilai matkul dengan benar";
        }else if(ipk >= 3.75){
            predikat = "A (Sangat Baik)";
        }else if(ipk >= 3.50){
            predikat = "AB (Baik Sekali)";
        }else if(ipk >= 3.00){
            predikat = "B (Baik)";
        }else if(ipk >= 2.50){
            predikat = "BC (Cukup)";
        }else{
            predikat = "C (Kurang)";
        }

        System.out.println("\nHasil Nilai\n");
        System.out.println("IPK: " + ipk );
        System.out.println("Predikat: " + predikat);
    }
}