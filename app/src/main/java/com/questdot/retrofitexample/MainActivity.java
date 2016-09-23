package com.questdot.retrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView txtID;
    private TextView txtName;
    private TextView txtPrice;
    private TextView txtTag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtID = (TextView) findViewById(R.id.txtID);
        txtName = (TextView) findViewById(R.id.txtName);
        txtPrice = (TextView) findViewById(R.id.txtPrice);
        txtTag = (TextView) findViewById(R.id.txtTag);



        getDoor();
    }

    private void getDoor(){

        Call<DoorResponse> call =  GetDoorAPI.getDoorAPI.postRawJson();

        //asynchronous call
        call.enqueue(new Callback<DoorResponse>() {

            @Override
            public void onResponse(Call<DoorResponse> call, Response<DoorResponse> response) {
                int code = response.code();

                DoorResponse doorResponse = response.body();

                if (code == 200) {

                    txtID.setText(doorResponse.getId().toString());
                    txtName.setText(doorResponse.getName().toString());
                    txtPrice.setText(doorResponse.getPrice().toString());

                    txtTag.setText(doorResponse.getTags().get(0).toString()+ doorResponse.getTags().get(1).toString());



                    Toast.makeText(getApplicationContext(), "Work : " + response.message(), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Did not work: "+code, Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<DoorResponse> call, Throwable t) {


            }
        });
    }
}
