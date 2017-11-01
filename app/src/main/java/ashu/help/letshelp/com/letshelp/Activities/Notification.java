package ashu.help.letshelp.com.letshelp.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import ashu.help.letshelp.com.letshelp.Adapters.Adapter.NotificationAdapter.NotificationAdapter;
import ashu.help.letshelp.com.letshelp.R;

public class Notification extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView_notification);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        NotificationAdapter newsDetailAdapter=new NotificationAdapter();
        recyclerView.setAdapter(newsDetailAdapter);
    }
}
