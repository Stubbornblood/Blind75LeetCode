class Main{
    public static void main(String[] args){



        int array[] = {3,3};
        int k = 6;
        
        for(int i = 0 ; i< array.length;i++){
            for(int j = i+1 ; j<array.length;j++){
                if (array[i] + array[j] == k){
                    // System.out.println(i+" "+j);  
                    // return new int[]{i,j};
                }
            }
        }
        // return null;

        // System.out.println(array[1].length);








    }
}