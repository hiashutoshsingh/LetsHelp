package ashu.help.letshelp.com.letshelp.Adapters.Adapters.Event;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ashu.help.letshelp.com.letshelp.R;


class EventDetailHolder extends RecyclerView.ViewHolder {

    private TextView skillName;
    private ImageView skillImage;
    Context context;

    public EventDetailHolder(final View itemView) {
        super(itemView);
        context=itemView.getContext();

        skillImage=(ImageView)itemView.findViewById(R.id.imageView_article);
        skillName=(TextView) itemView.findViewById(R.id.textView_aboutArticle);

    }

    public void bindData(EventHolder eventHolder)
    {
        skillName.setText(eventHolder.name_of_skill);
        skillImage.setImageResource(eventHolder.image_of_skill);
    }
}
