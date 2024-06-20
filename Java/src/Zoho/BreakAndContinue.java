package Zoho;

public class BreakAndContinue {
    public void breakCheck() {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
    public  void continueCheck(){
        for (int i=1; i<=10;i++){
            if(i==3 || i==5 || i==9){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        BreakAndContinue breakAndContinue=new BreakAndContinue();
        //breakAndContinue.breakCheck();
        breakAndContinue.continueCheck();
    }
}
