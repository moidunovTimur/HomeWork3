public class Main {
    public static void main(String[] args) {
        double[] nums = {10.9,2.6,3.6,7,-5.2,1.5,31.6,8.8,6.1,};
        boolean proverka = false;
        for (double i:nums) {
            if (i>0){
                proverka=true;
                System.out.println(i);

            }

        }
    }
}