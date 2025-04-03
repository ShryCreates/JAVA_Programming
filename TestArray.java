class TestArray {
    public static void main(String args[]){
        int a[]={10,20,30,40,50}; //initialization
        for(int i=0;i<a.length;i++){ //array traversing
            System.out.println(a[i]);
        }
        float sum=0; //average calculation
        float avg;
        for(int i=0;i<a.length;i++)
            sum+=a[i];
            avg=sum/a.length;
            System.out.println("Average of array elements is "+avg);   
    }
}
