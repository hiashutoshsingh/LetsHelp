package ashu.help.letshelp.com.letshelp.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import com.paytm.pgsdk.PaytmClientCertificate;
import com.paytm.pgsdk.PaytmMerchant;
import com.paytm.pgsdk.PaytmOrder;
import com.paytm.pgsdk.PaytmPGService;
import com.paytm.pgsdk.PaytmPaymentTransactionCallback;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import ashu.help.letshelp.com.letshelp.R;

public class Payment extends Activity
{
    private int randomInt = 0;
    private PaytmPGService Service = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("LOG", "onCreate of MainActivity");
        getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_payment);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

    }

    @Override
    protected void onStart(){
        super.onStart();
        initOrderId();
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }

    private void initOrderId() {
        Random r = new Random(System.currentTimeMillis());
        String orderId = "ORDER" + (1 + r.nextInt(2)) * 10000 + r.nextInt(10000);
        EditText orderIdEditText = (EditText) findViewById(R.id.order_id);
        orderIdEditText.setText(orderId);
    }


    public void onStartTransaction(View view) {
        Service = PaytmPGService.getProductionService();



        PaytmMerchant Merchant = new PaytmMerchant("<checksum_signing_url>", "<checksum_validation_url>");


        Map<String, String> paramMap = new HashMap<String, String>();



        paramMap.put( "MID" , "PAYTM_MERCHANT_ID");
        paramMap.put( "ORDER_ID" , "ORDER0000000001");
        paramMap.put( "CUST_ID" , "10000988111");
        paramMap.put( "INDUSTRY_TYPE_ID" , "PAYTM_INDUSTRY_TYPE_ID");
        paramMap.put( "CHANNEL_ID" , "WAP");
        paramMap.put( "TXN_AMOUNT" , "1");
        paramMap.put( "WEBSITE" , "PAYTM_WEBSITE");
        paramMap.put( "CALLBACK_URL" , "https://securegw.paytm.in/theia/paytmCallback?ORDER_ID=ORDER0000000001");
        paramMap.put( "EMAIL" , "abc@gmail.com");
        paramMap.put( "MOBILE_NO" , "9999999999");
        paramMap.put( "CHECKSUMHASH" , "w2QDRMgp1/BNdEnJEAPCIOmNgQvsi+BhpqijfM9KvFfRiPmGSt3Ddzw+oTaGCLneJwxFFq5mqTMwJXdQE2EzK4px2xruDqKZjHupz9yXev4=");

        PaytmClientCertificate Certificate = new PaytmClientCertificate("password", "filename");

        PaytmOrder Order = new PaytmOrder(paramMap);


        Service.initialize(Order, Certificate);


        Service.startPaymentTransaction(this, false, true, new PaytmPaymentTransactionCallback() {

//            @Override
//            public void onTransactionSuccess(Bundle bundle) {
//
//
//                Log.i("Success", "onTransactionSuccess :" + bundle);
//            }
//
//            @Override
//            public void onTransactionFailure(String s, Bundle bundle) {
//                Log.i("Failure", "onTransactionFailure " + s);
//            }

            @Override
            public void onTransactionResponse(Bundle bundle) {

            }

            @Override
            public void networkNotAvailable() {
                Log.i("Failure", "networkNotAvailable");
            }

            @Override
            public void clientAuthenticationFailed(String s) {
                Log.i("Failure", "clientAuthenticationFailed " + s);
            }

            @Override
            public void someUIErrorOccurred(String s) {
                Log.i("Failure", "someUIErrorOccurred " + s);
            }

            @Override
            public void onErrorLoadingWebPage(int i, String s, String s1) {
                Log.i("Failure", "onErrorLoadingWebPage" + s + " " + s1);
            }

            @Override
            public void onBackPressedCancelTransaction() {

            }

            @Override
            public void onTransactionCancel(String s, Bundle bundle) {
                Log.d("LOG", "Payment Transaction Failed " + bundle);
                Toast.makeText(getBaseContext(), "Payment Transaction Failed ", Toast.LENGTH_LONG).show();
            }
        });
}


}