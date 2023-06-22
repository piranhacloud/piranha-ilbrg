package cloud.piranha.smart.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * The default Servlet.
 * 
 * @author Manfred Riem (mriem@manorrock.com)
 */
@WebServlet(name = "DefaultServlet", urlPatterns = {"/*"})
public class DefaultServlet extends HttpServlet {

    /**
     * Processes the request.
     *
     * @param request the request
     * @param response the response
     * @throws ServletException when a Servlet error occurs
     * @throws IOException when an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println(" <title>Piranha Smart</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println(" No configuration found so you are seeing our default page");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the GET request.
     *
     * @param request the request
     * @param response the response
     * @throws ServletException when a Servlet error occurs
     * @throws IOException when an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        processRequest(request, response);
    }

    /**
     * Handles the POST request.
     *
     * @param request the request
     * @param response the response
     * @throws ServletException when a Servlet error occurs
     * @throws IOException when an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        processRequest(request, response);
    }

    /**
     * Returns the servlet information.
     *
     * @return the servlet information.
     */
    @Override
    public String getServletInfo() {
        return "The default servlet";
    }
}
