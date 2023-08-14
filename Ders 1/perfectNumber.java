public class perfectNumber {
    public static void main(String[] args) {
        int number = 34;
        int total = 0;
        System.out.println("Mükemmel Sayıları Bulma");
        System.out.println("-----------------------------");
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                total += i;
            }
        }

        if(number == total){
            System.out.println("Sayı mükemmel sayıdır.");
        } else {
            System.out.println("Sayı mükemmel sayı değildir.");
        }

        
    }
}
