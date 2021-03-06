package pkg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddBL
 */
@WebServlet("/AddBL")
public class AddBL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddBL() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//変数の宣言.jspから受け取る
		String name = request.getParameter("name");
		String address = request.getParameter("name");
		String tel = request.getParameter("name");
		String errmsg = "";

		//定数の宣言
		final String  ERRMSG_NAME01="名前は全角20文字以内で入力してください";
		final String  ERRMSG_NAME02="名前は必須項目です";
		final String  ERRMSG_ADDRESS01="住所は全角40文字以内で入力してください";
		final String ERRMSG_ADDRESS02="住所は必須項目です住所は必須項目です";
		final String ERRMSG_TEL01="電話番号は「000-0000-0000」の形式で入力してください";

		if(40 < name.getBytes().length) {
			errmsg=ERRMSG_NAME01 +  "<BR>";
		}else if (name.getBytes().length==0) {
			errmsg=ERRMSG_NAME02 + "<BR>";
		}else if (80 < address.getBytes().length) {
			errmsg=ERRMSG_ADDRESS01 + "<BR>";
		}else if (address.getBytes().length==0) {
			errmsg=ERRMSG_ADDRESS02 + "<BR>";
		}else if (tel.getBytes().length > 0 &&!(tel.matches("{0-9]{3}-[0-9]{4}-[0-9]{4}")));
			errmsg=ERRMSG_TEL01 + "<BR>" ;

        //リクエスト情報を作成
		request.setAttribute("name",name);
		request.setAttribute("address",address);
		request.setAttribute("tel",tel);
		request.setAttribute("errmsg",errmsg);

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
