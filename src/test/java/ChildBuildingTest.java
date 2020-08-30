import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class ChildBuildingTest {
    @Test
    public void test_newChildBuilder_ChildHasSameSurname() throws Exception {
        Person pers = new PersonBuilder().setName("asd").setSurname("qwe").build();
        Person child = pers.newChildBuilder().setName("zcx").build();

        Assertions.assertEquals("qwe", child.getSurname());
    }
}
