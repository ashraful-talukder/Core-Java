/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8;

import static java.lang.Math.PI;
import java.util.Date;

/**
 *
 * @author WALTON
 */
public class StaticImport {
    
    public static void main(String[]args){
        System.out.println(PI);
        System.out.println(Math.E);
        System.out.println(Math.sqrt(9));
        System.out.println(Integer.parseInt("30"));
        Date dt = new Date();
    }
}
