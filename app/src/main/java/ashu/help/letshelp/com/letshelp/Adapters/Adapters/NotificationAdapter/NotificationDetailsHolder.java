package ashu.help.letshelp.com.letshelp.Adapters.Adapters.NotificationAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ashu.help.letshelp.com.letshelp.R;


class NotificationDetailsHolder extends RecyclerView.ViewHolder {

    private TextView skillName;

    Context context;

    public NotificationDetailsHolder(final View itemView) {
        super(itemView);
        context=itemView.getContext();


        skillName=(TextView)itemView.findViewById(R.id.textView_aboutArticle);

    }

    public void bindData(NotificationHolder notificationHolder)
    {
        skillName.setText(notificationHolder.name_of_skill);
    }
}
