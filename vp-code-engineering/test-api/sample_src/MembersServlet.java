import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.google.gson.*;

@WebServlet("/members")
public class MembersServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Gson gson = new GsonBuilder().create();
    ServletInputStream inputStream = req.getInputStream();
    InputStreamReader reader = new InputStreamReader(inputStream);
    Member member;
    try {
      member = gson.fromJson(reader, Member.class);
    } finally {
      reader.close();
    }

    perform(member);
  }

  private void perform(Member member) {
    throw new RuntimeException("Not implemented");
  }
}