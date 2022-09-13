public class Main {
    public static void main(String[] args) {
        double[] nums = {10.9,2.6,3.6,7,-5.2,1.5,31.6,8.8,6.1,};
        boolean proverka = false;
        double count = 0;
        int result = 0;

        for (double i:nums) {
            if (i<0){
                proverka=true;

            }else if (i>0 &&proverka){

                if (i>0){
                    count = count+i;

                result++;
            }

        }}
        System.out.println(count / result);
    }
}