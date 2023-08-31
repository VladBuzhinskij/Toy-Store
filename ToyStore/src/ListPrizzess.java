
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListPrizzess implements Iterable<Toy> {
    private List<Toy> ListPrizzes;
    /** Конструктор склада*/
    public ListPrizzess(List<Toy> ListPrizzes) {
        this.ListPrizzes = ListPrizzes;
    }

    /** Получение со склада согласно вероятности */
    public Toy getToy() {
        int numb = new Random().nextInt(102) + 1;
        int mi = 0;
        int ma = 0;
        Toy res = new Toy(0, "Без  приза", 0, 0);
        if (this.ListPrizzes.size() > 0) {
            for (Toy item : this.ListPrizzes) {
                mi = ma;
                ma += item.getWt();
                if (numb > mi && numb <= ma) {
                    res = item;

                }

            }
        }
        System.out.println(res);
        return res;
    }

    public void add() {

    }

    /** уменьшение количества на складе */
    public void removed(int id) {
        if (id > 0) {
            if (!(this.ListPrizzes.isEmpty())) {
                // System.out.println(this.ListPrizzes);
                
                for (Toy item : this.ListPrizzes) {
                    if (item.getId() == id) {

                        if (item.getCount() > 1) {
                            int count = item.getCount();
                            item.setCount(count - 1);

                        } else {
                            this.ListPrizzes.remove(item);
                            break;
                        }
                    }

                }
            }
        }
    }

    /**Изменение веса */
    public void editFreq(int id, int newWt) {
        for (Toy item : this.ListPrizzes) {
            if (item.getId() == id) {
                item.setWt(newWt);}}
    }




    /** Итератор */
    @Override
    public Iterator<Toy> iterator() {
        return new Iterator<Toy>() {

            private int counter;

            @Override
            public boolean hasNext() {

                if (counter < ListPrizzes.size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Toy next() {
                return ListPrizzes.get(counter++);
            }

            @Override
            public void remove() {
                ListPrizzes.remove(counter);
            }

        };

    }

    @Override
    public String toString() {
        return "ListPrizzess [ListPrizzes=" + ListPrizzes + "]";
    }
}
