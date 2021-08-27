package first_homework.secondTask;

public class Test {
    public static void main(String[] args) {
        DoubleLinkList<Human> contactList = new DoubleLinkList<>();

        contactList.addNodeToEnd(new Human(123, "Васильев Евстахий Борисович", "+129381832"));
        contactList.addNodeToEnd(new Human(151, "Коновалов Степан Петрович", "+234432334"));
        contactList.addNodeToEnd(new Human(332, "Калинин Артём Валериевич", "+2234234423"));
        contactList.addNodeToEnd(new Human(432, "Предыбайло Григорий Анатолиевич", "+2342344234"));
        contactList.addNodeToEnd(new Human(556, "Степанов Мирослав Андреевич", "+6678877777"));

        System.out.println(contactList.iterator().next());
        System.out.println(contactList.iterator().next());
        System.out.println(contactList.iterator().next());
        System.out.println(contactList.iterator().prev());
        System.out.println(contactList.iterator().prev());
    }
}
