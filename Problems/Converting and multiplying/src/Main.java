import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNext()) {
            String curr = input.nextLine();

            try {
                int num = Integer.parseInt(curr);
                num *= 10;
                if(num == 0) {break;}
                System.out.println(num);
            } catch(Exception e) {
                System.out.println("Invalid user input: " + curr);
            }
        }
    }
}