package net.kathir.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class AddNewNotesActivity extends AppCompatActivity {

    private static final String TAG = AddNewNotesActivity.class.getSimpleName();

    private static final String KEY_TITLE = "title";
    private static final String KEY_DESCRIPTION = "description";

    private EditText editTextTitle,editTextDesc;
    private Button savebtn;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference notebookRef = db.collection("Notebook");
    private DocumentReference noteRef = db.document("Notebook/My First Note");


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_notes_layout);

        editTextTitle = findViewById(R.id.title);
        editTextDesc = findViewById(R.id.desc);
        
        savebtn = findViewById(R.id.addnotes);
        
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                addNotes();
            }
        });

    }

    private void addNotes() {
        String title = editTextTitle.getText().toString();
        String desc = editTextDesc.getText().toString();

        Note note = new Note(title,desc);

        notebookRef.add(note);

        startActivity(new Intent(getApplicationContext(),MainActivity.class));

//        Map<String, Object> note = new HashMap<>();
//        note.put(KEY_TITLE,title);
//        note.put(KEY_DESCRIPTION,desc);
//
//        db.collection("Notebook").document("My First Note").set(note)
//                .addOnSuccessListener(new OnSuccessListener<Void>() {
//                    @Override
//                    public void onSuccess(Void aVoid) {
//
//                        Toast.makeText(AddNewNotesActivity.this,"Notes Saved",Toast.LENGTH_SHORT).show();
//
//                    }
//                })
//                .addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//
//                        Toast.makeText(AddNewNotesActivity.this,"Error",Toast.LENGTH_SHORT).show();
//                        Log.d(TAG,e.toString());
//                    }
//                });

    }

}
