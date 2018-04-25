package com.example.ewa.booklist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BookListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        ReadingList readingList = new ReadingList();
        ArrayList<Book> books = readingList.getReadingList();

        ReadingListAdapter readingListAdapter = new ReadingListAdapter(this, books);

        ListView readingListView = findViewById(R.id.readingListView);
        readingListView.setAdapter(readingListAdapter);
    }

    public void onReadingListItemClicked(View listItem) {
        Book book = (Book) listItem.getTag();
        Log.d("Book title: ", book.getTitle());

        Intent intent = new Intent(this, BookDetailsActivity.class);
        intent.putExtra("book", book);
        startActivity(intent);
    }
}
