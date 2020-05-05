package day34_CustomClass;

import sun.security.util.Length;

public class Carpet {

        double width;
        double length;
        double unitPrice;
        boolean isPersian;


        //(width+length)*unitPrice

    public void customOrder(double carpetWidth, double carpetLength,double carpetUnitPrice,boolean carpetPersian){
        width = carpetWidth;
        length = carpetLength;
        unitPrice = carpetUnitPrice;
        isPersian = carpetPersian;
    }
    public String toString(){
       String result ="Width is:" + width + "m" + " Length is:" + length + "m" + " UnitPrice is:" + unitPrice + "$"  + " Persian Made:" + isPersian + " Total Cost:" + calcCost() + "$";
        return result;
    }

    public double calcCost(){
      double total = (width*length)*unitPrice;

      if (isPersian=true){
          total += 250;
      }
        return total;


     // return total (isPersian) ? total+200 : total ;
    }

}
