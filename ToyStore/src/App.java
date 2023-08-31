import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
public class App {
    public static void main(String[] args) throws Exception {
        



        Toy Toy1=new Toy(1, "Робот", 3, 20);
        Toy Toy2=new Toy(2, "Робот2", 3, 30);
        Toy Toy3=new Toy(3, "Робот3", 3, 60); // Создание игрушек
        
        List <Toy> ListPrizzes1=new ArrayList<Toy>();
       
        ListPrizzes1.add(Toy1);
        ListPrizzes1.add(Toy2);
        ListPrizzes1.add(Toy3);
        
        ListPrizzess LPq = new ListPrizzess(ListPrizzes1); //Создание склада игрушек
        int IDT=0;
        LPq.editFreq(1, 10);
        Queue <Toy> QueuePrizzes1=new LinkedList<Toy>(); 
        QueuPriz que1=new QueuPriz(QueuePrizzes1);//Создание очереди розыгрыша
        Toy priz;
        for (int i=0; i<10; i++){
            Toy resToy;
            resToy=LPq.getToy(); // Получение игрушки со склада в соответствии с весом
            IDT=resToy.getId();
            LPq.removed(IDT); //Удаление игрушки со склада
            que1.addPriz(resToy); //Добавление игрушки в очередь выдачи
        }
        
        for (int i=0;i<que1.getSize();i=i){
            priz=que1.getpriz(); //Выдача игрушки
            que1.writeFile(priz.toString()); //запись в файл выданной игрушки
           
        }
        // priz=que1.getpriz();
        // que1.writeFile(priz.toString());
        System.out.println(LPq);

    }
}
