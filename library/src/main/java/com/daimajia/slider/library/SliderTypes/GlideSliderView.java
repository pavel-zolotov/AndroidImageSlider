package com.daimajia.slider.library.SliderTypes;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class GlideSliderView extends DefaultSliderView {

    public GlideSliderView(Context context) {
        super(context);
    }

    @Override
    protected void bindEventAndShow(final View v, ImageView targetImageView) {
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mOnSliderClickListener != null){
                    mOnSliderClickListener.onSliderClick(GlideSliderView.this);
                }
            }
        });

        View progressBar = v.findViewById(com.daimajia.slider.library.R.id.loading_bar);
        if (progressBar != null) {
            progressBar.setVisibility(View.GONE);
        }

        RequestBuilder<Drawable> requestBuilder;
        if(getUrl() != null){
            requestBuilder = Glide.with(mContext).load(getUrl());
        }else if(getFile() != null){
            requestBuilder = Glide.with(mContext).load(getFile());
        }else if(getRes() != 0){
            requestBuilder = Glide.with(mContext).load(getRes());
        }else{
            return;
        }

        requestBuilder
                .centerCrop()
                .transition(withCrossFade())
                .into(targetImageView);
    }
}
