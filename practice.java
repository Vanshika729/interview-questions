import java.lang.reflect.Array;
import java.util.*;
public class practice{
    // public static int editalgo(String str1, String str2){
        // int n=0;
        // int l1=str1.length();
        // int l2=str2.length();
        // if(l1==0){
        //     return l2;
        // }
        // if(l2==0){
        //     return l1;
        // }
        // if(str1.charAt(0)==str2.charAt(0))
        //     return editalgo(str1.substring(1),str2.substring(1));
        // int insert=editalgo(str1, str2.substring(1));
        // int delete=editalgo(str1.substring(1), str2);
        // int replace=editalgo(str1.substring(1), str2.substring(1));
        // return 1+Math.min(insert, Math.min(replace, delete));
    // }
    public static void main(String[] args){
        // String str1="abcd";
        // String str2="abc";
        // System.out.println("edit distance: "+editalgo(str1, str2));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of semester:");
        int sem=sc.nextInt();
        int[] arr=new int[sem];
        for(int i=0;i<sem;i++){
            System.out.println("Enter no of subjects in "+(i+1)+" semester:");
            arr[i]=sc.nextInt();
        }
        int n=10;
        int[] marks=new int[n];
        int[] max=new int[arr.length];
        for(int i=0;i<sem;i++){
            System.out.println("Marks obtained in semester "+(i+1));
            for(int j=0;j<arr[i];j++){
                marks[j]=sc.nextInt();
                if(marks[j]<0 || marks[j]>100){
                    System.out.println("You have entered invalid mark");
                    j=j-1;
                }
            }
            max[i]=marks[0];
            for(int j=0;j<arr[i];j++){
                if(max[i]<marks[j]){
                    max[i]=marks[j];
                }
            }
        }
        for(int i=0;i<max.length;i++){
            System.out.println("Maximum marks in "+(i+1)+" semester:"+max[i]);
        }
    }
}