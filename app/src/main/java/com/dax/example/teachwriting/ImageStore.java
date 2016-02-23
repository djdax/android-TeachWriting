package com.dax.example.teachwriting;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.media.Image;
import android.view.MotionEvent;

import java.util.ArrayList;

/**
 * Created by Dennis on 2/23/2016.
 */
public class ImageStore extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 2;
    private static final String PARENT_ALPHABET_TABLE_NAME = "parentAlphabets";
    private static final String DATABASE_NAME = "TeachWrite";
    private static final String DICTIONARY_TABLE_CREATE =
            "CREATE TABLE " + PARENT_ALPHABET_TABLE_NAME + " (ID INTEGER, PARENT_ALPHABET BLOB, MOTION BLOB) IF NOT EXISTS " + PARENT_ALPHABET_TABLE_NAME;

    ImageStore(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DICTIONARY_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void save(Bitmap image, ArrayList<MotionEvent> event) {

    }
}
