package com.crazydroid.databindingtest;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.view.View;
import android.widget.Toast;

import me.tatarka.bindingcollectionadapter2.ItemBinding;
import me.tatarka.bindingcollectionadapter2.OnItemBind;

public class ViewModel {
    public ObservableArrayList list = new ObservableArrayList<>();

    public RecyclerViewAdapter adapter = new RecyclerViewAdapter();

    public ItemBinding<Object> itemBeanItemBinding = ItemBinding.of(new OnItemBind<Object>() {
        @Override
        public void onItemBind(ItemBinding itemBinding, int position, Object object) {
            if(object instanceof ItemBean){
                itemBinding.set(BR.itemBean,R.layout.layout_item);
            }else if(object instanceof TitleBean){
                itemBinding.set(BR.titleItem,R.layout.layout_item2);
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
        titleBean.size = 10;
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
        titleBean.size = 10;
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
        titleBean.size = 10;
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

    public void btnClick(View view) {
        Toast.makeText(view.getContext(), "add item", Toast.LENGTH_SHORT).show();
        ItemBean itemBean = new ItemBean();
        itemBean.age.set("" + 11);
        itemBean.name.set("abc");
        itemBean.url.set("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3365018759,2226705862&fm=27&gp=0.jpg");
        list.add(itemBean);
    }


//            BindingRecyclerViewAdapter.ViewHolderFactory { binding -> MyAwesomeViewHolder(binding.root) }

}
