package ashu.help.letshelp.com.letshelp.Adapters.Adapter.MoneyAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ashu.help.letshelp.com.letshelp.R;
import letshelp.letshelpngo.com.letshelp.R;

public class MoneyAdapter extends RecyclerView.Adapter<MoneyHolder> {

    private List<MoneyUtil> moneyUtilList;

    public MoneyAdapter()
    {
        moneyUtilList =new ArrayList<>();
        moneyUtilList.add(new MoneyUtil("Chiramytri Seva Samithi is a social service group for advising and guiding Senior Citizens who are in search of suitable Old Age Home ( Senior Citizen Home ) depending on their affordability (free or paid). Our service is free of cost. \n" +
                "\n" +
                "Chiramytri visited a number of Old Age Homes (Senior Citizen Homes) in and around Hyderabad, Telangana and Andhra Pradesh. Based on these visits along with the interactions with the inmates, their children and members of Management, compilation of data of these Old Age Homes was done to guide people looking out for this information",R.drawable.donation_e));
        moneyUtilList.add(new MoneyUtil("To help senior citizen Old Age Home Our mission is to show love, care and affection to your parents/elders . Clean & Hygienic Facilities",R.drawable.donation_a));
        moneyUtilList.add(new MoneyUtil("A caring home and an education is the only thing that can break the cycle of abject poverty. Love Care Center is healing hearts and changing lives in a huge way",R.drawable.donation_b));
        moneyUtilList.add(new MoneyUtil("The Jay Anand Anaathashram, is an orphanage house run by the Jay Kalika Mata Education Trust.\n" +
                "\n" +
                "After a written complaint by the girls, a child welfare committee team visited the orphanage and found that they were being molested. All the girls were sent to the Nashik Civil Hospital for a medical check-up, the police said.\n" +
                "\n" +
                "Names of arrested orphanage employees were Bhausaheb Thorat, Santosh Thorat, Jagannath Bhalerao and Haresh Patil.\n" +
                "\n" +
                "The district women child development officer Dilip Hivrale has also lodged a complaint of sexual harassment of girls in the ashram after the city's Maharashtra Navnirman Sena (MNS) women wing gheraoed social welfare officers on Monday demanding action against the orphanage staff.",R.drawable.donation_c));
        moneyUtilList.add(new MoneyUtil("Over the next 30 days we encourage you to help and support this initiative in creating a green pocket of 100 Fruit Trees in the Delhi NCR.\n" +
                "\n" +
                "One ticket/pass for the event entitles you to sponsor and plant a sapling of either Papaya, Mango, Banana, Sweet Lime, Silver Oak and Neem Trees on the premises.\n" +
                "\n" +
                "Your tree will be geo-tagged and imaged on our website where you can ascertain their location on online mapping technology (Google Earth) and receive updates on your trees growth. You will receive all the links to your tree, map and page within 4-6 weeks.\n" +
                "\n" +
                "The produce obtained from this tree will aid in the upkeep and support of the residents of Deepashram while providing them a more cleaner, healthier and beautiful environment to be a part of.",R.drawable.donation_d));



    }

    @Override
    public MoneyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View view=inflater.inflate(R.layout.abc_article_layout,parent,false);
        View view =inflater.inflate(R.layout.abc_article_layout,parent,false);
        return new MoneyHolder(view);



    }

    @Override
    public void onBindViewHolder(MoneyHolder holder, int position) {

        MoneyUtil moneyUtil = moneyUtilList.get(position);
        holder.bindData(moneyUtil);
    }

    @Override
    public int getItemCount() {
        return moneyUtilList.size();
    }
}
