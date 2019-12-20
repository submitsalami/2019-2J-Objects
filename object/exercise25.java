public class exercise25{
    public static void main (String[]args){
        int[]n = {12,32,43,8,42,90};
        int[]n2 = new int[]{n.length};
        
        
        for (int i =0; i<n.length; i++){
         System.out.print(n[i]+" ");
        }
        System.out.println(" ");
        for (int j= n.length-1;j>=0;j--){
            System.out.print(n[j]+" ");
        }
    }
}