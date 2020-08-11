package sg.edu.rp.c346.id19004781.demomywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etURL;
    Button btnLoadURL;
    WebView wvMyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etURL = findViewById(R.id.URL);
        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);

        wvMyPage.setWebViewClient(new WebViewClient());
        wvMyPage.getSettings().setJavaScriptEnabled(true);
        wvMyPage.getSettings().setAllowFileAccess(false);
        wvMyPage.getSettings().setBuiltInZoomControls(true);

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String url = "https://www.grab.com/sg/";
                String URL = etURL.getText().toString();
                wvMyPage.loadUrl(URL);
            }
        });
    }
}
