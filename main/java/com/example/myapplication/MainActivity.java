package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;

import android.content.DialogInterface;
import android.os.Bundle;

import android.view.View;

import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }
    EditText editText;
    public void pop_view_Viewer(View view) {
        editText = (EditText)findViewById (R.id.editText2);
        final AlertDialog.Builder builder = new AlertDialog.Builder ( this );
        builder.setMessage ( "Are you sure you want clear the text" );
        builder.setIcon(android.R.drawable.stat_notify_error);
        builder.setTitle ( "Delete confirmation" );
        builder.setPositiveButton ( "Yes", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                editText.setText ( "" );
            }
        } );
        builder.setNegativeButton ( "No", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        } );
    builder.show ();
    }

}
