import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PersonBuildingTest {
    @Test
    public void testBuildPerson_ExceptionIfNoFieldsWereSet(){
        Assertions.assertThrows(
                IllegalStateException.class,
                () -> new PersonBuilder().build());
    }

    @Test
    public void testBuildPerson_ExceptionIfOnlyNameWasSet(){
        Assertions.assertThrows(
                IllegalStateException.class,
                () -> new PersonBuilder().setName("asdf").build());
    }

    @Test
    public void testBuildPerson_ExceptionIfOnlySurnameWasSet(){
        Assertions.assertThrows(
                IllegalStateException.class,
                () -> new PersonBuilder().setSurname("qwer").build());
    }

    @Test
    public void testBuildPerson_ExceptionIfEmptyNameWasSet(){
        Assertions.assertThrows(
                IllegalStateException.class,
                () -> new PersonBuilder().setSurname("qwer").setName("").build());
    }

    @Test
    public void testBuildPerson_ExceptionIfEmptySurameWasSet(){
        Assertions.assertThrows(
                IllegalStateException.class,
                () -> new PersonBuilder().setSurname("").setName("asdf").build());
    }

    @Test
    public void testBuildPerson_ExceptionIfSetNegativeAge(){
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new PersonBuilder().setAge(-5).build());
    }

    @Test
    public void testBuildPerson_ExceptionIfLargeAge(){
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new PersonBuilder().setAge(1234).build());
    }
}
