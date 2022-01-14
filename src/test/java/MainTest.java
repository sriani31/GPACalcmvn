import org.junit.Test;
import org.mockito.Mockito;

import java.util.Scanner;

import static org.mockito.Mockito.when;

public class MainTest {

    @Test
    public void main() {
        Scanner mockScanner = Mockito.mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("1");
        when(mockScanner.nextLine()).thenReturn("A");


    }
}