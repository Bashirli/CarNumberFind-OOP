
import java.util.Scanner;


public class Oyuncu {
    private String name;
    private int age;
    private String nomre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNomre() {
        return nomre;
    }

    public void setNomre(String nomre) {
        this.nomre = nomre;
    }

    public int Oyuncu() throws InterruptedException {
        Scanner scanner=new Scanner(System.in);
        String mesaj="//////////////////////////////////////////////"
                + "\nOyuna baslamadan once oyuncunu yaratmaq lazimdir.\n"
                + "DIQQET! Oyuncunun yasi 13+ olmalidir.\n////////////////////////////////////////////////\n";
        System.out.println(mesaj);
        Thread.sleep(1000);
        System.out.print("\n Adinizi qeyd edin:");
        String ad=scanner.nextLine();
        setName(ad);
        System.out.println("\nYasinizi qeyd edin:");
        int yas=scanner.nextInt();
        if(yas<13){
            System.out.println("Oyunu oynamaga yasiniz catmir.");
            return 1;
        }
        setAge(yas);
        System.out.print("Oyuncu yaradilir");
       for(int i=1;i<=3;i++){
          Thread.sleep(1000);
               System.out.print(".");
           
       }
        
        System.out.println("\n Oyuncu yaradildi.");
        System.out.print("\n\n\n\n Oyun ekrani acilir");
       for(int i=1;i<=3;i++){
          Thread.sleep(1000);
               System.out.print(".");
           
       }
        
        return 0;
    }
    
    
    
    
    
}
