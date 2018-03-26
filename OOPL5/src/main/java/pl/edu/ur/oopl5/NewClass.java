/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;
/**
 *
 * @author student
 */
public class NewClass {
    public static void main(String[] args){
    Ksiazka ki= new Ksiazka("Bastion","Stepfen King",823,1978, 36.70);
    Ksiazka k2= new Ksiazka("Krzyżacy","Henryk Sienkiewicz", 589,1900,26.99);
    Ksiazka k3= new Ksiazka("Hobbit: Czyli tam i z powrotem","JRR Tolkie", 2002113,1937,16.44);
    
  k3.setCena(16.45);
  
  Data d=new Data();
  d.aktualnaData();
}
}