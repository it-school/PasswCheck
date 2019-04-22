package sample;

public class Encryptor
{
    public static String CaesarEncrypt(String text, int key)
    {
        String result = "";

        for (int i = 0; i < text.length(); i++)
        {
            result += (char) ((int) text.charAt(i) + key);
        }

        return result;
    }

    public static String CaesarDecrypt(String text, int key)
    {
        return CaesarEncrypt(text, -key);
    }
}