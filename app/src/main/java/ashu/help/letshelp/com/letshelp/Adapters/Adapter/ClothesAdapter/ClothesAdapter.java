package ashu.help.letshelp.com.letshelp.Adapters.Adapter.ClothesAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ashu.help.letshelp.com.letshelp.R;

public class ClothesAdapter extends RecyclerView.Adapter<ClothesHolder> {

    private List<ClothesUtil> clothesUtilList;

    public ClothesAdapter()
    {
        clothesUtilList =new ArrayList<>();
        clothesUtilList.add(new ClothesUtil("Event Details Cloths Donating Campaign by Never give Up\n" +
                "donate old and new cloths for the needy..\n" +
                "Join us to serve others ",R.drawable.cloths_a));
        clothesUtilList.add(new ClothesUtil("This year with more effort and with more people . Donate at least one blanket , one set of cloths , and a sanitary kit. Our volunteer will collect it from you .God bestowed us with life but at the same time he bestowed few of us with means to survive this life. share those means. life in the city , in the winter, is about survival and endurance , food is scavenged, newspapers are carefully rescued from garbage dumps and discarded clothes are treasured . @idetermine is consistently trying to reach out more and more people every year.\n" +
                "\n" +
                "Come forward and support the cause . ",R.drawable.cloths_b));
        clothesUtilList.add(new ClothesUtil("This time we go for FASHION !!!\n" +
                "How many times have you opened your closet and said I HAVE NOTHING TO WEAR !!!! To old, too big,too small, too...whatever Well on are next event bring all those clothes you do dont need, you dont like and you will have a chance to swap them or redo. ",R.drawable.cloths_c));
        clothesUtilList.add(new ClothesUtil("1.) We will be collecting NEW coats or Money for new coats, gloves, hats and warm socks throughout the month of October and the day of the drive.\n" +
                "\n" +
                "2.) Coat sizes should be youth all ages boys and girls. We are also accepting new gloves and hats should be age appropriate also.\n" +
                "\n" +
                "3.) We will take any money collected and walk into Wal-Mart at the end of our collection time on Saturday October 28th and purchase all the coats possible in those size ranges not recieved.\n" +
                "\n" +
                "4.) Fire District #1 Of Johnson County and Southwest Johnson County CERT will deliver the coats to the School Board for distribution to the grade schools on the week of October 30th.\n" +
                "\n" +
                "You can drop new coats, gloves, hats or money off before the event at the main Johnson County Fire District #1 Station\n",R.drawable.cloths_d));


    }

    @Override
    public ClothesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View view=inflater.inflate(R.layout.abc_article_layout,parent,false);
        View view=inflater.inflate(R.layout.abc_article_layout,parent,false);
        return new ClothesHolder(view);

    }

    @Override
    public void onBindViewHolder(ClothesHolder clothesHolder, int position) {

        ClothesUtil clothesUtil = clothesUtilList.get(position);
        clothesHolder.bindData(clothesUtil);
    }

    @Override
    public int getItemCount() {
        return clothesUtilList.size();
    }
}
