/*
*
* Permutasyon hesaplama
*
* */

public class Question3 {

    public static void main(String[] args) {

        int bigPermutation = 7;
        int smallPermutation = 3;

        int smallP = bigPermutation - smallPermutation;

        int factorielOfBig = 1;
        int factorielOfSmall = 1;

        for (int i = bigPermutation; i> 1 ; i--){
            factorielOfBig = factorielOfBig*i;
            if (i<=smallP){
                factorielOfSmall = factorielOfSmall * i;
            }


        }
        System.out.println("Permutation is : " + factorielOfBig/factorielOfSmall);



    }

}
