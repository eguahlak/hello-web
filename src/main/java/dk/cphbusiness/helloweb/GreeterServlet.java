package dk.cphbusiness.helloweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GreeterServlet", urlPatterns = {"/Greeter"})
public class GreeterServlet extends HttpServlet {

  @Override
  protected void service(
      HttpServletRequest request,
      HttpServletResponse response
      ) throws ServletException, IOException {
    response.setContentType("text/html; charset=utf8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("  <head><title>Hello Web</title></head>");
    out.println("  <body>Hello World!</body>");
    out.println("</html>");
    }

  
  }
