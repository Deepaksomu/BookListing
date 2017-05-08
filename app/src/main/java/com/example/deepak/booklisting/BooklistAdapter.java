package com.example.deepak.booklisting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Deepak on 23-03-2017.
 */

public class BooklistAdapter extends ArrayAdapter<BookList> {
        private int mRes;
        public BooklistAdapter(Context context, int resource, List<BookList> books){
            super(context, 0 ,books) ;
            this.mRes = resource;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            final ViewHolder holder;
            if (convertView != null){
                holder =(ViewHolder) convertView.getTag();
            }
            else {
                //view = inflater.inflate(R.layout.whatever, parent, false);
                convertView = LayoutInflater.from(getContext()).inflate(mRes,parent,false);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
            }

            BookList book = getItem(position);
            if (book != null) {
                holder.title.setText(book.getTitle());
                holder.author.setText(book.getAuthor());
                holder.link.setText(book.getLink());
                holder.description.setText(book.getDescription());
                Picasso.with(getContext())
                        .load(book.getImage())
                        .fit()
                        .centerCrop()
                        .placeholder(R.drawable.book)
                        .into(holder.imageView);
            }

            return convertView;
        }
        protected static class ViewHolder {
            @BindView(R.id.book_img)
            protected ImageView imageView;
            @BindView(R.id.link_testview)
            protected TextView link;
            @BindView(R.id.title_textview)
            protected TextView title;
            @BindView(R.id.auth_testview)
            protected TextView author;
            @BindView(R.id.des_textview)
            protected TextView description;

            public ViewHolder(View view) {

                ButterKnife.bind(this, view);
            }
        }
    }




}
