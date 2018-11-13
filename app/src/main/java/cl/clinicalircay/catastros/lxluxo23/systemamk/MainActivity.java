package cl.clinicalircay.catastros.lxluxo23.systemamk;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.*;
import java.math.BigInteger;
import java.net.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static android.app.PendingIntent.getActivity;


public class MainActivity extends AppCompatActivity {

     private EditText user, pass;
    private Button btConectar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        user = (EditText) findViewById(R.id.usuario);
        pass = (EditText) findViewById(R.id.contra);
        btConectar = (Button) findViewById(R.id.btn_login);


    }
    public void mostrar (View view){

    }

public void lanzar (View view){



    Connection connection = null;
    String ConnectionURL, servidor, db, usuario, password;

    servidor = "192.168.1.77";
    db="ICR_TL";
    usuario="sysmk";
    password="qT1OVkF7";
    try {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        ConnectionURL = "jdbc:jtds:sqlserver://"+servidor+";databaseName="+db+";user="+usuario+";password="+password+";";
        connection = DriverManager.getConnection(ConnectionURL);

        Toast.makeText(this, "funciono???",
                Toast.LENGTH_LONG).show();





    } catch (SQLException se) {
        Log.e("bug", se.getMessage());
    } catch (ClassNotFoundException e) {
        Log.e("bug", e.getMessage());
    } catch (Exception e) {
        Log.e("bug", e.getMessage());
    }

}

}

