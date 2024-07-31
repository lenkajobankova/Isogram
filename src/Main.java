import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(isIsogram());
        System.out.println(isIsogram());
        System.out.println(isIsogram());
        System.out.println(isIsogram());
        System.out.println(isIsogram());

    }

    private static boolean isIsogram() {
        Scanner sc = new Scanner(System.in);
        String isogram = sc.nextLine();
        boolean isIsogram = false;
        for (int i = 0; i < isogram.length(); i++){
            for (int j = 1+i; j < isogram.length(); j++){
                if (Character.valueOf(isogram.charAt(j)).compareTo(Character.valueOf(isogram.charAt(i))) == 0){
                    return false;
                } else {
                    isIsogram = true;
                }
            }
        }
        return isIsogram;
    }
}
