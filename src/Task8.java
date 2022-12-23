//Создайте функцию, которая возвращает безопасный хеш SHA-256 для данной строки.
//Хеш должен быть отформатирован в виде шестнадцатеричной цифры.

import java.security.MessageDigest;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(getSha256Hash("password123"));//"ef92b778bafe771e89245b89ecbc08a44a4e166c06659911881f383d4473e94f"
        System.out.println(getSha256Hash("Fluffy@home"));//"dcc1ac3a7148a2d9f47b7dbe3d733040c335b2a3d8adc7984e0c483c5b2c1665"
        System.out.println(getSha256Hash("Hey dude!"));//"14f997f08b8ad032dcb274198684f995d34043f9da00acd904dc72836359ae0f"
    }

    public static String getSha256Hash(String s) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(s.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (int i : hash) {
                String hex = Integer.toHexString(0xff & i);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}