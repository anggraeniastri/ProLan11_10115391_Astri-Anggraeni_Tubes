/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASTRI
 */
public class kelastmp implements implementampilan{

    @Override
    public void tampiltas() {
        enkapsulasi harga = new enkapsulasi();
        System.out.println("Kode  : T01"); 
        System.out.println("Merk  : Stradivarius ");
        System.out.println("Warna : Merah");
        System.out.println("Harga : Rp "+harga.getTas1());
        
        System.out.println("\nKode  : T02"); 
        System.out.println("Merk  : Tods ");
        System.out.println("Warna : Hitam");
        System.out.println("Harga : Rp "+harga.getTas2());
        
        
    }

    @Override
    public void tampilsepatu() {
        enkapsulasi harga = new enkapsulasi();
        System.out.println("Kode  : S01"); 
        System.out.println("Merk  : Tods ");
        System.out.println("Warna : Biru");
        System.out.println("Harga : Rp "+harga.getSepatu1());
        
        System.out.println("\nKode  : S02"); 
        System.out.println("Merk  : Papillon ");
        System.out.println("Warna : Oranye");
        System.out.println("Harga : Rp "+harga.getSepatu2());
        
        
    }
    
    
    
}
