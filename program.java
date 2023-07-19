/*Формат сдачи: ссылка на подписанный git-проект.

Задание

Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
В итоге должно получится select * from students where name=Ivanov, country=Russia, city=Moscow

*/

public class program {
	public static void main(String[] args) {
    StringBuilder builder = new StringBuilder("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
    
    String sname = builder.substring(builder.indexOf("name")+7, builder.indexOf("country")-4); 
    System.out.println(sname);

    String scountry = builder.substring(builder.indexOf("country")+10, builder.indexOf("city")-4); 
    System.out.println(scountry);

    String scity = builder.substring(builder.indexOf("city")+7, builder.indexOf("age")-4); 
    System.out.println(scity);

    String sage = builder.substring(builder.indexOf("age")+6, builder.length()-2); 
    System.out.println(sage);

    System.out.println("select * from students where name="+sname+ ", country="+scountry+", city="+ scity);



    }
}