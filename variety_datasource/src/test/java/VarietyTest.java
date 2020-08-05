import com.hand.SpringBootStart;
import com.hand.docker.dao.TestMapper;
import com.hand.stu.dao.StuMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootStart.class})
@Slf4j
public class VarietyTest {

    @Autowired
    private TestMapper testMapper;
    @Autowired
    private StuMapper stuMapper;

    @Test
    public void testDocker(){
        log.info(testMapper.findByAll(null).toString());
    }

    @Test
    public void testHand(){
        log.info(stuMapper.findByAll(null).toString());
    }

}
