class a2DArray{
    public static void main(String args[]){
        int my2DArray[][]=new int [2][3];
        for(int i=0;i<2;i++)
         for(int j=0;j<3;j++)
          my2DArray[i][j]=i*j;
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++)
             System.out.print(my2DArray[i][j]+" ");
             System.out.println();
        }
    } 
}
