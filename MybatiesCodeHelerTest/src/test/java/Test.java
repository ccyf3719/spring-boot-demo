import com.SpringBootStart;
import com.dao.StuMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootStart.class})
@Slf4j
public class Test {

    @Autowired
    private StuMapper stuMapper;

    @org.junit.Test
    public void test(){
        log.info(stuMapper.findByAll(null).toString());
    }
}
