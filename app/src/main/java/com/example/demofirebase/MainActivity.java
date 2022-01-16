package com.example.demofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

EditText t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void process(View view) {
        t1 = (EditText)findViewById(R.id.roll);
        t2 = (EditText)findViewById(R.id.name);
        t3 = (EditText)findViewById(R.id.course);
        t4 = (EditText)findViewById(R.id.duration);

        String Roll = t1.getText().toString().trim();
        String Name = t2.getText().toString().trim();
        String Course = t3.getText().toString().trim();
        String Duration = t4.getText().toString().trim();

        dataholder obj = new dataholder(Name,Course,Duration);
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference node = db.getReference("students");

        node.child(Roll).setValue(obj);

        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");

        Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_SHORT).show();


    }
}