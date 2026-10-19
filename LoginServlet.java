
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='kk'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Кіру нәтижесі</title>");
        out.println("</head>");
        out.println("<body style='font-family:Arial;text-align:center;margin-top:100px;'>");

        if ("admin".equals(username) && "12345".equals(password)) {
            out.println("<h1 style='color:green;'>Қош келдіңіз, admin!</h1>");
        } else {
            out.println("<h1 style='color:red;'>Логин немесе пароль қате</h1>");
        }

        out.println("<a href='index.html'>Кіру бетіне қайту</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
