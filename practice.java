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

        //capgemini question
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter no of semester:");
        // int sem=sc.nextInt();
        // int[] arr=new int[sem];
        // for(int i=0;i<sem;i++){
        //     System.out.println("Enter no of subjects in "+(i+1)+" semester:");
        //     arr[i]=sc.nextInt();
        // }
        // int n=10;
        // int[] marks=new int[n];
        // int[] max=new int[arr.length];
        // for(int i=0;i<sem;i++){
        //     System.out.println("Marks obtained in semester "+(i+1));
        //     for(int j=0;j<arr[i];j++){
        //         marks[j]=sc.nextInt();
        //         if(marks[j]<0 || marks[j]>100){
        //             System.out.println("You have entered invalid mark");
        //             j=j-1;
        //         }
        //     }
        //     max[i]=marks[0];
        //     for(int j=0;j<arr[i];j++){
        //         if(max[i]<marks[j]){
        //             max[i]=marks[j];
        //         }
        //     }
        // }
        // for(int i=0;i<max.length;i++){
        //     System.out.println("Maximum marks in "+(i+1)+" semester:"+max[i]);
        // }

        //sum of adjacent distances
        // int arr[]={10,11,7,12,14};
        // int n=5;
        // int sum=0;
        // for(int i=0;i<n-1;i++){
        //     int diff=0;
        //     diff=arr[i]-arr[i+1];
        //     if(diff<0){
        //         diff=diff*(-1);
        //     }
        //     sum=sum+diff;
        // }
        // System.out.println(sum);

        //security key
        // String num="5783789233";
        // int count=0;
        // for(int i=0;i<num.length();i++){
        //     boolean firstOccurrence=true;
        //     for(int k=0;k<i;k++){
        //         if(num.charAt(k)==num.charAt(i)){
        //             firstOccurrence=false;
        //             break;
        //         }
        //     }
        //     if(!firstOccurrence)
        //         continue;
        //     for(int j=i+1;j<num.length();j++){
        //         if(num.charAt(i)==num.charAt(j)){
        //             count++;
        //             break;
        //         }
        //     }
        // }System.out.println(count);

        
        // int n=4;
        // int sum=0;
        // int sum2=0;
        // int[] arr={0,1,2,3};
        
        // for(int j=0;j<=n;j++){
        //     sum=sum+j;
        // }
        // for(int k=0;k<n;k++){
        //     sum2=sum2+arr[k];
        // }
        // int diff=sum-sum2;
        // System.out.println(diff+" is the missing number");

        int arr1[]={1,2,2,1};
        int arr2[]={2,2};
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hash.add(arr1[i]);
        }
        HashSet<Integer> result=new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            if(hash.contains(arr2[i])){
                result.add(arr2[i]);
            }
        }
        System.out.println(result);
        // int l1=arr1.length;
        // int l2=arr2.length;
        // int x=Math.min(l1,l2);
        // int arr3[]=new int[x];
        // int arr4[]=new int[arr3.length];
        //     for(int i=0;i<x;i++){
        //         if(x==l1){
        //             int a=arr1[i];
        //         for(int j=0;j<l2;j++){
        //             if(a==arr2[j]){
        //                 arr3[i]=arr2[j];
        //                 break;
        //             }
        //         }
        //         }
        //         if(x==l2){
        //             int a=arr2[i];
        //         for(int j=0;j<l1;j++){
        //             if(a==arr1[j]){
        //                 arr3[i]=arr1[j];
        //                 break;
        //             }
        //         }
        //         }
        //     }
        //     int size = 0;
        //     for(int i=0;i<arr3.length;i++){
        //         boolean found = false;
        //             for(int j=0;j<size;j++){
        //                 if(arr3[i] == arr4[j]){
        //                     found = true;
        //                     break;
        //                 }
        //             }
        //         if(!found){
        //             arr4[size] = arr3[i];
        //             size++;
        //         }
        //     }
        //     System.out.println(Arrays.toString(arr4));

    }
}