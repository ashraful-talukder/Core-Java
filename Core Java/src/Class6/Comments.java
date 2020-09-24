/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class6;

/**
 *
 * @author WALTON
 */
public class Comments {
    
    /*
    This is a class for describing the comments. In this class three types of comments-
    1) single line comments
    2) multi line comments
    3) documentation comments
    are described with example.
    */
    
    /**
     * This is a method of sum up two integer values.
     * @param x this is the first parameter
     * @param y this is the second parameter
     * @return it returns the sum of the two parameters
     */
    public int doSum(int x, int y){
        return x+y;
    }
    
    public static void main(String[]args){
        Comments com = new Comments();
        int c = com.doSum(7,8); //we can see the documentation by pressing ctrl+space
        System.out.println("Result = "+c);
    }
}
