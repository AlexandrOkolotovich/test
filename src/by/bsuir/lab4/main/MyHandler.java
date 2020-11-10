package by.bsuir.lab4.main;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import static by.bsuir.lab4.main.Main.arr;

public class MyHandler extends DefaultHandler {
    private String name;
    private String country;
    private String address;
    private String services;
    private String session;
    private String price;
    private String lastElementName;
    private String val;

    private static MyHandler instance;

    private MyHandler(){}

    public static MyHandler getInstance(){

        if(instance == null){               //если объект еще не создан
            instance = new MyHandler();     //создать новый объект
        }
        return instance;                    // вернуть ранее созданный объект
    }

    @Override
    public void startElement(String u, String m, String n, Attributes a) {
        lastElementName = n;

        if(n.equals("price")){
            val = a.getValue("name");
        }
    }

    @Override
    public void characters(char[] ch, int start, int length)  {
        String information = new String(ch, start, length);


        information = information.replace("\n", "").trim();
        if (!information.isEmpty()) {
            if (lastElementName.equals("name"))
                name = information;
            if (lastElementName.equals("country"))
                country = information;
            if(lastElementName.equals("address"))
                address= information;
            if(lastElementName.equals("services"))
                services = information;
            if(lastElementName.equals("session"))
                session = information;
            if(lastElementName.equals("price"))
                price = information;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if ( (name != null && !name.isEmpty()) && (address != null && !address.isEmpty()) && (services!= null && !services.isEmpty())
                && (session != null && !session.isEmpty())
                && (price != null && !price.isEmpty())) {
            arr.add(new Salon(name, country, address, services, session, price, val));
            name = address = services = address = session = price = val = null;
        }
    }

}
