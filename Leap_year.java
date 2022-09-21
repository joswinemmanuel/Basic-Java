public class Leap_year {
    public static void main(String[] args){
        int year = 2016;
        if(year % 4 == 0)
            if(year % 100 == 0)
                if(year % 400 == 0)
                    System.out.println("LEAP YEAR");
                else
                    System.out.println("Not LEAP YEAR");
            else
                System.out.println("LEAP YEAR");
        else
            System.out.println("Not LEAP YEAR");
                        
    }
}

// LEAP YEAR