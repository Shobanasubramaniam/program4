import java.util.Scanner;
class error{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        char[] c={'a','e','i','o','u','A','E','I','O','U'};
        String s=new String(c);
        int i;
        try {
            for(i=0;i<name;i++){
                if(name.contains(s)){
                    System.out.println("contains vowels");
                }
            }
        }
        catch (Exception e) {
            System.out.println("not contains");
        }
        
    }

}


