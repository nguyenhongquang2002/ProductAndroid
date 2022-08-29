package com.example.productsp;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter {

    //1. Nhan data
    //2. Nhan layout moi item
    //3. Data + layout => Item

    private Activity activity;
    private List<com.example.productsp.Contact> listContact;

    public ContactAdapter(Activity activity, List<com.example.productsp.Contact> listContact) {
        this.activity = activity;
        this.listContact = listContact;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = activity.getLayoutInflater().inflate(
                R.layout.contact_sp, parent, false);
        ContactHolder holder = new ContactHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ContactHolder contactHolder = (ContactHolder) holder;
        com.example.productsp.Contact data = listContact.get(position);
        contactHolder.ivAvatar.setImageResource(data.getAvatar());
        contactHolder.tvName.setText(data.getName());
        contactHolder.tvPhone.setText(data.getPhone());
    }

    @Override
    public int getItemCount() {
        return listContact.size();
    }

    public class ContactHolder extends RecyclerView.ViewHolder {
        ImageView ivAvatar;
        TextView tvName;
        TextView tvPhone;

        public ContactHolder(@NonNull View itemView) {
            super(itemView);
            ivAvatar = itemView.findViewById(R.id.ivAvatar);
            tvName = itemView.findViewById(R.id.tvUser);
            tvPhone = itemView.findViewById(R.id.tvPhone);

        }
    }
}
