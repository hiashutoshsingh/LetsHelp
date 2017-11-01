package ashu.help.letshelp.com.letshelp.Adapters.NotificationAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ashu.help.letshelp.com.letshelp.R;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationDetailsHolder> {

    private List<NotificationHolder> notificationHolderList;

    public NotificationAdapter() {
        notificationHolderList = new ArrayList<>();
        notificationHolderList.add(new NotificationHolder("To mark Breast Cancer Awareness Month, Metro Hospital & Cancer Institute is organize Free Breast Cancer Awareness Week. Come be a part of the event and get yourself screened.\n" +
                "\n" +
                "Free Screening Camp\n" +
                "Consultation by Senior Oncologist\n" +
                "Mammography Screening\n" +
                "\n" +
                "Date: 25th October to 31st October, 2017\n" +
                "Time: 10 am to 5 pm\n" +
                "Venue: OPD, Metro Hospital & Cancer Institute, 21, Community Centre, Preet Vihar, New Delhi"));
        notificationHolderList.add(new NotificationHolder("India Electric Vehicle Summit is a national forum for electric vehicle manufactures, visionary automotive leaders as well as policy makers, innovators, researchers and strategists from India and around the world to bridge their collective strengths and exchange their information, innovation and knowledge. "));
        notificationHolderList.add(new NotificationHolder("With the blessings of Her Holiness Satguru Mata Savinder Hardev Ji Maharaj, the Sant Nirankari Charitable Foundation organized a blood donation camp at the Maharaja Agrasen Bhawan, Rajender Nagar, Ghaziabad (UP), on June 19, 2016, where 101 volunteers from the Sant Nirankari Mission donated their blood.\n" +
                "\n" +
                "The camp was inaugurated by the local BJP President Shri Sanjeev Sharma. Addressing the gathering, he said that the Mission was serving humanity through this noble contribution. He appreciated the spirit of devotion with which the donors participated.\n" +
                "\n" +
                "The blood collecting teams came from Guru Tegh Bahadur Hospital, Delhi and MMG Hospital, Ghaziabad. "));
        notificationHolderList.add(new NotificationHolder("Date: July 30, 2016\n" +
                "\n" +
                "Venue: Radisson Blu, Ghaziabad\n" +
                "\n" +
                "“Knowledge Sharing Seminar”, 30th July -2016, Ghaziabad\n" +
                "The theme of the Seminar is “Decorative Paints & Wood Coatings”. The Seminar is to be conducted at Hotel Radisson Blu, Ghaziabad.\n" +
                "IPCA, the Indian Paint & Coating Association is working in pace with time for a common cause of the members who are Paint & Allied Products Manufacturers and Sellers.\n" +
                "Seminar Website – http://www.ipcaonline.com/up-coming-events.html\n" +
                "Official Website – http://www.ipcaonline.com/"));
        notificationHolderList.add(new NotificationHolder("We realize that the world is changing it's trends from typewriter to keyboard and now from click to touch. Hence, we here at Software Incubator develop mobile as well as tablet apps. The apps we make are for Android, iOS and Windows Devices. Today in the market and even tomorrow, our apps never die."));

        notificationHolderList.add(new NotificationHolder("Line up: The Ska Vengers, Peter Cat Recording Co. & Moniker\n" +
                "Venue: Auro Kitchen & Bar\n" +
                "Date: Oct 26\n" +
                "Time: 9pm\n" +
                "\n" +
                "Wild City continues its series of fresh homegrown showcases with the first Delhi show from The Ska Vengers since thier mammoth UK tour this summer as well as Delhi's very own Peter Cat Recording Co."));
    }

    @Override
    public NotificationDetailsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.abc_notification,parent,false);
        return new NotificationDetailsHolder(view);

    }

    @Override
    public void onBindViewHolder(NotificationDetailsHolder holder, int position) {

        NotificationHolder notificationHolder = notificationHolderList.get(position);
        holder.bindData(notificationHolder);
    }

    @Override
    public int getItemCount() {
        return notificationHolderList.size();
    }
}
