package ashu.help.letshelp.com.letshelp.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import ashu.help.letshelp.com.letshelp.Activities.AuthActivity;
import ashu.help.letshelp.com.letshelp.Admin.AdminPanel;
import ashu.help.letshelp.com.letshelp.R;

public class Choose_Act extends AppCompatActivity {
   ImageView image;

    Button user,admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_option);




    }
    public void submit(View v)
    {
        switch(v.getId())
        {
            case R.id.admin:Intent al=new Intent(this,AdminPanel.class);
                startActivity(al);
                finish();
                break;
            case R.id.user12:Intent ar=new Intent(this,AuthActivity.class);
                startActivity(ar);
                finish();
                break;
        }
    }


}
