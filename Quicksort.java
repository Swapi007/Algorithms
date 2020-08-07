class Solution {
    public static void main(String[] strs) {
        int A[]={7,6,5,4,3,2,1,0};
        qs(A,0,A.length-1);
        for(int i=0;i<A.length;i++){
        System.out.println(A[i]+" ");
        }
    }
    public static void qs(int A[],int start,int end){
        if(start<end){
            int pindex=partition(A,start,end);
            qs(A,start,pindex-1);
            qs(A,pindex+1,end);
        }
    }
    public static int partition(int A[],int start,int end){
        int piv=A[end];
        int pindex=start;
        for(int i=start;i<end;i++){
            if(A[i]<piv){
                int temp=A[i];
                A[i]=A[pindex];
                A[pindex]=temp;
                pindex++;
            }
        }
        int temp=A[pindex];
        A[pindex]=A[end];
        A[end]=temp;
        return pindex;
    }
}
