package sample;

import java.util.HashMap;

public class Passwords
{
    public HashMap<Integer, Password> getPasswords()
    {
        return passwords;
    }

    private HashMap<Integer, Password> passwords;

    public Passwords()
    {
        passwords = new HashMap<>();
    }

    /**
     *
     * @param password - New user password
     * @return true if password succesfully added
     */
    public boolean addPassword(String password)
    {
        // todo Check if password is valid (Password.isValid)

        // todo create new Password

        // todo make all previous passwords inactive

        // todo add to current list


        return true;
    }

    public boolean checkPassword(String password)
    {
        //todo check if this password equals to active

        return true;
    }
}
