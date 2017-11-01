package ashu.help.letshelp.com.letshelp.Activities.Details;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ashu.help.letshelp.com.letshelp.R;


public class MoneyDetails extends AppCompatActivity {

    private Button continue_payment;
    TextView moneydetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_details);
//
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        final String money_details = getIntent().getExtras().getString("moneydetails");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_money);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "www.playstore.com/letshelp/appid=123sde45  \n"+ money_details);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });

        continue_payment=(Button)findViewById(R.id.continue_payment);
        continue_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//            startActivity(new Intent(MoneyDetails.this, Payment.class));

            }
        });



        moneydetails=(TextView)findViewById(R.id.money_details);
        moneydetails.setText(money_details);


    }
}
