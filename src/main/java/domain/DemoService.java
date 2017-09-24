package domain;

/**
 * Created by huangzhenwei on 2017/09/24.
 */
public class DemoService {
    private  int id;
    private  String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DemoService{" +
                "name='" + name + '\'' +
                '}';
    }
}
