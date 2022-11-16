import java.util.Scanner;
class multy2d{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a row and cols");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr1[][]=new int[r][c];//2x3 3x2
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter a row and cols");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        if(c!=r1)
        {
            System.out.println("cannot multiply this matrix...!");
            return;
        }
        int arr2[][]=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
       int arr3[][]=new int[r][c1];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr3[i][j]=0;
                for(int k=0;k<r1;k++)
                {
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        
        System.out.println("-----------------------------");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}