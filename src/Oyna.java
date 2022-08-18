
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Oyna {

    public Oyna(Oyuncu o) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        HashMap<Integer, String> MasinNomre=new HashMap<>();
    MasinNomre.put(1, "Abseron");
        MasinNomre.put(2, "Agdam");
            MasinNomre.put(3, "Agdas");
    MasinNomre.put(4, "Agcabedi");
        MasinNomre.put(5, "Agstafa");
            MasinNomre.put(6, "Agsu");
    MasinNomre.put(7, "Astara");
        MasinNomre.put(8, "Baleken");
            MasinNomre.put(9, "Berde");
    MasinNomre.put(10, "Baki");
        MasinNomre.put(11, "Beyleqan");
            MasinNomre.put(12, "Bilesuvar");
    MasinNomre.put(31, "Ismayilli");
        MasinNomre.put(14, "Cebrayil");
    MasinNomre.put(15, "Celilabad");
    MasinNomre.put(16, "Daskesen");
        MasinNomre.put(17, "Deveci");
    MasinNomre.put(18, "Eli Bayramli");
        MasinNomre.put(19, "Fuzuli");
            MasinNomre.put(20, "Gence");
    MasinNomre.put(21, "Gedebey");
        MasinNomre.put(22, "Goranboy");
    MasinNomre.put(23, "Goycay");
        MasinNomre.put(24, "Haciqabul");
    MasinNomre.put(25, "Xanlar");
        MasinNomre.put(26, "Xankendi");
    MasinNomre.put(27, "Xacmaz");
            MasinNomre.put(28, "Xocavend");
    MasinNomre.put(29, "Xizi");
         MasinNomre.put(30, "Imisli");
    
         
         while(true){
    String mesaj="\n\n Oyuna xos geldiniz "+o.getName()+"\n Oyunda 3 haqqiniz var. Haqqiniz bitdikden sonra oyuna yeniden baslaya "
            + "bilersiniz. Nezerinize catdiraqki bu sadece test meqsedli oyundur.\n\n"
            + "DIQQET! Oyunda adini qeyd etdiyiniz regionlarin bas herfleri boyuk olmalidir eks teqdirde duz sayilmayacaq.";
        System.out.println(mesaj);
        System.out.print("\n\n Oyun baslayir");
        for(int i=1;i<=3;i++){
          Thread.sleep(1000);
               System.out.print(".");
       }
        System.out.println("\nOyun basladi "+o.getName()+"!\n");
         int haqq=3;
         int rand=random.nextInt(30)+1;
         for(int i=haqq;i>0;i--){
             System.out.print(rand+". Hansi regionun nomresidir? \n Region:");
            
             String texmin=scanner.nextLine();
             if(texmin.equals(MasinNomre.get(rand))){
                 System.out.println("Tebrikler "+o.getName()+"! Oyun bitdi.");
              break;
             }else {
                 if(i!=1){
                  System.out.println("Sehv tapdiniz. "+(i-1)+" Haqqiniz qaldi.");
                  continue;
             }else {
                     System.out.println("Tapa bilmediniz. Uduzdunuz! Oyun bitdi.");
                     break;
                 }
             }
          
         }
             System.out.print("\n\nOyuna davam etmek ucun 1-e basin. Diger hallarda oyun bitir. \n Secim:");
             int secim=scanner.nextInt();
             scanner.nextLine();
             if(secim==1){
                 System.out.print("\nOyun yeniden basladilir");
                  for(int i=1;i<=3;i++){
          Thread.sleep(1000);
               System.out.print(".");
              
       }
                   continue;
             }else{
                 
                 System.out.println("Oynadiginiz ucun tesekkurler "+o.getName()+"! ");
                 System.out.print("\nOyun baglanilir");
                  for(int i=1;i<=3;i++){
          Thread.sleep(1000);
               System.out.print(".");
       }
                 System.out.println("Oyun bitdi.");
                 return;
                 
             }
         
         
         }
    
    
    }
    
}
