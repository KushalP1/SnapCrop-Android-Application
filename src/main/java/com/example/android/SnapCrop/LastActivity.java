package com.example.android.SnapCrop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


import com.example.android.camera2basic.R;

import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class LastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        Bundle buu=getIntent().getExtras();
        String result=buu.getString("res");
        TextView textView = (TextView) findViewById(R.id.text);

        textView.setText(result);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //URL url = new URL("http://192.168.43.131:8090/getjson");
                    //HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    //conn.setRequestMethod("GET");
                    //conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                    //conn.setRequestProperty("Accept", "application/json");
                    //conn.setDoOutput(true);
                    //conn.setDoInput(true);
                    //TextView textView = (TextView) findViewById(R.id.text);

                    //JSONObject jsonParam = new JSONObject();
                    //jsonParam.put("timestamp", 1488);
                    //jsonParam.put("uname", message.getUser());
                    //jsonParam.put("message", message.getMessage());
                    //jsonParam.put("latitude", 0D);
                    //jsonParam.put("longitude", 0D);
                    //InputStream in = new BufferedInputStream(conn.getInputStream());
                    //String response = convertStreamToString(in);
                    //Log.i("JSON", jsonParam.toString());

                    //os.writeBytes(URLEncoder.encode(jsonParam.toString(), "UTF-8"));
                    //os.writeBytes(jsonParam.toString());
                    //String fileOut=null;



                    //textView.setText(fileOut);
                    //textView.setText(response);
                    //os.flush();
                    //os.close();

                    //Log.i("STATUS", String.valueOf(conn.getResponseCode()));
                    //Log.i("MSG" , conn.getResponseMessage());

                    //conn.disconnect();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();




    }

    private String convertStreamToString(InputStream is) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();

        String line;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line).append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sb.toString();
    }
    public void goback(View view)
    { Intent iii=new Intent(this,MainActivity.class);
        startActivity(iii);
    }
}
