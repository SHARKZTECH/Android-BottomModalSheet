package com.example.bottommodalsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton=findViewById(R.id.fABtn);

        floatingActionButton.setOnClickListener(view -> {
            final BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(MainActivity.this,R.style.Theme_BottomModalSheet);
            View bottomDialogSheetView= LayoutInflater.from(getApplicationContext()).inflate(R.layout.bottom_sheet,(LinearLayout) findViewById(R.id.linear));

            ImageView folder=bottomDialogSheetView.findViewById(R.id.folder);
            ImageView upload=bottomDialogSheetView.findViewById(R.id.upload);
            ImageView scan=bottomDialogSheetView.findViewById(R.id.scan);
            ImageView docs=bottomDialogSheetView.findViewById(R.id.docs);
            ImageView sheet=bottomDialogSheetView.findViewById(R.id.sheets);
            ImageView slide=bottomDialogSheetView.findViewById(R.id.slides);

            folder.setOnClickListener(view1 -> {
                Toast.makeText(this, "Folder Selected!", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            });
            upload.setOnClickListener(view1 -> {
                Toast.makeText(this, "Upload Selected!", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            });
            scan.setOnClickListener(view1 -> {
                Toast.makeText(this, "Scan Selected!", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            });
            docs.setOnClickListener(view1 -> {
                Toast.makeText(this, "Document Selected!", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            });
            sheet.setOnClickListener(view1 -> {
                Toast.makeText(this, "Sheet Selected!", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            });
            slide.setOnClickListener(view1 -> {
                Toast.makeText(this, "Slide Selected!", Toast.LENGTH_SHORT).show();
                bottomSheetDialog.dismiss();
            });

            bottomSheetDialog.setContentView(bottomDialogSheetView);
            bottomSheetDialog.show();
        });
    }
}