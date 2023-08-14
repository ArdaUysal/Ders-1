public class findNumber {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,5,7,9,0};
        int findThisNumber = 10;
        boolean isFind = false;
        for(int i = 0; i < numbers.length; i++){
            if(findThisNumber == numbers[i]){
                isFind = true;
            }
        }

        if(isFind){
            System.out.println(findThisNumber + " listenin içinde bulunuyor.");
        } else {
            System.out.println(findThisNumber + " listenin içinde bulunmuyor.");
        }
    }
}
