package com.kbb.core.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.kbb.core.pojo.Manager;
import com.kbb.core.service.ManagerService;

/**
 * @Description: 自定义realm，访问安全数据，在此位置进行认证授权
 */

public class ConsoleManagerRealm extends AuthorizingRealm {
	
	@Autowired
	private ManagerService managerService;

	//进行用户认证
	//开始访问安全数据进行认证
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		//调用subject的login方法参数：页面输入账户密码令牌
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
		
		//获取用户名
		String managerUserName = usernamePasswordToken.getUsername();
		
		//根据页面输入用户名查询数据库中真实密码
		Manager manager = managerService.findManagerByManagerUserName(managerUserName);
		
		//如果返回null框架抛出异常：UnknownAccountException
		if(manager==null){
			
			return null;
		
		}
		
		//获取到真实密码后，比对密码的工作交给shiro框架
		//p1:shiro框架主角
		//p2：真实用户密码
		//p3:当前realm的名称
		AuthenticationInfo info = new SimpleAuthenticationInfo(manager, manager.getManagerPassword(), this.getName());
		
		return info;
	}
	
	//进行用户授权
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//		System.out.println("进行用户授权操作！");
//		List<Function> list = new ArrayList<>();
//		//用户查询数据库添加用户对应的权限
//		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//		//获取到当前用户
//		User user = (User) SecurityUtils.getSubject().getPrincipal();
//		if(user.getUsername().equals("admin")){
//			//有所有权限
//			//list = functionDao.findAll();
//		}else{
//			//根据用户id查询对应的权限
//			//list = functionDao.findListByUserId(user.getId());
//		}
//		for (Function function : list) {
//			info.addStringPermission(function.getCode());
//		}
//		return info;
		
		return null;
	}


}