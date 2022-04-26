package com.example.a18520726_lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<User> {
    private static final String TAG = "UserAdapter";
    private Context mContext;
    int mResource;

    /**
     * Default constructor for the UserAdapter
     * @param context
     * @param resource
     * @param objects
     */

    public UserAdapter(Context context, int resource, ArrayList<User> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String name = getItem(position).getName();
        String hometown = getItem(position).getHometown();

        User user = new User(name, hometown);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView userName = (TextView) convertView.findViewById(R.id.name);
        TextView userHometown = (TextView) convertView.findViewById(R.id.hometown);

        userName.setText(name);
        userHometown.setText(hometown);

        return convertView;
    }
}
