package id.sch.smktelkom_mlg.learn.recyclerview1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    rawable[] arFoto = new Drawable[a.length()];
    int i = 0;

    {
        arFoto[i] = a.getDrawable(i);
        BitmapDrawable bd = (BitmapDrawable) a.getDrawable(i);
        RoundedBitmapDrawable rbd =
                RoundedBitmapDrawableFactory.create(getResources(), bd.getBitmap());
        rbd.setCircular(true);
        arFoto[i] = rbd;
    }

    for(
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new HotelAdapter(mList);
        recyclerView.setAdapter(mAdapter);

        fillData();

    }

    i<arFoto.length i
    ++)
    private void fillData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.places);
        String[] arDeskripsi = resources.getStringArray(R.array.place_desc);
        TypedArray a = resources.obtainTypedArray(R.array.places_picture);
        Drawable[] arFoto = new Drawable[a.length()];
        for (int i = 0; i < arFoto.length; i++) {
            arFoto[i] = a.getDrawable(i);
        }
        a.recycle();

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Hotel(arJudul[i], arDeskripsi[i], arFoto[i]));
        }
        mAdapter.notifyDataSetChanged();
    }

    a.recycle()
}
