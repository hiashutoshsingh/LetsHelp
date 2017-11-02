package ashu.help.letshelp.com.letshelp.Activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ashu.help.letshelp.com.letshelp.R;

import static android.content.ContentValues.TAG;

public class RequestPickUpClothes extends AppCompatActivity {

    private EditText name,phone,address;
    private Button button;
AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_cloth_donation);

        name=(EditText)findViewById(R.id.request_cloth_name);
        phone=(EditText)findViewById(R.id.request_cloth_phone);
        address=(EditText)findViewById(R.id.request_cloth_address);
        button=(Button)findViewById(R.id.btn_request);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Request();
            }
        });

    }

    public void Request() {
        Log.d(TAG, "Request");

        if (!validate()) {
            onRequestFailed();
            return;
        }

        button.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(RequestPickUpClothes.this,
                R.style.AppTheme_AppBarOverlay);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Requesting...");
        progressDialog.show();



        String string_name = name.getText().toString();
        String string_phone = phone.getText().toString();
        String string_address = address.getText().toString();

        // TODO: Implement your own authentication logic here.

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onLoginSuccess or onLoginFailed
                        onLoginSuccess();
                        // onLoginFailed();
                        progressDialog.dismiss();
                    }
                }, 3000);
    }






    public void onLoginSuccess() {
        button.setEnabled(true);

//        alertDialog = new AlertDialog.Builder(this).create();
//
//        alertDialog.setTitle("Request Submitted");
//
//
//        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
//
//            public void onClick(DialogInterface dialog, int id) {
//
//                startActivity(new Intent(RequestPickUpClothes.this,Home.class));
//
//            } });


        Toast.makeText(RequestPickUpClothes.this, "Request Submitted", Toast.LENGTH_LONG).show();

                startActivity(new Intent(RequestPickUpClothes.this,Home.class));


    }

    public void onRequestFailed() {
        Toast.makeText(RequestPickUpClothes.this, "Request failed", Toast.LENGTH_LONG).show();

        button.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;

        String string_name = name.getText().toString();
        String string_phone = phone.getText().toString();
        String string_address = address.getText().toString();

        if (string_name.isEmpty() ) {
            name.setError("enter a valid name");
            valid = false;
        } else {
            name.setError(null);
        }

        if (string_phone.isEmpty()  ) {
            phone.setError("enter valid phone no.");
            valid = false;
        } else {
            phone.setError(null);
        }

        if (string_address.isEmpty() ) {
            address.setError("enter valid address");
            valid = false;
        } else {
            address.setError(null);
        }

        return valid;
    }

}
