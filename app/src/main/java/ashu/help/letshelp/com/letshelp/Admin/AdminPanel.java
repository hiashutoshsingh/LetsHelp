package ashu.help.letshelp.com.letshelp.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ashu.help.letshelp.com.letshelp.R;

public class AdminPanel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_panel_layout);
    }
    public void submit(View v)
    {
        switch(v.getId())
        {
            case R.id.admin_login:Intent al=new Intent(this,AdminLogin.class);
                                  startActivity(al);
                                  finish();
                break;
            case R.id.admin_register:Intent ar=new Intent(this,AdminRegister.class);
                                     startActivity(ar);
                                     finish();
                break;
        }
    }
}
