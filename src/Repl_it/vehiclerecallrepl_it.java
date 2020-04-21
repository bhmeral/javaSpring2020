package Repl_it;

public class vehiclerecallrepl_it {
    public static void main(String[] args) {
        int vehicleYear =  ' ';
        String recall = " ";

        if(vehicleYear>=1995 && 1998>=vehicleYear ||
                vehicleYear>=2001 && 2002>=vehicleYear ||
                vehicleYear>=2004 && 2006>=vehicleYear ||
                vehicleYear>=2015 && 2017>=vehicleYear)  {
            recall = "Your vehicle needs to be recalled";
        }else{
            recall = "Your vehicle is fine, enjoy!";
        }

        System.out.println(recall);


    }
}
