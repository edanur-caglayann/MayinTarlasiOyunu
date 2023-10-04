import java.util.Random;
import java.util.Scanner;

public class Minefield {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin satır sayısını girin");
        int satir = scanner.nextInt();
        System.out.println("Dizinin sütun sayısını girin");
        int sutun = scanner.nextInt();

    }
    /*

        Mayın Tarlası Oyunu

        Java dilinde Mayın Tarlası oyunu.

        Oyun Kuralları :

        Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
        Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul
        sağlanmazsa tekrar nokta istenmeli.
        Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
        Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı,
        sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının
        toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
        Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.
     */


}

class MineSweeper{
    int satir;
    int sutun;
    String[][] MayinTarlasi;
    String[][] OyunTarlasi;
    int mayin;
    int r;
    int c;
    int sayım;
    boolean isTrue = true;

    public MineSweeper(int satir,int sutun){
    this.satir=satir;
    this.sutun=sutun;
    this.OyunTarlasi=new String[satir][sutun];
    this.MayinTarlasi=new String[satir][sutun];
    this.mayin=(satir*sutun)/4; //Yerleştirilen mayın sayısı
    }

    public void setMayinTarlasi(){
        for (int i = 0; i <satir; i++) {
            for (int j = 0; j <sutun; j++) {
                MayinTarlasi[i][j]="-";
                OyunTarlasi[i][j]="-";
            }
        }
    }

    public void randomSayi(){
        Random random = new Random();
        for (int i = 0; i <this.mayin; i++) {
            int randonNum1 = random.nextInt(this.satir);
            int randonNum2 = random.nextInt(this.sutun);

            if (!this.MayinTarlasi[randonNum1][randonNum2].equals("*")){
                this.MayinTarlasi[randonNum1][2]="*";
            }
        }
    }
    public void printMineMap() {
        //  System.out.println("Mayinlarin Konumu");
        randomSayi();
        for (int i = 0; i < this.satir; i++) {
            for (int j = 0; j < this.sutun; j++) {
                if (!this.MayinTarlasi[i][j].equals("*")) {
                    this.MayinTarlasi[i][j] = "-";
                }
                // System.out.print(this.MineMap[i][j] + " ");
            }
            // System.out.println();
        }
        // System.out.println("==================================");
        // System.out.println("Mayin Tarlasi Oyununa Hosgeliniz !");
    }
}


