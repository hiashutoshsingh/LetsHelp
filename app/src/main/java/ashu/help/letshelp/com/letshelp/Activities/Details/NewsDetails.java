package ashu.help.letshelp.com.letshelp.Activities.Details;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import ashu.help.letshelp.com.letshelp.R;
public class NewsDetails extends AppCompatActivity {

    TextView newsdetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final String money_details = getIntent().getExtras().getString("newsdetails");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_news);
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


        newsdetails=(TextView)findViewById(R.id.newsdetails);
        newsdetails.setText(money_details);
    }
}
