package com.example.se_project;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    // for reading one variable in database
    DatabaseReference reference_var;
    Boolean online;
    String id;
    int size = 0;

    // for reading a class in database
    DatabaseReference reference_class;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//**************************************************************************************************
//        reference_class = FirebaseDatabase.getInstance().getReference("Testing_data").child("451963786");
//        // Read from the database (a class)
//        reference_class.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                // This method is called once with the initial value and again
//                // whenever data at this location is updated.
//                Receiver r = dataSnapshot.getValue(Receiver.class);
//                setContentView(R.layout.activity_main);
//                TextView textView1;
//
//                textView1 = (TextView) findViewById(R.id.show_username);
//                textView1.setText(r.getUsername() + " ");
//            }
//
//            @Override
//            public void onCancelled(DatabaseError error) {
//                // Failed to read value
//            }
//        });
//**************************************************************************************************
//        reference_class = FirebaseDatabase.getInstance().getReference("Testing_data").child("695556329");
//        // Read from the database (only one variable)
//        reference_class.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                // This method is called once with the initial value and again
//                // whenever data at this location is updated.
//
//                if (dataSnapshot.hasChild("id")) {
//                    MainActivity.this.id = dataSnapshot.child("id").getValue(String.class);
//                    setContentView(R.layout.activity_main);
//                    TextView textView = (TextView) findViewById(R.id.show);
//                    if (id.length() == 0) {
//                        textView.setText("You don't have an ID");
//                    } else {
//                        textView.setText("You have an ID");
//                    }
//                }
//            }
//
//            @Override
//            public void onCancelled(DatabaseError error) {
//                // Failed to read value
//            }
//        });

        
//**************************************************************************************************
//        reference_class = FirebaseDatabase.getInstance().getReference("Testing_data").child("friends");
//        // Read from the database (only one variable)
//        reference_class.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                // This method is called once with the initial value and again
//                // whenever data at this location is updated.
//                setContentView(R.layout.activity_main);
//                TextView textView = (TextView) findViewById(R.id.show);
//                int size = 0;
//                String value = "";
//                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
//                    value = postSnapshot.getValue(String.class);
//                }
//                textView.setText(value);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError error) {
//                // Failed to read value
//            }
//        });


//**************************************************************************************************
//        reference_class = FirebaseDatabase.getInstance().getReference("Testing_data");
//        reference_class.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                // This method is called once with the initial value and again
//                // whenever data at this location is updated.
        // get the size of data
//                MainActivity.this.size = 0;
////                HashMap<Integer, String> hashMap = new HashMap<>();
//                if (dataSnapshot.hasChild("friends")) {
//                    for (DataSnapshot postSnapshot : dataSnapshot.child("friends").getChildren()) {
//                        size++;
//                    }
////                    hashMap.put(size, "testing");
////                    reference_class.setValue(hashMap);
//                    if (size < 10) {
//                        dataSnapshot.getRef().child("friends").child(Integer.toString(size)).setValue("testing for existing sheet");
//
//                        setContentView(R.layout.activity_main);
//                        TextView textView = (TextView) findViewById(R.id.show);
//                        textView.setText(Integer.toString(size));
//                    }
//                }
//                else {
////                    hashMap.put(size, "testing");
////                    reference_class.child("friends").setValue(hashMap);
//                    dataSnapshot.getRef().child("friends").child(Integer.toString(size)).setValue("testing for empty sheet");
//
//                    setContentView(R.layout.activity_main);
//                    TextView textView = (TextView) findViewById(R.id.show);
//                    textView.setText(Integer.toString(size));
//                }
//            }
//
//            @Override
//            public void onCancelled(DatabaseError error) {
//                // Failed to read value
//            }
//        });

//        reference_class.child("friends").child(Integer.toString(size)).setValue("testing for existing sheet");
//
//        setContentView(R.layout.activity_main);
//        TextView textView = (TextView) findViewById(R.id.show);
//        textView.setText(Integer.toString(size));

    }

}
