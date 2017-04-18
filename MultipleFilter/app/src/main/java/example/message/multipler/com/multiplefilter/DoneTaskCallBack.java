package example.message.multipler.com.multiplefilter;


import vo.TaskSelectVo;

/**
 * Created by xiaolei on 2016/11/18.
 */
public interface DoneTaskCallBack {
    public   void    taskCallBack(TaskSelectVo taskSelectVo, int position, boolean isSelect);



}
