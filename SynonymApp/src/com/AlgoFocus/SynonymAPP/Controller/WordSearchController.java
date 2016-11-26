package com.AlgoFocus.SynonymAPP.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class WordSearchController extends HttpServlet
{
	
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	
	 
	 PrintWriter output=resp.getWriter();
	 resp.setContentType("text/html");
	 
	 String word=req.getParameter("word");
	 
	 String synonyms=req.getParameter("synonym");
	 String post_content=req.getParameter("post_content");
	 System.out.println("word--------->"+word);
	 
	 
	 com.AlgoFocus.SynonymAPP.DAO.copy.SynonymDAO synonym=com.AlgoFocus.SynonymAPP.DAO.copy.DAOFactory.getDAOInstance();
	 com.AlgoFocus.SynonymAPP.DAO.copy.SynonymJavaBean result=synonym.wordSearch(word);
	 

	 
	 if(result != null)
	 {   
		 output.print("Word Exists.Successfully Fetched its Synonyms");
		
		 output.print("<table border=1>");
		 output.print("<tr>");
		 output.print("<th>Synonym</th>");
		 output.print("<th>Post Content</th>");
		 
		 
		 output.print("</tr>");
		 output.print("<tr>");
		 
		 output.print("<td>"+result.getSynonyms()+"</td>");
		 output.print("<td>"+result.getPost_content()+"</td>");
		 
		 output.print("</tr>");
		 output.print("</table>"); 
	 }
	 else
	 {
		 output.print("<h1>Given Word is Not Exist in this application please Enter</h1>");
		 req.getRequestDispatcher("View/WordSynonymInsertion.jsp").include(req, resp);
		 
		 
	 }
}

}
