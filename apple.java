import java.util.*;
public class apple{
    static void helper(int i1,ArrayList<Integer> ls,ArrayList<Integer> ans,int target){
        int sum=0;
       for( int i=i1;i<ls.size();i++){
           if(target>=sum+ls.get(i)&& ls.get(i)!=0){
            ans.add(ls.get(i));
            sum+=ls.get(i);
            ls.set(i, 0);
           }
           else{
            i++;
           }
       }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> apples=new ArrayList<>();
        System.out.println("run distribute_apple");
        System.out.print("Enter apple weight in gram (-1 to stop) : ");
        int gm=sc.nextInt();
        while(gm!=-1){
          apples.add(gm);
          System.out.print("Enter apple weight in gram (-1 to stop) : ");
          gm=sc.nextInt();
        }
        int total_weight=0;
        for(Integer i:apples) total_weight+=i;
        int ram_total=(int)50*total_weight/100;
        int shyam_total=(int)30*total_weight/100;
        int rahim_total=(int)20*total_weight/100;
        Collections.sort(apples,Collections.reverseOrder());
        ArrayList<Integer> ram=new ArrayList<>();
        ArrayList<Integer> shyam=new ArrayList<>();
        ArrayList<Integer> rahim=new ArrayList<>();
        helper(0,apples,ram,ram_total);
        Collections.sort(apples,Collections.reverseOrder());
        helper(0,apples,shyam,shyam_total);
        Collections.sort(apples,Collections.reverseOrder());
        helper(0,apples,rahim,rahim_total);
        System.out.println("ram : "+ram);
        System.out.println("shyam :"+shyam);
        System.out.println("Rahim : "+rahim);
        sc.close();
    }
}