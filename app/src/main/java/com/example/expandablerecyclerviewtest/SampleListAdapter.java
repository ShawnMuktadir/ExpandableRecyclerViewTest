package com.example.expandablerecyclerviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SampleListAdapter extends RecyclerView.Adapter<SampleListAdapter.MovieVH> {

    private static final String TAG = "MovieAdapter";
    private List<SampleList> sampleListList;
    private Context context;

    public SampleListAdapter(Context context, List<SampleList> sampleListList) {
        this.context = context;
        this.sampleListList = sampleListList;
    }

    @NonNull
    @Override
    public MovieVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new MovieVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieVH holder, int position) {

        SampleList sampleList = sampleListList.get(position);

        holder.tvTitle.setText(sampleList.getTitle());

//        if (holder.tvTitle.getText().equals("Video 3_0")){
//            holder.tvTitle.setText(sampleList.getVideo_3_0_title());
//            holder.ivTitle.setImageResource(R.drawable.ic_video);
//        }
//
//        if (holder.tvTitle.getText().equals("Document 4_0")){
//            holder.ivTitle.setImageResource(R.drawable.ic_video);
//            holder.tvTitle.setText(sampleList.getDocument_4_0_title());
//            holder.tvTitle_author_1_1.setVisibility(View.VISIBLE);
//            holder.tvTitle_author_1_1.setText(sampleList.getDocument_4_0_author());
//        }

//        holder.tvTitle.setText(sampleList.getTitle());
        holder.ivVideo_1_1.setImageResource(R.drawable.ic_video);
        holder.tvVideo_1_1.setText(sampleList.getVideo_1_1_title());
        holder.ivDocument_1_1.setImageResource(R.drawable.ic_document);
        holder.tvDocument_1_1.setText(sampleList.getDocument_1_1_title());
        holder.tvDocument_author_1_1.setText(sampleList.getDocument_1_1_author_title());
        holder.ivVideo_1_2.setImageResource(R.drawable.ic_video);
        holder.tvVideo_1_2.setText(sampleList.getVideo_1_1_title());

        holder.ivDocument_2_1.setImageResource(R.drawable.ic_document);
        holder.tvDocument_2_1.setText(sampleList.getDocument_2_1_title());
        holder.tvDocument_author_2_1.setText(sampleList.getDocument_2_1_author_title());
        holder.ivVideo_2_1.setImageResource(R.drawable.ic_video);
        holder.tvVideo_2_1.setText(sampleList.getVideo_2_1_title());
        holder.ivVideo_2_2.setImageResource(R.drawable.ic_video);
        holder.tvVideo_2_2.setText(sampleList.getVideo_2_2_title());
        holder.tvAudio_2_2.setText(sampleList.getAudio_2_2());

        holder.ivVideo_3_0.setImageResource(R.drawable.ic_video);
        holder.tvVideo_3_0.setText(sampleList.getVideo_3_0_title());

        holder.ivDocument_4_0.setImageResource(R.drawable.ic_document);
        holder.tvDocument_4_0.setText(sampleList.getDocument_4_0_title());
        holder.tvDocument_author_4_0.setText(sampleList.getDocument_4_0_author());

        if (holder.tvTitle.getText().equals("Chapter 1")) {
            holder.linearLayoutChapterOne.setVisibility(View.VISIBLE);
            holder.linearLayoutChapterTwo.setVisibility(View.GONE);
            holder.linearLayoutVideoThree.setVisibility(View.GONE);
            holder.linearLayoutVideoFour.setVisibility(View.GONE);
        }

        if (holder.tvTitle.getText().equals("Chapter 2")) {
            holder.linearLayoutChapterTwo.setVisibility(View.VISIBLE);
            holder.linearLayoutChapterOne.setVisibility(View.GONE);
            holder.linearLayoutVideoThree.setVisibility(View.GONE);
            holder.linearLayoutVideoFour.setVisibility(View.GONE);
        }

        /*if (holder.tvTitle.getText().equals("Video 3_0") && holder.tvTitle.getText().equals("Document 4_0")) {
            *//*holder.linearLayoutChapterTwo.setVisibility(View.VISIBLE);
            holder.linearLayoutChapterOne.setVisibility(View.GONE);*//*
            holder.linearLayoutVideoThree.setVisibility(View.GONE);
            holder.linearLayoutVideoFour.setVisibility(View.GONE);
        }*/

        boolean isExpanded = sampleListList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return sampleListList.size();
    }

    class MovieVH extends RecyclerView.ViewHolder {

        private static final String TAG = "MovieVH";

        LinearLayout expandableLayout;
        LinearLayout linearLayoutChapterOne, linearLayoutChapterTwo, linearLayoutVideoThree, linearLayoutVideoFour;
        TextView tvTitle, tvTitle_author_1_1, tvVideo_1_1, tvDocument_1_1, tvDocument_author_1_1, tvVideo_1_2,
                tvDocument_2_1, tvDocument_author_2_1, tvVideo_2_1, tvVideo_2_2, tvAudio_2_2, tvVideo_3_0, tvDocument_4_0, tvDocument_author_4_0;
        ImageView ivTitle, ivVideo_1_1, ivDocument_1_1, ivVideo_1_2, ivDocument_2_1, ivVideo_2_1, ivVideo_2_2, ivVideo_3_0, ivDocument_4_0;

        public MovieVH(@NonNull final View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tvTitle);
//            ivTitle = itemView.findViewById(R.id.ivTitle);
//            tvTitle_author_1_1 = itemView.findViewById(R.id.tvTitle_author_1_1);
            tvVideo_1_1 = itemView.findViewById(R.id.tvVideo_1_1);
            ivVideo_1_1 = itemView.findViewById(R.id.ivVideo_1_1);
            ivDocument_1_1 = itemView.findViewById(R.id.ivDocument_1_1);
            tvDocument_1_1 = itemView.findViewById(R.id.tvDocument_1_1);
            tvDocument_author_1_1 = itemView.findViewById(R.id.tvDocument_author_1_1);
            tvVideo_1_2 = itemView.findViewById(R.id.tvVideo_1_2);
            ivVideo_1_2 = itemView.findViewById(R.id.ivVideo_1_2);

            ivDocument_2_1 = itemView.findViewById(R.id.ivDocument_2_1);
            tvDocument_2_1 = itemView.findViewById(R.id.tvDocument_2_1);
            tvDocument_author_2_1 = itemView.findViewById(R.id.tvDocument_author_2_1);
            ivVideo_2_1 = itemView.findViewById(R.id.ivVideo_2_1);
            tvVideo_2_1 = itemView.findViewById(R.id.tvVideo_2_1);
            ivVideo_2_2 = itemView.findViewById(R.id.ivVideo_2_2);
            tvVideo_2_2 = itemView.findViewById(R.id.tvVideo_2_2);
            tvAudio_2_2 = itemView.findViewById(R.id.tvAudio_2_2);

            ivVideo_3_0 = itemView.findViewById(R.id.ivVideo_3_0);
            tvVideo_3_0 = itemView.findViewById(R.id.tvVideo_3_0);

            ivDocument_4_0 = itemView.findViewById(R.id.ivDocument_4_0);
            tvDocument_4_0 = itemView.findViewById(R.id.tvDocument_4_0);
            tvDocument_author_4_0 = itemView.findViewById(R.id.tvDocument_author_4_0);

            expandableLayout = itemView.findViewById(R.id.expandableLayout);
            linearLayoutChapterOne = itemView.findViewById(R.id.chapter_one_layout);
            linearLayoutChapterTwo = itemView.findViewById(R.id.chapter_two_layout);
            linearLayoutVideoThree = itemView.findViewById(R.id.video_three_layout);
            linearLayoutVideoFour = itemView.findViewById(R.id.video_four_layout);


            tvTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (!tvTitle.getText().equals("Video 3_0") && !tvTitle.getText().equals("Document 4_0")) {
                        SampleList sampleList = sampleListList.get(getAdapterPosition());
                        sampleList.setExpanded(!sampleList.isExpanded());
                        notifyItemChanged(getAdapterPosition());
                    } else {
                        Toast.makeText(context, "Item Click", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
