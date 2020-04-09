package DLVS.web.user;

import DLVS.model.User;
import org.springframework.stereotype.Controller;

import static DLVS.web.SecurityUtil.authUserId;
@Controller
public class ProfileRestController extends AbstractUserController {

    public User get() {
        return super.get(authUserId());
    }

    public void delete() {
        super.delete(authUserId());
    }

    public void update(User user) {
        super.update(user, authUserId());
    }
}
