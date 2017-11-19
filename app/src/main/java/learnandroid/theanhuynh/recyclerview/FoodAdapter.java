package learnandroid.theanhuynh.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by An on 11/12/2017.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodMenuViewHolder> {

    private ArrayList<FoodItem> mfoodItemArrayList;

    @Override
    public FoodMenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new FoodMenuViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.foodmenuitems
                ,parent,false));
    }

    @Override
    public void onBindViewHolder(FoodMenuViewHolder holder, int position) {
        FoodItem item = mfoodItemArrayList.get(position);
        //TODO: Load ảnh từ đường dẫn ( tuần sau học )
       // holder.anh
        holder.ten.setText(item.getMten());
        holder.gia.setText(item.getMgia());
    }

    @Override
    public int getItemCount() {
        return mfoodItemArrayList.size();
    }

    public void setFoodItemArrayList(ArrayList<FoodItem> foodItems){
        this.mfoodItemArrayList = foodItems;
    }

    public class FoodMenuViewHolder extends RecyclerView.ViewHolder {

        public ImageView anh;
        public TextView ten;
        public TextView gia;

        public FoodMenuViewHolder(View itemView) {
            super(itemView);
            anh = itemView.findViewById(R.id.imgAnh);
            ten = itemView.findViewById(R.id.txtTen);
            gia = itemView.findViewById(R.id.txtGia);
        }
    }

}
