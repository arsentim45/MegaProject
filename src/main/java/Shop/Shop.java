package Shop;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

public interface Idelivery {
    public String send(String place);
}

public class Delivery implements Idelivery {
    private String place;

    public String send(String place){
        this.place = place;
        return this.place;
    }
}

public class Shop{
    private Idelivery Delivery;
    public Integer price_of_kaktus = 69;
    public Integer price_of_palm = 1999;
    public Integer main_price = 0;
    public Integer i = 0;
    public void sell(String flower1, Integer count1, String flower2, Integer count2, Integer money, String country ){
        List<String>flowers = new ArrayList<String>();
        for(i = 0, i< count1, i++){
            flowers.add(flower1);
        }
        for(i = 0, i < count2, i++){
            flowers.add(flower2);
        }
        if (money == setPayment(flowers)){
            Delivery.send(country);
        }
    }
    public Integer setPayment(List<String>list){
        for(i = 0, i < length(list), i++){
            if (list[i] == 'Kaktus') {
                main_price += price_of_kaktus;
            }
            else if (list[i] == 'Palm'){
                main_price += price_of_palm;
            }

        }
        return main_price;
    }
}
