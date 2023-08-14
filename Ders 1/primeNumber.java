public class primeNumber{
    public static void main(String[] args) {
        int number = 2;
        boolean isPrime = true;
        System.out.println("Asal Sayı Hesaplama");
        System.out.println("---------------------------");
        if(number <= 1){
            isPrime = false;
        }
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        
        if(isPrime){
            System.out.println("Sayı asaldır.");
        } else {
            System.out.println("Sayı asal değildir.");
        }
            
    }
}