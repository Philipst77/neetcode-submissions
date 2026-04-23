// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        return mergerHelper( pairs, 0 , pairs.size() -1);
    }

    public List<Pair> mergerHelper(List<Pair> arr , int l , int r){
        if( l < r){
            int m = l + ( r-l) /2;

            mergerHelper(arr, l , m);
            mergerHelper(arr, m+1 , r);
            merge(arr , l ,m,r);
        }
        return arr;
    }  

    public static void merge(List<Pair> arr , int l ,int m , int r){

        List<Pair> L = new ArrayList<>(arr.subList(l, m+1));
        List<Pair> R = new ArrayList<>(arr.subList(m+1, r+1));


        int i=0;
        int j =0;
        int k =l;

        while(i < L.size() && j < R.size()){
            if( L.get(i).key <= R.get(j).key){
                arr.set(k, L.get(i));
                i++;
            } else{
                arr.set(k, R.get(j));
                j++;
            }
            k++;
        }
        while( i < L.size()){
            arr.set(k, L.get(i));
            i++;
            k++;
        }
        while( j < R.size()){
            arr.set(k, R.get(j));
            j++;
            k++;
        }
    }   
}
