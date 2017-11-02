package ashu.help.letshelp.com.letshelp.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ashu.help.letshelp.com.letshelp.R;

public class AdminRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_register);
    }
    public void submit(View v)
    {
        switch(v.getId())
        {
            case R.id.not_an_admin:
                Intent al = new Intent(this, AdminLogin.class);
                startActivity(al);
                finish();
                break;
            case R.id.loginbtn:
                Intent l = new Intent(this, AdminDashboard.class);
                startActivity(l);
                finish();
                break;

        }
    }
}
