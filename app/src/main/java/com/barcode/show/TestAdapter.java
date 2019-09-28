package com.barcode.show;

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

    }
}
