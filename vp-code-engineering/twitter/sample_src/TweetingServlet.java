import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.google.gson.*;

@WebServlet("/statuses/update")
public class TweetingServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Gson gson = new GsonBuilder().create();
    ServletInputStream inputStream = req.getInputStream();
    InputStreamReader reader = new InputStreamReader(inputStream);
    TweetRequest tweetRequest;
    try {
      tweetRequest = gson.fromJson(reader, TweetRequest.class);
    } finally {
      reader.close();
    }

    Tweet tweet = perform(tweetRequest);

    String json = gson.toJson(tweet);
    resp.setContentType("application/json; charset=utf-8");
    ServletOutputStream lOutputStream = resp.getOutputStream();
    try {
      lOutputStream.write(json.getBytes("UTF-8"));
    } finally {
      lOutputStream.close();
    }
  }

  private Tweet perform(TweetRequest tweetRequest) {
    throw new RuntimeException("Not implemented");
  }
}