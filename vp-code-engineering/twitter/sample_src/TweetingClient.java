import java.io.*;
import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.methods.*;
import org.apache.http.entity.*;
import org.apache.http.impl.client.*;
import org.apache.http.util.*;

import com.google.gson.*;

public class TweetingClient {
  public static void main(String[] args) throws IOException {
    Gson gson = new GsonBuilder().create();
    String urlString = "https://api.twitter.com/1.1/statuses/update";
    CloseableHttpClient httpClient = HttpClients.createDefault();
    try {
      HttpPost httpMethod = new HttpPost(urlString);
      httpMethod.setHeader("Content-Type", "application/json");
      httpMethod.setHeader("charset", "utf-8");
      httpMethod.setEntity(new StringEntity(gson.toJson(createRequest())));
      ResponseHandler<Void> responseHandler = new ResponseHandler<Void>() {
        @Override
        public Void handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
          int status = response.getStatusLine().getStatusCode();
          HttpEntity entity = response.getEntity();
          String result = entity != null ? EntityUtils.toString(entity) : null;
          Tweet tweet = gson.fromJson(result, Tweet.class);
          // TODO process result
          return null;
        }
      };
      httpClient.execute(httpMethod, responseHandler);
    } finally {
      httpClient.close();
    }
  }

  private static TweetRequest createRequest() {
    TweetRequest tweetRequest = new TweetRequest();
    // TODO prepare request data

    return tweetRequest;
  }
}