1. 
public static String flip(){
    Random rand = new Random();
    r = rand.nextInt(3);
    if (r == 0 || r == 1){
        return "heads";
    }else{
        return "tails";
    }
}

2. 
public static boolean arePermutations(int[] values1, int[] values2){
    for (int i = 0; i < values1.length; i++){
        int sameCount = 0;
        for (int j = 0; j < values2.length; j ++){
            if (values1[i] == values2[j]){
                sameCount += 1;
            }
        }
        if (sameCount == 0){
            return false;
        }
    }
    return true;
}

3. r would equal 1, then 2, then 3, then 4.