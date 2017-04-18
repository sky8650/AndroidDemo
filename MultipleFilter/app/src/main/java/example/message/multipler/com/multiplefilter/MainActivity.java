package example.message.multipler.com.multiplefilter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button  open_filter;
    private  static final int reQuestCodeFilter=1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        open_filter= (Button) findViewById(R.id.open_filter);
        open_filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,DoneTaskListFilter.class);
                //intent.putExtra("VO",null);
                intent.putExtra("TYPE","TASKDONE");//如果是已办任务的筛选
                startActivityForResult(intent,reQuestCodeFilter);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
         if(resultCode== Activity.RESULT_OK){
             Toast.makeText(this,"选择完成",Toast.LENGTH_LONG).show();
         }else{
             Toast.makeText(this,"选择取消",Toast.LENGTH_LONG).show();
         }
        
    }
}
