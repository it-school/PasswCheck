package sample;

public class ErrorsInfo
{
    public static String getMessage(int code)
    {
        switch (code)
        {
            case 0 :
                return "No error";
            case 1 :
                return "Password length must be at least " + Contants.PASSWORD_LENGTH + " chars";

            default:
                return "Unnknown error";

        }

    }
}
