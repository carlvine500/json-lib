import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * Created by tingfeng on 2018/1/23.
 */
public class JsonTest {
    public static void main(String[] args) {
        JsonConfig jsonConfig = new JsonConfig();
        Student s = new Student();
        s.setId(1);
        s.setName("x");
        s.setEmail("abc@abc.com");
        s.setAddress("china");
        JSONObject jsonObject = JSONObject.fromObject(s, jsonConfig);
        System.out.println(jsonObject);
    }

    public static class Student {
        private int id;
        private String name;
        private String email;
        private String address;

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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        //setter、getter
        public String toString() {
            return this.name + "#" + this.id + "#" + this.address + "#" + this.email;
        }
    }
}
