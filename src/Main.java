import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void ukol1() {
        System.out.println("Hello world!"); // chyběly uvozovky textu, který se má vytisknout, a na konci středník
    }
    public static void ukol2() {
        String uzivatel = "Karel"; // při iniciaci proměnné typu string se hodnota zadává v uvozovkách, které chyběly
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10; // proměnná pocetLecki byla deklarována jako řetězec String, takže hodnota by měla být iniciována v uvozovkách , ale vzhledem k názvu proměnné a tedy i jejímu významu, je lépe použít proměnou typu int, tedy celé číslo
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0; // desetinné číslo se zapisuje pomocí desetinné tečky, nikoli čárky
        System.out.println(cena);
    }

    public static void ukol5() {
        double cena = 0;
        int koeficient = 10;
        for (int i = 0; i < 10; i++) {
            cena += 0.1*koeficient; // asi by se mělo řešit přes BigDecimal, to se ale objevuje poprvé až v následující metodě, jako řešení mi přijde přírůstek násobit koeficientem a výsledek pak koeficientem dělit
        }
        System.out.println(cena/koeficient);

    }

    public static void ukol6() { // pro použití BigDecimal je potřeba naimportovat "knihovnu"  java.math.BigDecimal, což se provedlo "samo" po nápovědě Alt+Shift+Enter
        BigDecimal cena = BigDecimal.valueOf(0); // iniciace proměnné typu BigDecimal se provádí jiným zápisem, než pouze = a hodnota (opět napovědělo prostředí a provedlo samo po Alt+Shift+Enter
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() {
        int vykonMotoru = 120; // proměnná typu int se iniciuje přiřazením celého čísla bez uvozovek
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " + velikostKosile + "."); // při "skládání" textu složeného z textu v uvozovkách doplněných o výpis hodnoty proměnných se používá znak "+", nikoli čárka
    }

    public static void ukol9() { // zde chybělo slovo "static", což nevím k čemu tady je, ale když je všude jinde, tady neuškodí :)
        System.out.println("Metoda *skoro* bez chybičky!");
    }


    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                +"zkratkou <Ctrl>+</> - použij lomítko "
                +"na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();

        String jmenoPrijmeni = "Karel Čtvrtý";
        int rok = 1316;
        int mesic = 5;
        int den = 14;
        LocalDate narozeniProdejce = LocalDate.of(rok,mesic,den);
        int pocetSmluv = 123;
        double prodanaMrkevVTunach = 321;
        String mestoKdeSidli = "Karlštejn";
        String spz = "AAA 1122"; // jinak teď neumím
        double spotrebaNaSto = 7.5;
        String ipAdresa = "185.181.176.19."; // InetAddress neumím použít

        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu je: "+ prodanaMrkevVTunach/pocetSmluv+ " tuny." );

    }
}