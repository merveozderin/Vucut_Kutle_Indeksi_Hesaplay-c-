import java.util.Scanner;

public class Vucut_kutle_indeksi
{
    public static void main(String[] args)
    {
        float vucut_kutle_indeksi;
        Scanner input_value = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz: ");
        float boy_value = input_value.nextFloat();

        System.out.println("Lütfen kilonuzu sadece kilogram olarak giriniz: ");
        int kilo_value = input_value.nextInt();

        vucut_kutle_indeksi = kilo_value / (boy_value*boy_value);

        System.out.println("Vücut-kütle indeksiniz: " +vucut_kutle_indeksi);

        String sonuc = vucut_kutle_indeksi < 25 ? "Normal kilodasınız!"  : "Fazla kilolusunuz!" ;
        System.out.println(sonuc);

    }
}
