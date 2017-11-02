package ashu.help.letshelp.com.letshelp.Adapters.Adapter.MoneyAdapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ashu.help.letshelp.com.letshelp.Activities.Details.MoneyDetails;
import ashu.help.letshelp.com.letshelp.R;


class MoneyHolder extends RecyclerView.ViewHolder {

    private TextView skillName;
    private ImageView skillImage;
    Context context;

    public MoneyHolder(final View itemView) {
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
                    Intent newActivity = new Intent(context, MoneyDetails.class);
                    newActivity.putExtra("moneydetails", s);
                    context.startActivity(newActivity);

                }
                if (getAdapterPosition()==1)
                {
                    String s=String.valueOf(skillName.getText());
                    Intent newActivity = new Intent(context, MoneyDetails.class);
                    newActivity.putExtra("moneydetails", s);
                    context.startActivity(newActivity);
                }
                if (getAdapterPosition()==2)
                {
                    String s=String.valueOf(skillName.getText());
                    Intent newActivity = new Intent(context, MoneyDetails.class);
                    newActivity.putExtra("moneydetails", s);
                    context.startActivity(newActivity);

                }if (getAdapterPosition()==3)
                {
                    String s=String.valueOf(skillName.getText());
                    Intent newActivity = new Intent(context, MoneyDetails.class);
                    newActivity.putExtra("moneydetails", s);
                    context.startActivity(newActivity);

                }if (getAdapterPosition()==4)
                {
                    String s=String.valueOf(skillName.getText());
                    Intent newActivity = new Intent(context, MoneyDetails.class);
                    newActivity.putExtra("moneydetails", s);
                    context.startActivity(newActivity);
                }
                if (getAdapterPosition()==5)
                {
                    String s=String.valueOf(skillName.getText());
                    Intent newActivity = new Intent(context, MoneyDetails.class);
                    newActivity.putExtra("moneydetails", s);
                    context.startActivity(newActivity);
                }



            }
        });

    }

    public void bindData(MoneyUtil moneyUtil)
    {
        skillName.setText(moneyUtil.name_of_skill);
        skillImage.setImageResource(moneyUtil.image_of_skill);
    }
}
