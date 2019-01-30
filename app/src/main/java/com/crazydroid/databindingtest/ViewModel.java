package com.crazydroid.databindingtest;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;

import com.crazydroid.bean.ItemBean;
import com.crazydroid.bean.TitleBean;
import com.crazydroid.holder.HolderFactory;

import me.tatarka.bindingcollectionadapter2.ItemBinding;
import me.tatarka.bindingcollectionadapter2.OnItemBind;

public class ViewModel {
    public ObservableArrayList list = new ObservableArrayList<>();

    public MyDecorator decorator = new MyDecorator();

    public RecyclerViewAdapter adapter = new RecyclerViewAdapter();

//    public HolderFactory holderFactory = HolderFactory.getInstance();

    public ItemBinding<Object> itemBeanItemBinding = ItemBinding.of(new OnItemBind<Object>() {
        @Override
        public void onItemBind(ItemBinding itemBinding, int position, Object object) {
            if(object instanceof ItemBean){
                itemBinding.set(BR.itemBean,R.layout.layout_item2);
            }else if(object instanceof TitleBean){
                itemBinding.set(BR.titleItem,R.layout.layout_item);
            }
        }
    }) ;

    public ObservableField<String> url = new ObservableField<>();

    public ViewModel() {
        super();
    }

    public void fetchData() {
        list.clear();
        TitleBean titleBean = new TitleBean();
        titleBean.title.set("This is title 1");
        list.add(titleBean);
        for (int i = 0; i < 15; i++) {
            ItemBean itemBean = new ItemBean();
            itemBean.age.set("" + 11);
            itemBean.name.set("abc");
            itemBean.url.set("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3365018759,2226705862&fm=27&gp=0.jpg");
            list.add(itemBean);
        }
        titleBean = new TitleBean();
        titleBean.title.set("This is title 2");
        list.add(titleBean);
        for (int i = 0; i < 15; i++) {
            ItemBean itemBean = new ItemBean();
            itemBean.age.set("" + 11);
            itemBean.name.set("abc");
            itemBean.url.set("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3365018759,2226705862&fm=27&gp=0.jpg");
            list.add(itemBean);
        }
        titleBean = new TitleBean();
        titleBean.title.set("This is title 3");
        list.add(titleBean);
        for (int i = 0; i < 15; i++) {
            ItemBean itemBean = new ItemBean();
            itemBean.age.set("" + 11);
            itemBean.name.set("abc");
            itemBean.url.set("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3365018759,2226705862&fm=27&gp=0.jpg");
            list.add(itemBean);
        }
        url.set("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3365018759,2226705862&fm=27&gp=0.jpg");
    }
}
