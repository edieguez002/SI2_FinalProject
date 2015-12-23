
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author txapasta
 */
public class UserSignUpView {

    private String username;
    private String password1;
    private String password2;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }
    
    public void signup(){
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        boolean signedUp = false;
        message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Done", username);
        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("signedUp", signedUp);
    
    }
    
}
