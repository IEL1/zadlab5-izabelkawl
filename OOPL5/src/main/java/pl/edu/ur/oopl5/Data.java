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
public class Data{
    private int dzien;
    private int miesiac;
    private int rok;

    public Data(int dzien, int miesiac, int rok) throws Exception {
        switch (miesiac) {
            
            case 1:
                this.miesiac = miesiac;
                if(dzien > 0 && dzien <= 31)
                {this.dzien = dzien;
                }
                else{
                    System.err.print("Nie ma takiego dnia");
                    throw new Exception();
                }
                break;
            case 2:
                this.miesiac = miesiac;
                if(dzien > 0 && dzien <= 29)
                {this.dzien = dzien;
                }
                else{
                    System.err.print("Nie ma takiego dnia");
                    throw new Exception();
                }
                break;
            case 3:
                this.miesiac = miesiac;
                if(dzien > 0 && dzien <= 31)
                {this.dzien = dzien;
                }
                else{
                    System.err.print("Nie ma takiego dnia");
                    throw new Exception();
                }
                break;
            case 4:
                this.miesiac = miesiac;
                if(dzien > 0 && dzien <= 30)
                {this.dzien = dzien;
                }
                else{
                    System.err.print("Nie ma takiego dnia");
                    throw new Exception();
                }
                break;
            case 5:
                this.miesiac = miesiac;
                if(dzien > 0 && dzien <= 31)
                {this.dzien = dzien;
                }
                else{
                    System.err.print("Nie ma takiego dnia");
                    throw new Exception();
                }
                break;
            case 6:
                this.miesiac = miesiac;
                if(dzien > 0 && dzien <= 30)
                {this.dzien = dzien;
                }
                else{
                    System.err.print("Nie ma takiego dnia");
                    throw new Exception();
                }
                break;
            case 7:
                this.miesiac = miesiac;
                if(dzien > 0 && dzien <= 31)
                {this.dzien = dzien;
                }
                else{
                    System.err.print("Nie ma takiego dnia");
                    throw new Exception();
                }
                break;
            case 8:
                this.miesiac = miesiac;
                if(dzien > 0 && dzien <= 31)
                {this.dzien = dzien;
                }
                else{
                    System.err.print("Nie ma takiego dnia");
                    throw new Exception();
                }
                break;
            case 9:
            this.miesiac = miesiac;
                if(dzien > 0 && dzien <= 30)
                {this.dzien = dzien;
                }
                else{
                    System.err.print("Nie ma takiego dnia");
                    throw new Exception();
                }
                break;
            case 10:
                this.miesiac = miesiac;
                if(dzien > 0 && dzien <= 31)
                {this.dzien = dzien;
                }
                else{
                    System.err.print("Nie ma takiego dnia");
                    throw new Exception();
                }
                break;
            case 11:
            this.miesiac = miesiac;
                if(dzien > 0 && dzien <= 30)
                {this.dzien = dzien;
                }
                else{
                    System.err.print("Nie ma takiego dnia");
                    throw new Exception();
                }
                break;
            case 12:
                this.miesiac = miesiac;
                if(dzien > 0 && dzien <= 31)
                {this.dzien = dzien;
                }
                else{
                    System.err.print("Nie ma takiego dnia");
                    throw new Exception();
                }
                break;
        }
                this.dzien = dzien;
                this.miesiac = miesiac;
                this.rok = rok;
        }


    }
