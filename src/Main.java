import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,password,newpassword;
        boolean select;

        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı adınızı girin:");
        userName=input.nextLine();
        System.out.print("Şıfrenizi girin:");
        password=input.nextLine();
     //   System.out.print("YES mi NO mu:yes veya no basın");
      //  select=input.nextBoolean();

        if(userName.equals("patika")&&password.equals("java101")){
            System.out.print("Giriş yaptınız!");
        }else{
            System.out.println("Bilgileriniz yanlış! Şifrenizi sıfırlamak istiyormusunuz");
            System.out.print("true mi false mu?");
            select=input.nextBoolean();

             if(select=true){
                System.out.println("Yeni sifrenizi girin:");
                Scanner iput=new Scanner(System.in);
                newpassword=iput.nextLine();
                if(newpassword!=password && newpassword!="patika"){
                   System.out.print("Sifreniz basarıyla degiştirildi");
                }else{
                    System.out.print("Tekrar deneyiniz.");
                }

            }else if(select=false){
                System.out.print("Giris yapılamadı");
            }

        }

    }
}