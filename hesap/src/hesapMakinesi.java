import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input= new Scanner(System.in);
        System.out.print("SAYIYI GİRİNİZ:");
        n1 = input.nextInt();
        System.out.print("2.SAYIYI GİRİNİZ:");
        n2= input.nextInt();

        System.out.println("1-toplama,2-çıkarma,3-çarpma,4-bölme");
        System.out.print("İŞLEMİNİZİ SEÇİNİZ:");
        select= input.nextInt();

        switch (select){
            case 1:
                System.out.println(n1+n2); break;
            case 2:
                System.out.println(n1-n2); break;
            case 3:
                System.out.println(n1*n2); break;
            case 4:
                switch (n2){
                    case 0:System.out.println("0 ile bölme yapılamaz");break;
                    default:
                        System.out.println(n1/n2);break;
                }break;

            default:
                System.out.println("HATALI İŞLEM");  }


        }

    }

