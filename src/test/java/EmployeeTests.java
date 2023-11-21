import org.example.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTests {
    @Test
    public void testConstructorSetName(){
        var emplyee = new Employee();
        var expected = "Adam";
        var actual = emplyee.getName();
        assertEquals(expected,actual);
    }
@Test
    public void testGetSound(){
    var emplyee = new Employee();
    var expeted = "Aaow!";
    var actual = emplyee.getSound();

    assertEquals(expeted,actual);
}
}
