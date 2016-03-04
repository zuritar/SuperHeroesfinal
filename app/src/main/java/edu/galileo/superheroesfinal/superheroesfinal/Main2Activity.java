package edu.galileo.superheroesfinal.superheroesfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    ImageView imageView;
    TextView textView1,textView2;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView = (ImageView) findViewById(R.id.image2);
        textView1= (TextView) findViewById(R.id.textnombre2);
        textView2= (TextView)findViewById(R.id.textdescripcion2);
        boton = (Button)findViewById(R.id.boton2);
        boton.setOnClickListener(this);


        imageView.setImageResource(getIntent().getIntExtra("image_id",00));
        textView1.setText("Nombre :  " + getIntent().getStringExtra("nombre_id"));
        textView2.setText("Descripcion  : "+getIntent().getStringExtra("desc_id"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton2:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }

    }
}
