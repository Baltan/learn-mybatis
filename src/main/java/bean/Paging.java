package bean;

/**
 * Description:
 *
 * @author Baltan
 * @date 2020-03-18 17:33
 */
public class Paging {
    private int id;

    public Paging() {
    }

    public Paging(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Paging{" +
                "id=" + id +
                '}';
    }
}
