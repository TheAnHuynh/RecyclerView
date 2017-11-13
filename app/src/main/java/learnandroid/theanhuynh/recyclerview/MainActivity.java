package learnandroid.theanhuynh.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: Bắt RecyclerView
        RecyclerView rc = findViewById(R.id.recycleView);

        // TODO: Đặt layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rc.setLayoutManager(layoutManager);

        //TODO: Tạo dữ liệu
        ArrayList<FoodItem> itemArrayList = new ArrayList<>();

        FoodItem item1 = new FoodItem("Bún Bò", "35000đ");
        FoodItem item2 = new FoodItem("Bún Vịt", "55000đ");
        FoodItem item3 = new FoodItem("Bún Gà", "25000đ");
        FoodItem item4 = new FoodItem("Tôm Hùm", "735000đ");
        FoodItem item5 = new FoodItem("Cơm Chiên", "20000đ");
        FoodItem item6 = new FoodItem("Cơm Sườn", "22000đ");
        itemArrayList.add(item1);
        itemArrayList.add(item2);
        itemArrayList.add(item3);
        itemArrayList.add(item4);
        itemArrayList.add(item5);
        itemArrayList.add(item6);
        // TODO: Tạo adapter
        FoodAdapter foodAdapter = new FoodAdapter();
        foodAdapter.setFoodItemArrayList(itemArrayList);
        // TODO: Đặt adtapter
        rc.setAdapter(foodAdapter);
    }
}
