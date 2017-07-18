
import java.io.PrintStream;
import java.util.Scanner;
import toko.cabang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASTRI
 */
public class main {
    public static void main(String[] args){
        char kembali = 0;
        int menu,jumlah_tas,jumlah_sepatu;
        int tottas,totsepatu,totbarang;
        String t;
        
        Scanner input = new Scanner(System.in);
        kelastmp brg = new kelastmp();
        hitungbrg hit = new hitungbrg();
        enkapsulasi harga = new enkapsulasi();
        cabang tk = new cabang();
        generikdata<String>pembeli = new generikdata<>();
        generikdata<String>pbl = new generikdata<>();
        generikdata<String>krm = new generikdata<>();
        
        generikdata<String> nama = new generikdata<>();
        generikdata<String> alamat = new generikdata<>();
        generikdata<String> rtrw = new generikdata<>();
        generikdata<String> kelurahan = new generikdata<>();
        generikdata<String> kecamatan = new generikdata<>();
        generikdata<String> kota = new generikdata<>();
        generikdata<String> kodepos = new generikdata<>();
        generikdata<String> kodetas = new generikdata<>();
        generikdata<String> kodesepatu = new generikdata<>();
        generikdata<String> pengiriman = new generikdata<>();
        
        do{
            
    t = "\tJl Mawarmelati 1 no.99"; 
    System.out.println("=============Authentic Stuf=============");
    genclass.toko(t);
            System.out.println(tk.nama("\tJl Kayu Manis 3 no.91"));
    System.out.println("1.  Katalog Tas");
    System.out.println("2.  Katalog Sepatu");
    System.out.println("3.  Data Pembelian");
    System.out.println("4.  Keluar");
    
    System.out.print("\nPilih menu 1-4 : ");
    menu= input.nextInt();
    
    switch(menu){
        case 1 :
            brg.tampiltas();
            break;
             case 2 :
                 brg.tampilsepatu();
            break;
             case 3 :
                 pembeli.setData(input.nextLine());
                 
                 System.out.print("Masukan nama   : ");
                 nama.setData(input.nextLine());
                 System.out.print("Masukan alamat : ");
                 alamat.setData(input.nextLine());
                 System.out.print("\tMasukan rt/rw     : ");
                 rtrw.setData(input.nextLine());
                 System.out.print("\tMasukan kelurahan : ");
                 kelurahan.setData(input.nextLine());
                 System.out.print("\tMasukan kota      : ");
                 kota.setData(input.nextLine());
                 System.out.print("\tMasukan kode pos  : ");
                 kodepos.setData(input.nextLine());
                 System.out.print("Masukan kode tas    : ");
                 kodetas.setData(input.nextLine());
                 System.out.print("Masukan jumlah tas  : ");
                 jumlah_tas=input.nextInt();
                 pbl.setData(input.nextLine());
                 System.out.print("Masukan kode sepatu         : ");
                 kodesepatu.setData(input.nextLine());
                 System.out.print("Masukan jumlah sepatu       : ");
                 jumlah_sepatu=input.nextInt();
                 krm.setData(input.nextLine());
                 System.out.print("Masukan pengiriman(REG/YES) : ");
                 pengiriman.setData(input.nextLine());
                 
                 if ("t01".equals(kodetas.getData()) || "T01".equals(kodetas.getData())) {
                     tottas = hit.hitungbBarang(harga.getTas1(), jumlah_tas);
                     
                 } else if("t02".equals(kodetas.getData()) || "T02".equals(kodetas.getData())){
                     tottas = hit.hitungbBarang(harga.getTas2(), jumlah_tas);
                 }
                 else tottas=0;
                 
                 if ("s01".equals(kodesepatu.getData()) || "S01".equals(kodesepatu.getData())) {
                     totsepatu = hit.hitungbBarang(harga.getSepatu1(), jumlah_sepatu);
                     
                 } else if("s02".equals(kodesepatu.getData()) || "S02".equals(kodesepatu.getData())){
                     totsepatu = hit.hitungbBarang(harga.getSepatu2(), jumlah_sepatu);
                 }
                 else totsepatu=0;
                 
                 totbarang = hit.hitungbTotal(tottas, totsepatu);
                 
                 
                 System.out.println("Nama      :  "+nama.getData());
                 System.out.println("Alamat    :  "+alamat.getData());
                 System.out.println("\trt/rw      :  "+rtrw.getData());
                 System.out.println("\tKelurahan  :  "+kelurahan.getData());
                 System.out.println("\tKecamatan  :  "+kecamatan.getData());
                 System.out.println("\tKota       :  "+kota.getData());
                 System.out.println("\tKode Pos   :  "+kodepos.getData());
                 System.out.println("Kode Tas      :  "+kodetas.getData());
                 System.out.println("Jumlah Tas    :  "+jumlah_tas);
                 System.out.println("Kode Sepatu   :  "+kodesepatu.getData());
                 System.out.println("Jumlah Sepatu :  "+jumlah_sepatu);
                 System.out.println("Pengiriman    :  "+pengiriman.getData());
                 System.out.println("Total Tas        :  "+tottas);
                 System.out.println("Total Sepatu     :  "+totsepatu);
                 System.out.println("Total Pembayaran :  "+totbarang);
                 
                 
                 
                 
              
                 
                 
                 
            break;
             default:System.exit(0);
             
    
    
    
    
    }
    System.out.print("kembali ke menu tekan Y :");
    kembali = input.next().charAt(0);
            System.out.println("\n\n\n");
            
            
            
            
            
    
    
    
    
    }
        while(kembali=='Y'||kembali=='y');
        }
    
    
    
}
