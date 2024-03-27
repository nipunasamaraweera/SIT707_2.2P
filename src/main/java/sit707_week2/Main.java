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
        SeleniumOperations.alternative_registration_page("https://www.amazon.com.au/ap/register?showRememberMe=true&openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com.au%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&prevRID=W7WM53JCYJJPAGFR34X5&openid.assoc_handle=auflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&pageId=auflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");;
        
    }
}
