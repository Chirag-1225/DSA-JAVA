public class Q28_UnionOftwoArrBrute {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={3,4,5,6};
        int temp[] = new int[arr1.length + arr2.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while(i<arr1.length && j<arr2.length){
             if(arr1[i]>arr2[j]){
                 temp[k] = arr2[j];
                 j++;
                 k++;
             }else if(arr1[i]<arr2[j]){
                temp[k] =arr1[i];
                i++;
                k++;
             }else if(arr1[i]==arr2[j]){
                temp[k]=arr1[i];
                i++;
                j++;
                k++;

             }
             
        }
        while(j < arr2.length){
            temp[k] = arr2[j];
            j++;
            k++;

        }
        while(i < arr1.length){
            temp[k] = arr1[i];
            i++;
            k++;
        }
        for(int x = 0; x < k; x++) {
            System.out.print(temp[x] + " ");
        }

    }
}
