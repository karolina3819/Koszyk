import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testowanie {
    @Test
   public void czyWybranyProduktJestDpstepny(){
        Koszyk tmp;
        tmp.mapa.put(new Produkt ("ser",2)3);
        tmp.mapa.put(new Produkt ("pomidor",5)2);
        Program obiekt = new Program();
      Assertions.assertEquals(2,obiekt.ilosc());

    }
    @Test
    public void czyProduktZosalPoprawnieDodanyDoKoszyka(){
        Koszyk tmp;
      tmp.mapa.put(new Produkt ("ser",2)3);
      tmp.mapa.put(new Produkt ("pomidor",5)2);
      Assertions.assertArrayEquals("16",map.toString());
    }

}

