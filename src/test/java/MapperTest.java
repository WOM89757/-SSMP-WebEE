import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.jcgl.entity.SysUser;
import com.jcgl.entity.TOrder;
import com.jcgl.mapper.SysUserMapper;
import com.jcgl.mapper.TOrderMapper;
import com.jcgl.service.ISysUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * 测试DAO层的工作
 * 推荐Spring的项目使用Spring的单元测试，可以自动注入需要的组件
 * 1.导入SpringTest模块
 * 2.@ContextConfiguration指定Spring配置文件的位置
 * 3.直接autowired要使用的组件即可(autowired报错，改用@Resource)
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
    @Resource
    SysUserMapper mapper;
//    @Resource
    private SqlSession sqlSession;
    @Resource
    ISysUserService iSysUserService;
    /**
     * 测试DepartmentMapper
     */

    @Test
    public void testCRUD() {
       // System.out.println(tOrderMapper);
        //1.插入几个部门
       // tOrderMapper.insert(new SysUser(1,1));

      // departmentMapper.insertSelective(new Department(null, "开发部"));
//        departmentMapper.insertSelective(new Department(null, "测试部"));

        //2.生成员工数据
        //employeeMapper.insertSelective(new Employee(null, "Jack", "M", "Jack@gmail.com", 1));

        //3.批量插入多个员工 使用可以执行批量操作的sqlsession
       // SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
        for (int i = 0; i < 1000; i++) {
           // UUID uid = UUID.randomUUID() ;
            //mapper.insert(new SysUser( 1,1,i+ "username", "可用"));
        }
    }
    @Test
    public void testserivces(){
        //测试getUserSchool()
//        List<SysUser> listInfo = mapper.getUserSchool();
//        PageInfo pageInfo = new PageInfo<SysUser>(listInfo);
        //PageInfo<SysUser> pageInfo = iSysUserService.getUserSchool(1);





    }
    @Test
    public void testCheckout(){
      // System.out.println(mapper.selectCount((Wrapper<SysUser>) new QueryWrapper().eq("user_name","adminpa")));
        //System.out.println(iSysUserService.checkUser("adminpa"));
       // System.out.println(iSysUserService.getByIdWithSchool( (Wrapper<SysUser>) new QueryWrapper().eq("user_id",1027)));
        System.out.println(iSysUserService.selectLinkById( 1027));
    }
}


