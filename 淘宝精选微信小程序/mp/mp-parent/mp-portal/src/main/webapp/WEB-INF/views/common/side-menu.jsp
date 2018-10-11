<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<ul class="nav" id="side-menu">
    <li class="nav-header">
        <div class="dropdown profile-element">
            <span><img alt="image" class="img-circle" src="<%=request.getContextPath()%>/assets/images/profile_small.jpg" style="width: 64px;height: 64px;"/></span>
            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                <span class="clear"><span class="block m-t-xs"><strong class="font-bold">管理员昵称</strong></span><span class="text-muted text-xs block">管理员用户组<b class="caret"></b></span></span>
            </a>
            <ul class="dropdown-menu animated fadeInRight m-t-xs">
                <li><a class="J_menuItem" href="/pages/profile.html">个人资料</a></li>
                <li><a class="J_menuItem" href="/pages/profile.html">修改密码</a></li>
                <li class="divider"></li>
                <li><a href="/login/out.html">安全退出</a></li>
            </ul>
        </div>
        <div class="logo-element">H+</div>
    </li>
    <li><a href="<%=request.getContextPath()%>/user/index" class="J_menuItem"><i class="fa fa-user"></i><span class="nav-label">用户管理</span></a></li>
    <li><a href="<%=request.getContextPath()%>/category/index" class="J_menuItem"><i class="fa fa-certificate"></i><span class="nav-label">分类管理</span></a></li>
    <li><a href="<%=request.getContextPath()%>/product/index" class="J_menuItem"><i class="fa fa-cart-plus"></i><span class="nav-label">商品管理</span></a></li>
</ul>