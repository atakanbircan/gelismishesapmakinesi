import java.util.Scanner;

public class Main {

    static int sum(int a,int b){
        int result=a+b;
        System.out.println("Toplam :"+result);
        return result;
    }
    static int minus(int a,int b){
        int result=a-b;
        System.out.println("Farkları :"+result);
        return result;
    }
    static int carpma(int a, int b){
        int result=a*b;
        System.out.println("Çarpımları: "+result);
        return result;
    }
    static int divide(int a,int b){
        if (b==0){
            return -1;
        }
        else{
        int result=a/b;
        System.out.println("Bolumleri"+result);
        return result;}
    }
    static int exponential(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
           result*=a;
        }
        System.out.println(a+" üssü "+ b+" :"+ result);
        return result;
    }
    static int modAlma(int a,int b){
        int result;
        result= a%b;
        System.out.println("a mod b :"+result);
        return result;
    }
    static int rectangleAreaandEnvironment(int a,int b){
        int area;
        int environment;
        area=a*b;
        environment=2*(a+b);
        System.out.println("Dikdörtgen Alanı : "+area);
        System.out.println("Dikdörtgenin Çevresi :"+environment);
        return area;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int select;
        String menu=
                "1-Toplama İşlemi\n"+
                "2-Çıkarma İşlemi\n"+
                "3-Çarpma İşlemi\n"+
                "4-Bölme İşlemi\n"+
                "5-Üslü Sayı Hesaplama\n"+
                "6-Mod alma\n"+
                "7-Dikdörtgen Alan ve Çevre Hesabı\n"+
                "0-Çıkış Yap";

        while (true){
            System.out.println(menu+"\nSeçtiğiniz işleminizin numarası nedir:  ");
            select = input.nextInt();
            if (select==0){
                System.out.println("çıkış yaptınız.");
                break;
            }
            System.out.println("1.sayı giriniz: ");
            int a= input.nextInt();
            System.out.println("2.sayı giriniz: ");
            int b = input.nextInt();
            switch (select){
                case 1:
                sum(a,b);
                break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    carpma(a,b);
                    break;
                case 4:
                    if (divide(a,b)==-1){
                        System.out.println("bölen sayı 0 olamaz!");
                    }
                    else {
                    divide(a,b);}
                    break;
                case 5:
                    exponential(a,b);
                    break;
                case 6:
                    modAlma(a,b);
                    break;
                case 7:
                    rectangleAreaandEnvironment(a,b);
                    break;
                default:
                    System.out.println("geçersiz işlem numarası girdiniz!");
            }
        }

    }

}