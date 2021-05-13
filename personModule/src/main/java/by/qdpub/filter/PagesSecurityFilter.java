package by.qdpub.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "profiler",
        urlPatterns = {"*.jsp", "/springdata"}
)
public class PagesSecurityFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {


        HttpServletResponse resp = (HttpServletResponse) response;
        HttpServletRequest req = (HttpServletRequest) request;

        HttpSession reqSession = req.getSession();
        Object userRole = reqSession.getAttribute("login");

        if (userRole != null) {
            String stringRole = userRole.toString();
            if (!(stringRole.equals("admin") || stringRole.equals("user"))) {
                req.getRequestDispatcher("authorization.jsp").forward(req, resp);
                return;
            }
        } else {
            req.getRequestDispatcher("authorization.jsp").forward(req, resp);
            return;
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
