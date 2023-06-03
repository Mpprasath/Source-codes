class Solution {
    public void duplicateZeros(int[] arr) {
      int temp[]=new int[arr.length];
      int i=0,j=0;
        while(j<arr.length&&i<arr.length){
          if(arr[i]==0){
              temp[j]=arr[i];
              if(j+1<arr.length){
              temp[j+1]=0;
              }
              j=j+2;
              i++;
          }else{
            temp[j]=arr[i];
            i++;
            j++;
          }
        }
        for(int k=0;k<arr.length;k++){
          arr[k]=temp[k];
        }
    }
}
