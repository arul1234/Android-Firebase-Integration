

public class MainActivity extends AppCompatActivity {

DatabaseReference ref;

  protected void onCreate(Bundle savedInstanceState) {
  
   txt=(TextView)findViewById(R.id.txt);
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);
        txt3=(TextView)findViewById(R.id.txt3);
        txt4=(TextView)findViewById(R.id.txt4);
        txt5=(TextView)findViewById(R.id.txt5);

        ref = FirebaseDatabase.getInstance().getReference().child("main").child("title1");
        ref1 = FirebaseDatabase.getInstance().getReference().child("main").child("title2");
        ref2 = FirebaseDatabase.getInstance().getReference().child("main").child("title3");
        ref3 = FirebaseDatabase.getInstance().getReference().child("main").child("content1");
        ref4 = FirebaseDatabase.getInstance().getReference().child("main").child("content2");
        ref5 = FirebaseDatabase.getInstance().getReference().child("main").child("content3");


        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                txt.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ref1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                txt1.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ref2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                txt2.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ref3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                txt3.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ref4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                txt4.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ref5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                txt5.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

  }

}
