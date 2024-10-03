package servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class app1
 */
@WebServlet("/app1")
public class app1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public app1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// TODO Auto-generated method stub

		Persone[] Persones = new Persone[3];
		
		Persones [0] = new Persone ("Moez", "Báccouche", "Satoripop", "Route de Sfax, Borjine", "Sousse");
		Persones [1] = new Persone( "Anas","Ismail", "JadProd", "Hammen Sousse", "Sousse");
		Persones [2] = new Persone("Fira",	"Hami la","RobotX", "M'saken", "Sousse");
		request. setAttribute ("persons", Persones);
		java.util.Date today = new java.util.Date();
		HttpSession session = request.getSession();
		session. setAttribute ("user", Persones[0]);
		request. setAttribute("today", today) ;
		request. setAttribute ("methode", request.getMethod()) ;
		request.setAttribute ("ressource", request. getRequestURI ()) ; request.setAttribute("protocole", request. getProtocol ()) ;
		request. setAttribute("nomSv", request. getServerName ()) ;
		request. setAttribute ("partsv", request. getServerPort());;
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/application1.jsp" ).forward( request, response ); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
