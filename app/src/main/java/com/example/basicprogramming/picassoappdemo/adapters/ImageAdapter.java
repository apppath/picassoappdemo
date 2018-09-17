package com.example.basicprogramming.picassoappdemo.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basicprogramming.picassoappdemo.R;
import com.example.basicprogramming.picassoappdemo.model.Images;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.Holder> {

    private Context context;
    private ArrayList<Images> imagesArrayList;
    private LayoutInflater inflater;

    public ImageAdapter(Context context, ArrayList<Images> imagesArrayList) {
        this.context = context;
        this.imagesArrayList = imagesArrayList;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.image_list_layout, parent, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        Images images = imagesArrayList.get(position);
        holder.textView.setText(images.getMovieName());

        Picasso.get().load(images.getImageUrl()).placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .resize(350, 500).into(holder.imageView);

        holder.setListener(position);
    }

    @Override
    public int getItemCount() {
        return imagesArrayList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;
        private int position;

        public Holder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.movie_name_text_view);
            imageView = itemView.findViewById(R.id.my_image_picasso);

        }

        public void setListener(final int position) {
            this.position = position;
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Images images = imagesArrayList.get(position);

                    Toast.makeText(context, "Movie Name " + images.getMovieName(),
                            Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
