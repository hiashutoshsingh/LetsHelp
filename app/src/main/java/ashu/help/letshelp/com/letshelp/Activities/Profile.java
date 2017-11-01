package ashu.help.letshelp.com.letshelp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import ashu.help.letshelp.com.letshelp.R;

public class Profile extends AppCompatActivity {

    private TextView name,gender,emailid,phoneno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name=(TextView)findViewById(R.id.profile_name);
        gender=(TextView)findViewById(R.id.profile_gender);
        emailid=(TextView)findViewById(R.id.profile_email);
        phoneno=(TextView)findViewById(R.id.profile_Number);
    }
}
