package com.example.ewa.booklist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ReadingListAdapter extends ArrayAdapter<Book> {

    public ReadingListAdapter(Context context, ArrayList<Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.reading_list_item, parent, false);
        }

        Book currentBook = getItem(position);

        TextView title = listItemView.findViewById(R.id.titleTextView);
        title.setText(currentBook.getTitle().toString());

        TextView author = listItemView.findViewById(R.id.authorTextView);
        author.setText(currentBook.getAuthor());

        TextView isbn13 = listItemView.findViewById(R.id.isbn13TextView);
        isbn13.setText(currentBook.getIsbn());

        listItemView.setTag(currentBook);

        return listItemView;
    }
}
