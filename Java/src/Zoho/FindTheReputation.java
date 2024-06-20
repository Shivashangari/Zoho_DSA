package Zoho;

import java.util.Arrays;

public class FindTheReputation {
    public void findDuplicate(){
        int a[]={100,200,300,400,500,100,100,300,200,400};
        int number=100;
        int count=0;
        for(int value :a){
            if (value==number){
                count++;
            }

        }
        System.out.println(count);
    }


    public void reputation(){
        int nums[]={131, 11, 48};


       for(int numbers:nums){
           //System.out.println(numbers);
           if(numbers>0){
               int digits= numbers%10;


           }
       }

    }
    public static void main(String[] args) {
        FindTheReputation findTheReputation=new FindTheReputation();
        //findTheReputation.findDuplicate();
        findTheReputation.reputation();
    }

}
