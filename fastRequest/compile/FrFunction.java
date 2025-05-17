import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.UUID;

public class FrFunction {
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String CHAR_NUMBER = "0123456789";
    private static final String CHARS_SPECIAL = "!#$%&*()_+-=[]|,.?><";
    private static final String CHAR_NORMAL = CHAR_LOWER + CHAR_UPPER + CHAR_NUMBER;

    private static final SecureRandom RANDOM = new SecureRandom();
    private static final Faker FAKER = new Faker();
    /**
     * random an int
     */
    public int randomInt() {
        return RANDOM.nextInt(100);
    }

    /**
     * Random a boolean
     */
    public boolean randomBoolean() {
        return RANDOM.nextBoolean();
    }

    /**
     * Random a float
     */
    public float randomFloat() {
        return RANDOM.nextFloat();
    }

    /**
     * Random a char
     */
    public char randomChar() {
        return CHAR_LOWER.charAt(RANDOM.nextInt(26));
    }

    /**
     * Random a chinese char
     */
    public char randomChineseChar() {
        return (char) (0x4E00 + RANDOM.nextInt(0x9FFF - 0x4E00 + 1));
    }

    /**
     * Random a uuid
     */
    public String uuid() {
        return UUID.randomUUID().toString();
    }

    /**
     * Random 10-length string
     */
    public String randomString() {
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            int randomIndex = RANDOM.nextInt(CHAR_NORMAL.length());
            sb.append(CHAR_NORMAL.charAt(randomIndex));
        }
        return sb.toString();
    }

    /**
     * Get current date time
     */
    public String dateTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    /**
     * Get current date
     */
    public String date() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    /**
     * Get current time
     */
    public String time() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    /**
     * Get current time millis
     */
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    /**
     * Random an address
     */
    public String address() {
        return FAKER.address().fullAddress();
    }


    /**
     * Random a name
     */
    public String name() {
        return FAKER.name().name();
    }

    /**
     * Random an email
     */
    public String email() {
        return FAKER.internet().emailAddress();
    }

    /**
     * Random a phone
     */
    public String phone(){
        return FAKER.phoneNumber().cellPhone();
    }

    /**
     * Random a password
     */
    public String password(){
        return FAKER.internet().password();
    }

}
