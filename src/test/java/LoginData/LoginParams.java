package LoginData;

import org.testng.annotations.DataProvider;

/**
 * Created by duzhe on 2018/12/23.
 *
 * @Description:
 */
public class LoginParams {


    /**
     * 提供用户登陆测试方法数据
     * @return
     */
   /* @DataProvider
    public Object[][] getUsers(){
        ReadFromFile read=new ReadFromFile();
        return  read.createArray("E:/read1.txt");
    }*/

    @DataProvider
    public Object[][] getUsers(){
        SelectSql read=new SelectSql();
        return  read.result();
    }



//    @DataProvider
//    public Object[][] getUsers(){
//        return new Object[][]{
//                {"","","用户名或密码不能为空"},
//                {"login","","用户名或密码不能为空"},
//                {"","123456","用户名或密码不能为空"},
//                {"admin","admin","欢迎管理员"},
////                {"","","用户名或密码不能为空"}
//                {"login","123456","欢迎login"}
//        };
//    }
}
