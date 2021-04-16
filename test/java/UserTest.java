import org.junit.Assert;
import org.junit.Test;

public class UserTest {

        @Test
        public void givenFisrtName_WhenProper_shouldReturnTrue() {
            UserValidation user = new UserValidation();
            boolean result = user.checkFirstName("Ath@rva");
            Assert.assertTrue(result);
        }


        @Test
        public void givenLastName_WhenProper_shouldReturnTrue() {
            UserValidation user = new UserValidation();
            boolean result = user.checkLastName("Tathe");
            Assert.assertTrue(result);
        }

        @Test
        public void givenEmailID_WhenProper_shouldReturnTrue() {
            UserValidation user = new UserValidation();
            boolean result = user.checkEmailID("atharva55@gmail.com");
            Assert.assertTrue(result);
        }

        @Test
        public void givenPhoneNumber_WhenProper_shouldReturnTrue() {
            UserValidation user = new UserValidation();
            boolean result = user.checkPhoneNumber("91 9912991299");
            Assert.assertTrue(result);
        }

        public void givenPassword_WhenProper_shouldReturnTrue() {
            UserValidation user = new UserValidation();
            boolean result = user.checkPassword("Atharva&77");
            Assert.assertTrue(result);
        }
}


