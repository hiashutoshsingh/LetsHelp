package ashu.help.letshelp.com.letshelp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import ashu.help.letshelp.com.letshelp.Fragments.Choose_Act;


public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(new Intent(this,Choose_Act.class));
        finish();


    }
}
