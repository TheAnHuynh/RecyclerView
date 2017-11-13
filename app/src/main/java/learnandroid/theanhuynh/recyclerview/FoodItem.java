package learnandroid.theanhuynh.recyclerview;

/**
 * Created by An on 11/12/2017.
 */

public class FoodItem {
    private String mten;
    private String mgia;
    private String mPath; // Tuần sau sẽ xài tới

    public FoodItem(String mten, String mgia) {
        this.mten = mten;
        this.mgia = mgia;
    }


    public String getMten() {
        return mten;
    }

    public void setMten(String mten) {
        this.mten = mten;
    }

    public String getMgia() {
        return mgia;
    }

    public void setMgia(String mgia) {
        this.mgia = mgia;
    }

    public String getmPath() {
        return mPath;
    }

    public void setmPath(String mPath) {
        this.mPath = mPath;
    }

}
