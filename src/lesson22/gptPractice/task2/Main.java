package lesson22.gptPractice.task2;

public class Main {

    static void check(String testName, String expected, String actual) {
        if (expected == null && actual == null) {
            System.out.println(testName + " OK");
        } else if (expected != null && expected.equals(actual)) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + "FAIL. Expected: " + expected + ". Actual: " + actual);
        }
    }

    public static void main(String[] args) {

        Person person = new Person("Jack", 25, null, "+49726682497");

        check("Test 0 email is null: ", null, person.getEmail());

        person.setEmail("new@trst.com");
        check("Test 1 valid email: ", "new@trst.com", person.getEmail());

        person.setEmail("");
        check("Test 2 empty string: ", "new@trst.com", person.getEmail());

        person.setEmail(null);
        check("Test 3 null: ", "new@trst.com", person.getEmail());

        person.setEmail(" ");
        check("Test 4 ", " ", person.getEmail());

    }
}
