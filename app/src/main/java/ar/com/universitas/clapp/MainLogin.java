package ar.com.universitas.clapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainLogin extends Activity{

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

       login = (Button)findViewById(R.id.login);

    }

    public void OnClicklogin (View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}
