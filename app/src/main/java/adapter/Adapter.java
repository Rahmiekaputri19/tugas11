package  adapter;

import android.app.Activity;
import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    private Activity activity;
    private .LayoutInflater inflater;
    private List<Data> items;

    public Adapter (Activity activity, List<Data>items){
        this.activity = activity;
        this.items = items;
    }
    @Override
    public int getCount (){
        return  items.size()
    }
}