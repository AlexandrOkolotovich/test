package by.bsuir.lab4.main;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    protected static ArrayList<Salon> arr = new ArrayList<>();
    private static ArrayList<Salon> copyArr = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factorySAX = SAXParserFactory.newInstance();
        SAXParser pars = factorySAX.newSAXParser();
        MyHandler m = MyHandler.getInstance();
        pars.parse(new File("resource/info.xml"), m);

        System.out.println(" ");

        for(Salon t : arr){
            System.out.println("SAX:\nНазвание: " + t.name +
                    "; Страна: " + t.country +
                    "; Адрес: " + t.address +
                    "; Сервисы: " + t.services +
                    "; Длительность: " + t.session +
                    "; Цена: " + t.price + " " +t.val);

            Salon copy = (Salon) t.copy();
            copyArr.add(copy);
        }

        for(Salon s : copyArr){
            System.out.println("Копия объекта:\nНазвание: " + s.name +
                    "; Страна: " + s.country +
                    "; Адрес: " + s.address +
                    "; Сервисы: " + s.services +
                    "; Длительность: " + s.session +
                    "; Цена: " + s.price + " " +s.val);

        }


    }
}
