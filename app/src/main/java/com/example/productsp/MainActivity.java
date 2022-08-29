package com.example.productsp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Contact> listContact = new ArrayList<>();
    List<Product> listProduct = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //B1: Data source
//        initData();
//        //B2: Adapter
//        ContactAdapter adapter = new ContactAdapter(this, listContact);
//        //B3: Layout Manager
////        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
//        //B4: RecyclerView
//        RecyclerView rvContact1 = findViewById(R.id.rvContact);
//        rvContact1.setLayoutManager(layoutManager);
//        rvContact1.setAdapter(adapter);

        //B1: Data source
        initDataProduct();
        //B2: Adapter
        ProductAdapter adapter = new ProductAdapter(this, listProduct);
        //B3: Layout Manager
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        //B4: RecyclerView
        RecyclerView rvContact1 = findViewById(R.id.rvContact);
        rvContact1.setLayoutManager(layoutManager);
        rvContact1.setAdapter(adapter);
    }

    private void initDataProduct() {
        listProduct.add(new Product("Sản Phẩm Trang Điểm", "Giúp các bạn nữ xinh đẹp", 3300F, R.drawable.anh1));
        listProduct.add(new Product("Máy Ảnh CANON", "nên sắp 3 cái để chụp", 44000F, R.drawable.anh2));
        listProduct.add(new Product("Máy Ảnh SONY", "nên sắp 1 cái để chụp", 56664f, R.drawable.anh3));
    }

    private void initData() {
        listContact.add(new Contact("Nguyen Van A", "0987654321", R.drawable.anh1));
        listContact.add(new Contact("Nguyen Van B", "0987654321", R.drawable.anh2));
        listContact.add(new Contact("Nguyen Van C", "0987654321", R.drawable.anh3));
        listContact.add(new Contact("Nguyen Van D", "0987654321", R.drawable.anh4));
        listContact.add(new Contact("Nguyen Van E", "0987654321", R.drawable.anh5));
        listContact.add(new Contact("Nguyen Van F", "0987654321", R.drawable.anh6));
        listContact.add(new Contact("Nguyen Van G", "0987654321", R.drawable.anh7));
        listContact.add(new Contact("Nguyen Van H", "0987654321", R.drawable.anh8));
        listContact.add(new Contact("Nguyen Van I", "0987654321", R.drawable.anh9));
    }
}