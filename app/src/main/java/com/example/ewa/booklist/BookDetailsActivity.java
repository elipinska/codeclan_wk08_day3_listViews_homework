package com.example.ewa.booklist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BookDetailsActivity extends AppCompatActivity {

    private TextView bookDetailsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        bookDetailsTextView = findViewById(R.id.bookDetailsTextView);

        Intent intent = getIntent();
        Book book =  (Book) intent.getSerializableExtra("book");

        bookDetailsTextView.setText("\"" + book.getTitle() + "\" by " + book.getAuthor() + " (ISBN " + book.getIsbn() + ")" );


    }
}
