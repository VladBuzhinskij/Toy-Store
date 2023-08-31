public class Toy {
    public int id;
    public String name;
    public int count;
    public int wt;

    /** Конструктор*/
    public Toy(int id, String name, int count, int wt) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.wt = wt;
    }
    /**Получение вероятности */
    public int getWt(){
        return wt;
    }
    /** получение ID*/
    public int getId(){
        return id;
    }
    /**Получение количества */
    public int getCount(){
        return count;
    }
    /**Изменени количества */
    public void setCount(int count){
        this.count=count;
    }

    /**Изменени вероятности */
    public void setWt (int Wt){
        this.wt=Wt;
    }

    @Override
    public String toString() {
        return "Toy [id=" + id + ", name=" + name + ", count=" + count + ", wt=" + wt + "]";
    }
}
