/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("esto es una prueba" + "<br>");
            String nombre = request.getParameter("Nombre");
            String apellidoP = request.getParameter("Apellido Paterno");
            String apellidoM = request.getParameter("Apellido Materno");
            String correo = request.getParameter("Correo");
            String fecha = request.getParameter("Fecha Nacimiento");
            String direccion = request.getParameter("Direccion");
            String contrasena1 = request.getParameter("Contraseña");
            String contrasena2 = request.getParameter("Contraseña");
            int telefono = Integer.parseInt(request.getParameter("Telefono"));
            int rut = Integer.parseInt(request.getParameter("Rut"));
            int dig = Integer.parseInt(request.getParameter("DIG"));
            if (nombre.length() > 0) {
                out.println(nombre);
            } else {
                out.println("nombre no ingresado" + "<br>");
            }
            if (apellidoP.length() > 0) {
                out.println(apellidoP);
            } else {
                out.println("apellido paterno no ingresado" + "<br>");
            }
            if (apellidoM.length() > 0) {
                out.println(apellidoM);
            } else {
                out.println("apellido materno no ingresado" + "<br>");
            }
            if (correo.length() > 0) {
                out.println(correo);
            } else {
                out.println("correo no ingresado" + "<br>");
            }
            if (direccion.length() > 0) {
                out.println(direccion);
            } else {
                out.println("direccion no ingresada" + "<br>");
            }
            if (contrasena1.length() > 0) {
                out.println(contrasena1);
            } else {
                out.println("contraseña no ingresada" + "<br>");
            }
            if (contrasena2.length() > 0) {
                out.println(contrasena2);
            } else {
                out.println("contraseña no ingresada" + "<br>");
            }
            

            out.println("Nombre: " + nombre + "<br>");
            out.println("Apellido Paterno: " + apellidoP + "<br>");
            out.println("Apellido Materno: " + apellidoM + "<br>");
            out.println("Correo: " + correo + "<br>");
            out.println("Fecha Nacimiento: " + fecha + "<br>");
            out.println("Direccion " + direccion + "<br>");
            out.println("Contraseña: " + contrasena1 + "<br>");
            out.println("Contraseña: " + contrasena2 + "<br>");
            out.println("Telefono: " + telefono + "<br>");
            out.println("Rut: " + rut + "<br>");
            out.println("DIG " + dig + "<br>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
