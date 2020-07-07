package pkg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListBL
 */
@WebServlet("/ListBL")
public class ListBL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListBL() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		Connection connect = null; //DB接続用変数
		PreparedStatement ps = null; //DB接続用変数
		ResultSet rs = null; //DB接続用変数
		int listCnt = 0; //総件数
		String CntQuery = null; //件数取得用クエリ
		String nowPage = request.getParameter("page"); //現在のページ
		String SerchName = request.getParameter("Serchname"); //検索用文字列

		int nowPage2 = Integer.parseInt(nowPage); //検索開始件数
		int limitSta=(nowPage2-1) *10;
		request.setCharacterEncoding("utf-8"); //文字コードをUTF-8に設定

			try {
				Class.forName("com.mysql.cj.jdbc.Driver"); //データベースに接続
				connect = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/nomo?characterEncoding=UTF-8&serverTimezone=JST","root","");

				request.setAttribute("listCnt", listCnt); //一覧画面へリクエストを設定
				request.setAttribute("Result",rs);
				request.setAttribute("page",nowPage);


		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}