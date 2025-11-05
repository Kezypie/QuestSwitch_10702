import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double strukturData,PemrogramanBO,BasisData,algoritmaPemrograman,rpl;


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

        if (strukturData < 0 || strukturData > 100 ||
            PemrogramanBO < 0 || PemrogramanBO > 100 ||
            BasisData < 0 || BasisData > 100 ||
            algoritmaPemrograman < 0 || algoritmaPemrograman > 100 ||
            RekayasaPerangkatLunak < 0 || RekayasaPerangkatLunak > 100) 
        {


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

        if(predikat.equals("A (Sangat Baik)") || predikat.equals("AB (Baik Sekali)")){
            System.out.println("\nDaftar Mata Kuliah Yang Dapat Diajukan Untuk Posisi Asisten: \n");
            System.out.println("1. Struktur Data");
            System.out.println("2. Pemrograman Berorientasi Objek");
            System.out.println("3. Basis Data");
            System.out.println("4. Algoritma dan Pemrograman");
            System.out.println("5. Rekayasa Perangkat Lunak");

            System.out.print("\nPilih Mata Kuliah Yang memiliki nilai minimal 75: ");
            int pilihan = sc.nextInt();

            switch(pilihan){
                case 1:
                    if(strukturData >= 75){
                        System.out.println("Selamat, Mahasiswa eligible untuk menjadi Asisten Dosen");
                    }else{
                        System.out.println("Mahasiswa Belum memenuhi syarat untuk posisi tersebut");
                    }
                    break;
                case 2:
                    if(PemrogramanBO >= 75){
                        System.out.println("Selamat, Mahasiswa eligible untuk menjadi Asisten Dosen");
                    }else{
                        System.out.println("Mahasiswa Belum memenuhi syarat untuk posisi tersebut");
                    }
                    break;
                case 3:
                    if(BasisData >= 75){
                        System.out.println("Selamat, Mahasiswa eligible untuk menjadi Asisten Dosen");
                    }else{
                        System.out.println("Mahasiswa Belum memenuhi syarat untuk posisi tersebut");
                    }
                    break;
                case 4:
                    if(algoritmaPemrograman >= 75){
                        System.out.println("Selamat, Mahasiswa eligible untuk menjadi Asisten Dosen");
                    }else{
                        System.out.println("Mahasiswa Belum memenuhi syarat untuk posisi tersebut");
                    }
                    break;
                case 5:
                    if(RekayasaPerangkatLunak >= 75){
                        System.out.println("Selamat, Mahasiswa eligible untuk menjadi Asisten Dosen");
                    }else{
                        System.out.println("Mahasiswa Belum memenuhi syarat untuk posisi tersebut");
                    }
                    break;
                    default:
                        System.out.println("Pilih Mata Kuliah Mulai dari 1 hingga 5");
                        break;
                        sc.close();
        
    }
}            }else{

            }
        }
    }