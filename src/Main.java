import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        String client_id = "5429198";
        String redirect_uri = "https://vk.com/";
        URL url = new URL("https://oauth.vk.com/authorize?client_id="+client_id+"&redirect_uri="+redirect_uri+"&display=page&scope=messages&response_type=code&v=5.50");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine = null;
        while ((inputLine = in.readLine()) != null) {
            System.out.println("inputLine = "+inputLine );
        }
    }
    // https://oauth.vk.com/authorize?client_id=5429198&redirect_uri=https://vk.com/&display=page&scope=messages&response_type=code&v=5.50
    // https://api.vk.com/method/messages.get?count=1&access_token=f57548b7e74c93044041356b2cccb3dc6987454d0e784eb99af54e9d52b4b544250007a42e55afefd9072
}
