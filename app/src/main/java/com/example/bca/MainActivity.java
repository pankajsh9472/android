package com.example.bca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"hello dude ",Toast.LENGTH_SHORT).show();
    }
    void toast(String msg)
    {
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        toast("onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        toast("ondestroy");;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        toast("onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        toast("onStop");
    }


}
