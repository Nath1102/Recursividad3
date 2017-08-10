/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edt2recursividad_3;

/**
 *
 * @author nathalyarias
 */
public class T2RecursividadClass3 {
    public static int multiplicar (int v [], int n) {
        if (n == 0) {
            return (v [0]);
    }
            return (v [n] * multiplicar (v, n - 1));
    }
    
}
