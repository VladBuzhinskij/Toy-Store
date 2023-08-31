import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.Queue;

public class QueuPriz {
    Queue<Toy> queue = new LinkedList<>();
    /**Конструктор очереди призов */
    public QueuPriz(Queue<Toy> queue) {
        this.queue = queue;
    }
    /** */
    public void addPriz(Toy toy) {
        this.queue.add(toy);
    }
    /** */
    public Toy getpriz() {
        return this.queue.remove();
    }
    /**Чтение файла выданных иргушек */
    public String readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String everything = "";
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } finally {
            br.close();
        }
        return everything;
    }
    /**Запись в файл выданнфх игрушек */
    public void writeFile(String text) throws IOException {
        Writer writer = null;
        text=readFile()+text;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("file.txt"), "utf-8"));
            writer.write(text);
        } catch (IOException ex) {
            System.out.println("Ошибка:"+ex);
        } finally {
            writer.close();
           
        }
    }
    /**Получение размера очереди */
    public int getSize(){
        return this.queue.size();

    }

}
