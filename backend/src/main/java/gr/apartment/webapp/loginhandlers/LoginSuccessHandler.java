//package gr.apartment.webapp.loginhandlers;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Collection;
//
//@Component
//public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
//
//    private static final String USER_HOME_PAGE_URL = "/user";
//    private static final String ADMIN_HOME_PAGE_URL = "/admin";
//    private static final String HOST_HOME_PAGE_URL = "/host";
//
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
//
//        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
//        String redirectUrl = USER_HOME_PAGE_URL;
//        for (GrantedAuthority grantedAuthority: authorities) {
//            if (grantedAuthority.getAuthority().equals("ADMIN")) {
//                redirectUrl = ADMIN_HOME_PAGE_URL;
//            } else if (grantedAuthority.getAuthority().equals("HOST")){
//                redirectUrl = HOST_HOME_PAGE_URL;
//            }
//        }
//        getRedirectStrategy().sendRedirect(request, response, redirectUrl);
//    }
//}
