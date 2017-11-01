package ashu.help.letshelp.com.letshelp.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import ashu.help.letshelp.com.letshelp.Fragments.Login;
import ashu.help.letshelp.com.letshelp.Fragments.Register;
import ashu.help.letshelp.com.letshelp.R;

public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Login login = new Login();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frameLayout_auth, login).commit();



        Register register = new Register();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frameLayout_auth, register).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
