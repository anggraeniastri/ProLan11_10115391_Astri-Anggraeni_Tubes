/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASTRI
 */
public class hitungbrg extends abstrak {

    @Override
    protected int hitungbBarang(int x, int y) {
        return x*y; 
    }

    @Override
    protected int hitungbTotal(int x, int y) {
        return x+y; 
    }
    
}
