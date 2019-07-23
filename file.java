import java.io.*;

public class file{
public static void main(String[] args) throws Exception
{
    System.out.print("Realm (e.g. /): ");
    String orgName = (new BufferedReader(new InputStreamReader(System.in))).readLine();

    System.out.print("Login module name (e.g. DataStore or LDAP): ");
    String moduleName = (new BufferedReader(new InputStreamReader(System.in))).readLine();

    System.out.print("Login locale (e.g. en_US or fr_FR): ");
    String locale = (new BufferedReader(new InputStreamReader(System.in))).readLine();

    //Login login = new Login(moduleName, orgName, locale);
    //AuthContext lc = login.getAuthContext();
    //if (login.login(lc))
    //{
    //  login.logout(lc);
    //}
    //System.exit(0);
}}
