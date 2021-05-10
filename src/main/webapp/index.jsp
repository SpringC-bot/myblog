<%--
  Created by IntelliJ IDEA.
  User: P
  Date: 2020/11/17
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</head>
<body>
    <!--导览行-->
    <nav class="navbar navbar-default;navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <a class="navbar-brand" href="#">首页</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">新闻 <span class="sr-only">(current)</span></a></li>
                    <li><a href="#">论坛/贴吧</a></li>
                    <li><a href="#">热门</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                           aria-haspopup="true" aria-expanded="false">发现 <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">游戏</a></li>
                            <li><a href="#">视频</a></li>
                            <li><a href="#">推荐</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">招聘信息</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">开发人员</a></li>
                        </ul>
                    </li>
                </ul>
                <!--搜索框-->
                <form class="navbar-form navbar-left">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="输入搜索内容">
                    </div>
                    <button type="submit" class="btn btn-default">提交</button>
                </form>
                <!--登录和注册按钮-->
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">登录/注册</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                           aria-expanded="false">个人中心 <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">关注列表</a></li>
                            <li><a href="#">收藏</a></li>
                            <li><a href="#">投稿</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">历史</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>





</body>
</html>
