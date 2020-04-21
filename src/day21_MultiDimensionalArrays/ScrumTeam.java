package day21_MultiDimensionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {

        String [] DevTeam = {"Zeynep","Haider","Jpovid","Muhtar"};
        String [] Testers = {"Rahman","Aishan","Osman","Ali"};
        String [] PO = {"Barzy","Donald"};

        String  ScrumTeam [][] = {DevTeam,Testers,PO};
                //                     0   1
        ScrumTeam[0][3] = "Jean";

        System.out.println(ScrumTeam[0][3]);
        String info =  ScrumTeam[1][2];
        System.out.println(info);

        System.out.println("===============================================");

        for ( String each  :ScrumTeam[2]){
            System.out.println(each);
        }



    }
}
