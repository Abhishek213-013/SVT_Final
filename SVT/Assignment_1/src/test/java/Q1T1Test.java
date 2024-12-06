import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Q1T1Test {
    private Q1T1 q1T1;

    @BeforeAll
    static void setUpAll() {
        System.out.println("Hello");
    }

    @BeforeEach
    void setUpEach(){
        System.out.println("Get Set Go");
        q1T1 = new Q1T1();
    }


    @AfterEach
    void tearDown() {
        System.out.println("Finish");
        q1T1 = null;
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("Good Bye");
    }


    @Test
    void add() {
        int result = q1T1.add(5,3);
        assertEquals(8,result);
    }


    @Test
    void reverse() {
        String reversed = q1T1.reverse("hello");
        assertEquals("olleh",reversed);
    }
}