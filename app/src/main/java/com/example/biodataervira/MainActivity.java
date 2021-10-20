package com.example.biodataervira;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Maps(View view) {
        Intent mapsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/i6AHwDwb5aR8qM6e9"));
        startActivity(mapsIntent);
    }

    public void email(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto"));
        String emailUri = "111202012661@mhs.dinus.ac.id";
        emailIntent.putExtra(Intent.EXTRA_EMAIL, emailUri);
        emailIntent.setType("message/rfc822");
        Intent chooser=Intent.createChooser(emailIntent,"send Email");
        startActivity(chooser);
    }

    public void phone(View view) {
        String nomor = "081912762518";
        Intent phoneIntent= new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",nomor, null));
        startActivity(phoneIntent);
    }
}