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
        if (Password.isValid(password) != 0)
            return false;

        // todo create new Password
        Password password1 = new Password(password);

        // todo Check if exists such password
        for (int i = 0; i < passwords.size(); i++)
            if (passwords.get(i).getPassword().equals(password))
                return false;

        // todo make all previous passwords inactive
        for (int i = 0; i < passwords.size(); i++)
            passwords.get(i).setActive(false);

        // todo add to current list
        passwords.put(0, password1);

        return true;
    }

    public boolean checkPassword(String password)
    {
        //todo check if this password equals to active

        return true;
    }
}
