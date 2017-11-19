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
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        rc.setLayoutManager(layoutManager);

        //TODO: Tạo dữ liệu
        ArrayList<FoodItem> itemArrayList = new ArrayList<>();

        FoodItem item1 = new FoodItem("Bún Bò", "35000đ");
        FoodItem item2 = new FoodItem("Bún Vịt", "55000đ");
        FoodItem item3 = new FoodItem("Bún Gà", "25000đ");
        FoodItem item4 = new FoodItem("Tôm Hùm", "735000đ");
        FoodItem item5 = new FoodItem("Cơm Chiên", "20000đ");
        FoodItem item6 = new FoodItem("Cơm Sườn", "22000đ");
        item4.setmPath("http://nonla.vn/wp-content/uploads/2017/06/20160624_V-n_T-m-h-m-ng-l-nh-Alaska-Gi-p-gia-nh-b-n-t-n-h-ng-nh-ng-b-a-n-sanh-ch-nh-ngay-t-i-nh-_1.jpg");
        item1.setmPath("https://ameovat.com/wp-content/uploads/2016/04/bun-bo-hue-ngon-02.jpg");
        item2.setmPath("http://img2.news.zing.vn/2012/12/19/dsc8856.jpg");
        item3.setmPath("https://pastaxi-manager.onepas.vn/content/uploads/articles/minhnguyet/bun-ga/bun-ga-3.jpg");
        item5.setmPath("https://s-media-cache-ak0.pinimg.com/originals/df/7a/da/df7adab9447958aaa81474fc64e5c219.png");
        item6.setmPath("http://comtamanhtu.com/images/stores/2015/06/26/1-A26.jpg(1).jpg");

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
