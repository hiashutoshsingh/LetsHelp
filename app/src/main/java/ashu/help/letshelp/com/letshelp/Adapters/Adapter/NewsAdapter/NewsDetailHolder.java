package ashu.help.letshelp.com.letshelp.Adapters.Adapter.NewsAdapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ashu.help.letshelp.com.letshelp.Activities.Details.NewsDetails;
import ashu.help.letshelp.com.letshelp.R;


class NewsDetailHolder extends RecyclerView.ViewHolder {

    private TextView skillName;
    private ImageView skillImage;
    Context context;

    public NewsDetailHolder(final View itemView) {
        super(itemView);
        context=itemView.getContext();

        skillImage=(ImageView)itemView.findViewById(R.id.imageView_article);
        skillName=(TextView) itemView.findViewById(R.id.textView_aboutArticle);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getAdapterPosition()==0)
                {
                    String s=String.valueOf(skillName.getText());
                    Intent newActivity = new Intent(context, NewsDetails.class);
                    newActivity.putExtra("newsdetails", s);
                    context.startActivity(newActivity);

                }
                if (getAdapterPosition()==1)
                {
                    String s=String.valueOf(skillName.getText());
                    Intent newActivity = new Intent(context, NewsDetails.class);
                    newActivity.putExtra("newsdetails", s);
                    context.startActivity(newActivity);
                }
                if (getAdapterPosition()==2)
                {
                    String s=String.valueOf(skillName.getText());
                    Intent newActivity = new Intent(context, NewsDetails.class);
                    newActivity.putExtra("newsdetails", s);
                    context.startActivity(newActivity);
                }if (getAdapterPosition()==3)
                {
                    String s=String.valueOf(skillName.getText());
                    Intent newActivity = new Intent(context, NewsDetails.class);
                    newActivity.putExtra("newsdetails", s);
                    context.startActivity(newActivity);
                }if (getAdapterPosition()==4)
                {
                    String s=String.valueOf(skillName.getText());
                    Intent newActivity = new Intent(context, NewsDetails.class);
                    newActivity.putExtra("newsdetails", s);
                    context.startActivity(newActivity);
                }
                if (getAdapterPosition()==5)
                {
                    String s=String.valueOf(skillName.getText());
                    Intent newActivity = new Intent(context, NewsDetails.class);
                    newActivity.putExtra("newsdetails", s);
                    context.startActivity(newActivity);
                }



            }
        });
    }

    public void bindData(NewsHolder newsHolder)
    {
        skillName.setText(newsHolder.name_of_skill);
        skillImage.setImageResource(newsHolder.image_of_skill);
    }
}
