package cn.edu.gdmec.android.arrayadapter;

import java.util.ArrayList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArrayAdapterTest extends AppCompatActivity {
    private ListView mylist;
    private ArrayList<String> list=new ArrayList<String> (  );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_array_adapter_test );
        mylist=(ListView )findViewById ( R.id.listview );
        ArrayAdapter<String> adapter=new ArrayAdapter<String> ( this, android.R.layout.simple_expandable_list_item_1,getData() );
        mylist.setAdapter ( adapter );
    }
    private ArrayList<String> getData()
    {
        list.add ( "貂蝉" );
        list.add ( "赵飞燕" );
        list.add ( "上官" );
        list.add ( "陈圆圆" );
        return list;
    }
}
