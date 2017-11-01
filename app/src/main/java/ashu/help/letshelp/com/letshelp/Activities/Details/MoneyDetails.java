package ashu.help.letshelp.com.letshelp.Activities.Details;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import letshelp.letshelpngo.com.letshelp.Activity.Payment;
import letshelp.letshelpngo.com.letshelp.R;

public class MoneyDetails extends AppCompatActivity {

    private Button continue_payment;
    TextView moneydetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      
    }
}
