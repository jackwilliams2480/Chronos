import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;

public class MapQuestRequest {

    private static final String API_KEY = "AIzaSyD5J__Lx2_qXeImeaJ7n3c0w5k17Xw-8S0";

    OkHttpClient client = new OkHttpClient();

    public String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static void main(String[] args) throws IOException {
        GoogleMatrixRequest request = new GoogleMatrixRequest();
        String url_request = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=Vancouver+BC%7CSeattle&destinations=San+Francisco%7CVictoria+BC&mode=bicycling&language=fr-FR&key=" + API_KEY;

        String response = request.run(url_request);
        System.out.println(response);
    }

}
