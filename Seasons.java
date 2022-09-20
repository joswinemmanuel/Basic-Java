public class Seasons {
    public static void main(String[] args){
        int s = 10;
        switch(s){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("SEASON 1");
                break;
            case 5:
            case 6:
                System.out.println("SEASON 2");
                break;
            case 7:
            case 8:
                System.out.println("SEASON 3");
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("SEASON 4");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}

// SEASON 4