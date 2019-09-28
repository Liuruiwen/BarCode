package com.barcode.show;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by Amuse
 * Date:2019/9/28.
 * Desc:
 */

public class TestAdapter extends BaseQuickAdapter<String,BaseViewHolder>{
    public TestAdapter() {
        super(R.layout.item_test);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv_price,String.format("￥%1.2f",2666.0));


        RequestOptions roundOptions = new RequestOptions()
                .transform(new RoundedCorners(60));
        roundOptions.transform(new CenterCrop(), new RoundedCorners(60));//处理CenterCrop的情况

        Glide.with(mContext)
                .load("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=4121549286,1002358299&fm=26&gp=0.jpg")
                .apply(roundOptions)
                .into((ImageView) helper.getView(R.id.iv_goods));


    }
}
