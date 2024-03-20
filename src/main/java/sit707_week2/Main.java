package sit707_week2;

/**
 * Hello world!
 * @author Nipuna Thathsara
 */
public class Main 
{
    public static void main( String[] args )
    {
        SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
        SeleniumOperations.alternative_registration_page("https://login.kfc.com.au/auth/realms/kau/login-actions/registration?client_id=regkauprd8il3ex6t41pwa&tab_id=aOnwPTF-ki4");;
        
    }
}
