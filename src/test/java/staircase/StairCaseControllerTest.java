package staircase;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import staircase.controllers.StairCaseController;
import staircase.model.Staircase;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = StairCaseController.class)
public class StairCaseControllerTest {

    @Autowired
    StairCaseController controller;


    @Test
    public void should_return_staircase_model()  {
        // when
        final Staircase staircase = controller.get_number_of_ways(1);

        // then
        Assert.assertEquals(staircase.getHeight(), 1);
        Assert.assertEquals(staircase.getNumberOfPaths(), 1);


    }


}
