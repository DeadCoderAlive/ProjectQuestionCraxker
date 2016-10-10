import org.junit.Assert;
import org.junit.Test;

/**
 * Created by srinivaz on 10/9/16.
 */
public class QuestionCrackerTester {
    @Test
    public void removeDuplicatesTester() {
        QuestionCrackerMain questionCrackerMain = new QuestionCrackerMain();
        char[] str = {'a','b','d','a'};
        QuestionCrackerMain.removeDuplicates(str);
    }

    @Test
    public void anagramTester() {
        QuestionCrackerMain questionCrackerMain = new QuestionCrackerMain();
        Assert.assertTrue(questionCrackerMain.findAnagramOrNot("madam","madam"));

    }


}
