import com.wywhdgg.dzb.emtity.Person;
import com.wywhdgg.dzb.emtity.User;

/***
 *@author lenovo
 *@date 2019/7/9 7:33
 *@Description:
 *@version 1.0
 */
public class TestEntity {
    public static void main(String[] args) {
//        Map<String,Object> map= HashMap.SimpleEntry<String,Object>;
        User user= new User.Builder().name("张三").sex("男").build();
        Person person = new Person.Builder().name("StephenHe").age(20).sex(true).build();
    }

}
