package com.example.estsoft.travelfriendflow2;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MapActivity extends AppCompatActivity {


    ArrayList<City> city = new ArrayList<City>();
    static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);


        ImageView map = (ImageView)findViewById(R.id.map);
        Log.i("Log", "count : " + count);

        map.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                //좌표 구하기
                int h = view.getHeight();
                int w = view.getWidth();
                Log.i("LOG", "w "+w+" h "+h);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Log.i("LOG", "x "+x+" y "+y);

                float ratioX = w/480;
                float ratioY = h/825;


                /*************************************************************
                 * 이 부분은 나중에 함수로 깔끔하게 정리할 예정입니당.
                 * 불편하더라도 우선 이렇게 보셔유 ^ ㅠ ^
                 * **************************************************************/


                //좌표 클릭
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){

                    //서울
                    if(motionEvent.getX() >= 144*ratioX && motionEvent.getX()*ratioX <= 183 && motionEvent.getY()*ratioY >= 149 && motionEvent.getY()*ratioY <=203){
                        MyAdapterCity adapter = new MyAdapterCity(getApplicationContext(),R.layout.row,city);
                        ListView lv = (ListView)findViewById(R.id.citylist);
                        City Seoul = new City("서울");
                        boolean isExist = false;

                        for(City c:city){
                            if(c.getTitle() == "서울"){
                                isExist = true;
                            }
                        }

                        if(isExist == false){
                            city.add(Seoul);
                            adapter.notifyDataSetChanged();
                        }else{
                            for(int i = 0;i<city.size();i++){
                                if(city.get(i).getTitle().equals(Seoul.getTitle())) {
                                    city.remove(i);
                                    break;
                                }
                            }
                            adapter.notifyDataSetChanged();
                        }
                        lv.setAdapter(adapter);
                    }

                    //가평
                    if(motionEvent.getX() >= 183*ratioX && motionEvent.getX()*ratioX <= 218 && motionEvent.getY()*ratioY >= 109 && motionEvent.getY()*ratioY <=186){
                        MyAdapterCity adapter = new MyAdapterCity(getApplicationContext(),R.layout.row,city);
                        ListView lv = (ListView)findViewById(R.id.citylist);
                        City Gapyeong = new City("가평");
                        boolean isExist = false;

                        for(City c:city){
                            if(c.getTitle() == "가평"){
                                isExist = true;
                            }
                        }

                        if(isExist == false){
                            city.add(Gapyeong);
                            adapter.notifyDataSetChanged();
                        }else{
                            for(int i = 0;i<city.size();i++){
                                if(city.get(i).getTitle().equals(Gapyeong.getTitle())) {
                                    city.remove(i);
                                    break;
                                }
                            }
                            adapter.notifyDataSetChanged();
                        }
                        lv.setAdapter(adapter);
                    }

                    //강릉
                    if(motionEvent.getX() >= 284*ratioX && motionEvent.getX()*ratioX <= 339 && motionEvent.getY()*ratioY >= 92 && motionEvent.getY()*ratioY <=166){
                        MyAdapterCity adapter = new MyAdapterCity(getApplicationContext(),R.layout.row,city);
                        ListView lv = (ListView)findViewById(R.id.citylist);
                        City Gangreung = new City("강릉");
                        boolean isExist = false;

                        for(City c:city){
                            if(c.getTitle() == "강릉"){
                                isExist = true;
                            }
                        }

                        if(isExist == false){
                            city.add(Gangreung);
                            adapter.notifyDataSetChanged();
                        }else{
                            for(int i = 0;i<city.size();i++){
                                if(city.get(i).getTitle().equals(Gangreung.getTitle())) {
                                    city.remove(i);
                                    break;
                                }
                            }
                            adapter.notifyDataSetChanged();
                        }
                        lv.setAdapter(adapter);
                    }

                    //안동
                    if(motionEvent.getX() >= 294*ratioX && motionEvent.getX()*ratioX <= 351 && motionEvent.getY()*ratioY >= 288 && motionEvent.getY()*ratioY <=367){
                        MyAdapterCity adapter = new MyAdapterCity(getApplicationContext(),R.layout.row,city);
                        ListView lv = (ListView)findViewById(R.id.citylist);
                        City Andong = new City("안동");
                        boolean isExist = false;

                        for(City c:city){
                            if(c.getTitle() == "안동"){
                                isExist = true;
                            }
                        }

                        if(isExist == false){
                            city.add(Andong);
                            adapter.notifyDataSetChanged();
                        }else{
                            for(int i = 0;i<city.size();i++){
                                if(city.get(i).getTitle().equals(Andong.getTitle())) {
                                    city.remove(i);
                                    break;
                                }
                            }
                            adapter.notifyDataSetChanged();
                        }
                        lv.setAdapter(adapter);
                    }

                    //전주
                    if(motionEvent.getX() >= 151*ratioX && motionEvent.getX()*ratioX <= 186 && motionEvent.getY()*ratioY >= 425 && motionEvent.getY()*ratioY <=469){
                        MyAdapterCity adapter = new MyAdapterCity(getApplicationContext(),R.layout.row,city);
                        ListView lv = (ListView)findViewById(R.id.citylist);
                        City Jeonju = new City("전주");
                        boolean isExist = false;

                        for(City c:city){
                            if(c.getTitle() == "전주"){
                                isExist = true;
                            }
                        }

                        if(isExist == false){
                            city.add(Jeonju);
                            adapter.notifyDataSetChanged();
                        }else{
                            for(int i = 0;i<city.size();i++){
                                if(city.get(i).getTitle().equals(Jeonju.getTitle())) {
                                    city.remove(i);
                                    break;
                                }
                            }
                            adapter.notifyDataSetChanged();
                        }
                        lv.setAdapter(adapter);
                    }

                    //경주
                    if(motionEvent.getX() >= 337*ratioX && motionEvent.getX()*ratioX <= 393 && motionEvent.getY()*ratioY >= 413 && motionEvent.getY()*ratioY <=479){
                        MyAdapterCity adapter = new MyAdapterCity(getApplicationContext(),R.layout.row,city);
                        ListView lv = (ListView)findViewById(R.id.citylist);
                        City Gyeongju = new City("경주");
                        boolean isExist = false;

                        for(City c:city){
                            if(c.getTitle() == "경주"){
                                isExist = true;
                            }
                        }

                        if(isExist == false){
                            city.add(Gyeongju);
                            adapter.notifyDataSetChanged();
                        }else{
                            for(int i = 0;i<city.size();i++){
                                if(city.get(i).getTitle().equals(Gyeongju.getTitle())) {
                                    city.remove(i);
                                    break;
                                }
                            }
                            adapter.notifyDataSetChanged();
                        }
                        lv.setAdapter(adapter);
                    }

                    //부산
                    if(motionEvent.getX() >= 314*ratioX && motionEvent.getX()*ratioX <= 377 && motionEvent.getY()*ratioY >= 500 && motionEvent.getY()*ratioY <=562){
                        MyAdapterCity adapter = new MyAdapterCity(getApplicationContext(),R.layout.row,city);
                        ListView lv = (ListView)findViewById(R.id.citylist);
                        City Busan = new City("부산");
                        boolean isExist = false;

                        for(City c:city){
                            if(c.getTitle() == "부산"){
                                isExist = true;
                            }
                        }

                        if(isExist == false){
                            city.add(Busan);
                            adapter.notifyDataSetChanged();
                        }else{
                            for(int i = 0;i<city.size();i++){
                                if(city.get(i).getTitle().equals(Busan.getTitle())) {
                                    city.remove(i);
                                    break;
                                }
                            }
                            adapter.notifyDataSetChanged();
                        }
                        lv.setAdapter(adapter);
                    }

                    //하동
                    if(motionEvent.getX() >= 223*ratioX && motionEvent.getX()*ratioX <= 268 && motionEvent.getY()*ratioY >= 512 && motionEvent.getY()*ratioY <=619){
                        MyAdapterCity adapter = new MyAdapterCity(getApplicationContext(),R.layout.row,city);
                        ListView lv = (ListView)findViewById(R.id.citylist);
                        City Hadong = new City("하동");
                        boolean isExist = false;

                        for(City c:city){
                            if(c.getTitle() == "하동"){
                                isExist = true;
                            }
                        }

                        if(isExist == false){
                            city.add(Hadong);
                            adapter.notifyDataSetChanged();
                        }else{
                            for(int i = 0;i<city.size();i++){
                                if(city.get(i).getTitle().equals(Hadong.getTitle())) {
                                    city.remove(i);
                                    break;
                                }
                            }
                            adapter.notifyDataSetChanged();
                        }
                        lv.setAdapter(adapter);
                    }

                    //통영
                    if(motionEvent.getX() >= 282*ratioX && motionEvent.getX()*ratioX <= 307 && motionEvent.getY()*ratioY >= 593 && motionEvent.getY()*ratioY <=628){
                        MyAdapterCity adapter = new MyAdapterCity(getApplicationContext(),R.layout.row,city);
                        ListView lv = (ListView)findViewById(R.id.citylist);
                        City Tongyeong = new City("통영");
                        boolean isExist = false;

                        for(City c:city){
                            if(c.getTitle() == "통영"){
                                isExist = true;
                            }
                        }

                        if(isExist == false){
                            city.add(Tongyeong);
                            adapter.notifyDataSetChanged();
                        }else{
                            for(int i = 0;i<city.size();i++){
                                if(city.get(i).getTitle().equals(Tongyeong.getTitle())) {
                                    city.remove(i);
                                    break;
                                }
                            }
                            adapter.notifyDataSetChanged();
                        }
                        lv.setAdapter(adapter);
                    }

                    //순천
                    if(motionEvent.getX() >= 175*ratioX && motionEvent.getX()*ratioX <= 211 && motionEvent.getY()*ratioY >= 586 && motionEvent.getY()*ratioY <=639){
                        MyAdapterCity adapter = new MyAdapterCity(getApplicationContext(),R.layout.row,city);
                        ListView lv = (ListView)findViewById(R.id.citylist);
                        City Sooncheon = new City("순천");
                        boolean isExist = false;

                        for(City c:city){
                            if(c.getTitle() == "순천"){
                                isExist = true;
                            }
                        }

                        if(isExist == false){
                            city.add(Sooncheon);
                            adapter.notifyDataSetChanged();
                        }else{
                            for(int i = 0;i<city.size();i++){
                                if(city.get(i).getTitle().equals(Sooncheon.getTitle())) {
                                    city.remove(i);
                                    break;
                                }
                            }
                            adapter.notifyDataSetChanged();
                        }
                        lv.setAdapter(adapter);
                    }

                    //여수
                    if(motionEvent.getX() >= 204*ratioX && motionEvent.getX()*ratioX <= 236 && motionEvent.getY()*ratioY >= 636 && motionEvent.getY()*ratioY <=669){
                        MyAdapterCity adapter = new MyAdapterCity(getApplicationContext(),R.layout.row,city);
                        ListView lv = (ListView)findViewById(R.id.citylist);
                        City Yeosoo = new City("여수");
                        boolean isExist = false;

                        for(City c:city){
                            if(c.getTitle() == "여수"){
                                isExist = true;
                            }
                        }

                        if(isExist == false){
                            city.add(Yeosoo);
                            adapter.notifyDataSetChanged();
                        }else{
                            for(int i = 0;i<city.size();i++){
                                if(city.get(i).getTitle().equals(Yeosoo.getTitle())) {
                                    city.remove(i);
                                    break;
                                }
                            }
                            adapter.notifyDataSetChanged();
                        }
                        lv.setAdapter(adapter);
                    }

                    //보성
                    if(motionEvent.getX() >= 144*ratioX && motionEvent.getX()*ratioX <= 189 && motionEvent.getY()*ratioY >= 640 && motionEvent.getY()*ratioY <=677){
                        MyAdapterCity adapter = new MyAdapterCity(getApplicationContext(),R.layout.row,city);
                        ListView lv = (ListView)findViewById(R.id.citylist);
                        City Boseong = new City("보성");
                        boolean isExist = false;

                        for(City c:city){
                            if(c.getTitle() == "보성"){
                                isExist = true;
                            }
                        }

                        if(isExist == false){
                            city.add(Boseong);
                            adapter.notifyDataSetChanged();
                        }else{
                            for(int i = 0;i<city.size();i++){
                                if(city.get(i).getTitle().equals(Boseong.getTitle())) {
                                    city.remove(i);
                                    break;
                                }
                            }
                            adapter.notifyDataSetChanged();
                        }
                        lv.setAdapter(adapter);
                    }

                }
                return false;
            }


        });


    }
}

class MyAdapterCity extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<City> city;
    LayoutInflater inf;

    public MyAdapterCity(Context context, int layout, ArrayList<City> city){
        this.context = context;
        this.layout = layout;
        this.city = city;
        this.inf = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount(){
        return city.size();
    }

    @Override
    public Object getItem(int position){
        return city.get(position);
    }
    @Override
    public long getItemId(int position){
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            convertView = inf.inflate(layout, null);
        }

        TextView title = (TextView)convertView.findViewById(R.id.lookAroundTextBox);

        City c = city.get(position);
        title.setText(c.title);
        return convertView;
    }
}

class City{
    String title = "";
    public City(String title){
        this.title = title;
    }
    public String getTitle(){return title;}
    public City(){}

}
