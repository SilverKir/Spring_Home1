package ru.home;


public class App 
{
    public static void main( String[] args )
    {
    Serialize serialize = new Serialize();

    Person person = new Person("Иван", "Иванов", 20);
        System.out.println("Данные до сериализации: "+ person);
        serialize.serialObjJson(person, "person.json");
        Person deserializePerson = serialize.deSerialObjJson("person.json");
        System.out.println("Данные после сериализации: "+ deserializePerson);

    }
}
