package ashu.help.letshelp.com.letshelp.Activities.Details;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ashu.help.letshelp.com.letshelp.Activities.RequestPickUpClothes;
import ashu.help.letshelp.com.letshelp.R;


public class ClothesDetails extends AppCompatActivity {

    TextView clothdetails;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes_details);
//
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        final String money_details = getIntent().getExtras().getString("clothdetails");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_cloth);
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


        clothdetails=(TextView)findViewById(R.id.clothdetails);
        clothdetails.setText(money_details);

        button=(Button)findViewById(R.id.clothregister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClothesDetails.this, RequestPickUpClothes.class));
                finish();
            }
        });
    }
}
