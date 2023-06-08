import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-06 20:31
 */
@SpringBootTest(classes = testConn.class)
@EnableAutoConfiguration
public class testConn {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    public void test(){
        String sql = "INSERT INTO USER VALUES \n" +
                "(1,'你好','ti','田','ming','123456',1,'2023-06-06 16:20:19','2023-06-06 16:20:19','2023-06-06 16:20:19')";
        int update = jdbcTemplate.update(sql);
        if (update!=0){
            System.out.println("插入成功");
        } else{
            System.out.println("插入失败");
        }
    }
}
