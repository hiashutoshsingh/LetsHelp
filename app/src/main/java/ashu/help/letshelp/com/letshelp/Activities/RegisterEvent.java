package ashu.help.letshelp.com.letshelp.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import ashu.help.letshelp.com.letshelp.R;

public class RegisterEvent extends AppCompatActivity {
    private EditText name,e_mail,age;
    private RadioButton male,female;
    private Button submit;
    private TextView header,gender;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.registeration_event);

webView=(WebView)findViewById(R.id.webview_register);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("http://www.devpost.com");
    }
}
