package ashu.help.letshelp.com.letshelp.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import ashu.help.letshelp.com.letshelp.R;

public class AdminLogin extends AppCompatActivity {


    private TextView reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

    }
    public void submit(View v)
    {
        switch(v.getId())
        {

            case R.id.loginbtn:
                Intent l = new Intent(this, AdminDashboard.class);
                startActivity(l);
                finish();
                break;

        }
    }
}
