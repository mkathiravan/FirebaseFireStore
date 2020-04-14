package net.kathir.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class UpdateActivity extends AppCompatActivity {


    EditText title,desc;
    String titlesend,descsend;
    Button updates,delete;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_view);

        Bundle bundle = getIntent().getExtras();
        final Note note = bundle.getParcelable("pass_object");

        title = findViewById(R.id.title);
        desc = findViewById(R.id.desc);
        updates=findViewById(R.id.updatesbutton);
        delete=findViewById(R.id.deletedbutton);

        title.setText(note.getTitle());
        desc.setText(note.getDescription());


        updates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                updateNotes(note);
            }
        });



    }

    public void updateNotes(Note note)
    {
        titlesend = title.getText().toString().trim();
        descsend = desc.getText().toString().trim();

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        DocumentReference notesRef = db.collection("Notebook").document(note.getDocumentId());

        notesRef.update("title",titlesend,"description",descsend).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {

                if(task.isSuccessful())
                {
                    Toast.makeText(UpdateActivity.this,"Updated Successfully",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),UpdateActivity.class));
                }
            }
        });

    }
}
