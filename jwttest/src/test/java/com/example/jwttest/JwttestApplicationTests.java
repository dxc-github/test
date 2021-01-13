package com.example.jwttest;

import com.example.jwttest.dao.ArticleDao;
import com.example.jwttest.entity.Article;
import com.example.jwttest.entity.Label;
import com.example.jwttest.utils.PaseHtml;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class JwttestApplicationTests {

    @Autowired
    ArticleDao articleDao;
    PaseHtml paseHtml = new PaseHtml();

    @Test
    void contextLoads() {
        List<Article> a = new ArrayList<Article>();
        a=articleDao.selectAll();
        for (int i=0;i<a.size();i++){
            System.out.print(a.get(i).getActiveId());
            System.out.print("[");
            for(Label label:a.get(i).getLabels()){
                System.out.print(label.getLabelName());
            }
            System.out.println("]");
        }
    }
    @Test
    void aa(){
        String a = "<div id=\"menu-blur-bg\"></div>\n" +
                "\t\t\t<div id=\"menu-blur\"></div>\n" +
                "\t\t\t<div id=\"menu-pc\">\n" +
                "\t\t\t\t<h1 id=\"logo\"><a href=\"https://shawnzeng.com/\">诗与酒</a></h1>\n" +
                "\t\t\t\t<span id=\"mobile-menu\">\n" +
                "\t\t\t\t\t<i class=\"giligili giligili-menu\"></i>\n" +
                "\t\t\t\t</span>\n" +
                "\t\t\t\t<div id=\"menu-main\" class=\"menu-main\"><ul><li id=\"menu-item-1404\" class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-home menu-item-1404\"><a href=\"https://shawnzeng.com\"><i class=\"giligili giligili-home\"></i> 首页</a></li>\n" +
                "<li id=\"menu-item-2553\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-2553\"><a href=\"https://shawnzeng.com/%e5%bd%92%e6%a1%a3\"><i class=\"giligili giligili-timeline\"></i> 归档</a></li>\n" +
                "<li id=\"menu-item-1418\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-1418\"><a href=\"https://shawnzeng.com/friends\"><i class=\"giligili giligili-attachment\"></i> 友情链接</a></li>\n" +
                "<li id=\"menu-item-2630\" class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-2630\"><a href=\"#\"><i class=\"giligili giligili-collect\"></i> 主题</a>\n" +
                "<ul class=\"sub-menu\">\n" +
                "\t<li id=\"menu-item-2631\" class=\"menu-item menu-item-type-post_type menu-item-object-post menu-item-2631\"><a href=\"https://shawnzeng.com/wordpress-theme-memory.html\">Memory</a></li>\n" +
                "\t<li id=\"menu-item-2632\" class=\"menu-item menu-item-type-post_type menu-item-object-post menu-item-2632\"><a href=\"https://shawnzeng.com/wordpress-theme-giligili.html\">Giligili</a></li>\n" +
                "</ul>\n" +
                "</li>\n" +
                "<li id=\"menu-item-1419\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-1419\"><a href=\"https://shawnzeng.com/aboutme\"><i class=\"giligili giligili-theme\"></i> 关于我</a></li>\n" +
                "</ul></div>\t\t\t\t<span id=\"menu-search\">\n" +
                "\t\t\t\t\t<i class=\"giligili giligili-search\"></i>\n" +
                "\t\t\t\t</span>\n" +
                "\t\t\t\t<form action=\"https://shawnzeng.com/\" method=\"get\" id=\"content-search\">\n" +
                "\t<div class=\"search-header\">\n" +
                "\t\t<span>请输入你想搜索的内容：</span>\n" +
                "\t\t<i class=\"giligili giligili-close\"></i>\n" +
                "\t</div>\n" +
                "\t<input type=\"text\" name=\"s\" id=\"search\" value=\"\" />\n" +
                "</form>\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t<div id=\"header-bg\"></div>\n" +
                "        </header>\n" +
                "\t\t<header id=\"mobile-header\">\n" +
                "\t\t\t<div class=\"mobile-user-info\">\n" +
                "\t\t\t\t\t\t\t\t<img alt='' src='https://secure.gravatar.com/avatar/3448949a7fd417d7c976a0639d74385d?s=100&#038;d=https%3A%2F%2Fshawnzeng.com%2Fwp-content%2Fthemes%2FGiligili%2Fimg%2Fcomment-avatar.png&#038;r=g' srcset='https://secure.gravatar.com/avatar/3448949a7fd417d7c976a0639d74385d?s=200&#038;d=https%3A%2F%2Fshawnzeng.com%2Fwp-content%2Fthemes%2FGiligili%2Fimg%2Fcomment-avatar.png&#038;r=g 2x' class='avatar avatar-100 photo mobile-user-avatar' height='100' width='100' />\t\t\t\t<h3 class=\"mobile-user-name\">Shawn</h3>\n" +
                "\t\t\t\t<div class=\"mobile-menu-container\">\n" +
                "\t\t\t\t<ul><li class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-home menu-item-1404\"><a href=\"https://shawnzeng.com\"><i class=\"giligili giligili-home\"></i> 首页</a></li>\n" +
                "<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-2553\"><a href=\"https://shawnzeng.com/%e5%bd%92%e6%a1%a3\"><i class=\"giligili giligili-timeline\"></i> 归档</a></li>\n" +
                "<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-1418\"><a href=\"https://shawnzeng.com/friends\"><i class=\"giligili giligili-attachment\"></i> 友情链接</a></li>\n" +
                "<li class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-2630\"><a href=\"#\"><i class=\"giligili giligili-collect\"></i> 主题</a>\n" +
                "<ul class=\"sub-menu\">\n" +
                "\t<li class=\"menu-item menu-item-type-post_type menu-item-object-post menu-item-2631\"><a href=\"https://shawnzeng.com/wordpress-theme-memory.html\">Memory</a></li>\n" +
                "\t<li class=\"menu-item menu-item-type-post_type menu-item-object-post menu-item-2632\"><a href=\"https://shawnzeng.com/wordpress-theme-giligili.html\">Giligili</a></li>\n" +
                "</ul>\n" +
                "</li>\n" +
                "<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-1419\"><a href=\"https://shawnzeng.com/aboutme\"><i class=\"giligili giligili-theme\"></i> 关于我</a></li>\n" +
                "</ul>\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t\t<div class=\"mobile-menu-plur\"></div>\n" +
                "\t\t</header>\n" +
                "\t\t<div class=\"mobile-shade\"></div>\t\t<div id=\"main\">\n" +
                "          \t\t\t\t<div id=\"sidebar-left\" class=\"giligili-left\">\n" +
                "\t\t\t\t<div id=\"s-left\" class=\"sidebar\">\n" +
                "\t\t\t\t\t<div id=\"user-card\" class=\"giligili-item\">\n" +
                "\t\t\t\t\t\t<div id=\"user-card-bg\"></div>\n" +
                "\t\t\t\t\t\t<a id=\"user-card-name\"><i class=\"giligili giligili-at\"></i>Shawn</a>\n" +
                "\t\t\t\t\t\t<div id=\"user-card-info\">\n" +
                "\t\t\t\t\t\t\t<a id=\"user-card-article\" class=\"giligili-left\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"num\">30</p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"text\">文章</p>\n" +
                "\t\t\t\t\t\t\t</a>\n" +
                "\t\t\t\t\t\t\t<a id=\"user-card-shuoshuo\" class=\"giligili-left\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"num\">52</p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"text\">说说</p>\n" +
                "\t\t\t\t\t\t\t</a>\n" +
                "\t\t\t\t\t\t\t<a id=\"user-card-comment\" class=\"giligili-left\">\n" +
                "\t\t\t\t\t\t\t\t<p class=\"num\">1728</p>\n" +
                "\t\t\t\t\t\t\t\t<p class=\"text\">评论</p>\n" +
                "\t\t\t\t\t\t\t</a>\n" +
                "\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t<img alt='' src='https://secure.gravatar.com/avatar/3448949a7fd417d7c976a0639d74385d?s=56&#038;d=https%3A%2F%2Fshawnzeng.com%2Fwp-content%2Fthemes%2FGiligili%2Fimg%2Fcomment-avatar.png&#038;r=g' srcset='https://secure.gravatar.com/avatar/3448949a7fd417d7c976a0639d74385d?s=112&#038;d=https%3A%2F%2Fshawnzeng.com%2Fwp-content%2Fthemes%2FGiligili%2Fimg%2Fcomment-avatar.png&#038;r=g 2x' class='avatar avatar-56 photo user-card-avatar' height='56' width='56' />\t\t\t\t\t\t<i class=\"giligili giligili-certify-3\"></i>\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t<div id=\"user-info\" class=\"giligili-item\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\"><i class=\"giligili giligili-email\"></i>&nbsp;&nbsp;&nbsp;admin#shawnzeng.com</div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t\t\t\t<i class=\"giligili giligili-qqqun\"></i>&nbsp;&nbsp;&nbsp;<a href=\"https://jq.qq.com/?_wv=1027&amp;k=44nyJOX\">面向博客编程</a>\t\n" +
                "\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t\t\t\t<i class=\"giligili giligili-telegram\"></i>&nbsp;&nbsp;&nbsp;<a href=\"https://t.me/joinchat/NYWt8xaQ79FLXDrYqK0XEA\">面向博客编程</a>\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t\t\t\t<i class=\"giligili giligili-weibo\"></i>&nbsp;&nbsp;&nbsp;<a href=\"https://weibo.com/shawnzeng1996\">ShawnZeng1996</a>\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t\t\t\t<i class=\"giligili giligili-github\"></i>&nbsp;&nbsp;&nbsp;<a href=\"https://github.com/ShawnZeng1996\">ShawnZeng1996</a>\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t\t\t\t<i class=\"giligili giligili-zhihu\"></i>&nbsp;&nbsp;&nbsp;<a href=\"https://www.zhihu.com/people/shawn_zeng/activities\">ShawnZeng</a>\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\n" +
                "\t\t\t\t\t\t\t<i class=\"giligili giligili-bilibili\"></i>&nbsp;&nbsp;&nbsp;<a href=\"https://space.bilibili.com/9317943/#/dynamic\">Shawn1996</a>\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<div class=\"intro\">翻山越岭，我会一直往前走。</div>\n" +
                "\t\t\t\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t<div class=\"widget_text giligili-item\"><div class=\"textwidget custom-html-widget\"><div style=\"text-align: center;\">\n" +
                "\t<img src=\"https://shawnzeng.com/wp-content/uploads/2018/07/IMG_1974.jpg\" style=\"width: 50px;height: 50px;vertical-align: -20px;border-radius: 50%;margin-right: 5px;margin-bottom: 5px;-webkit-box-shadow: 1px 1px 1px rgba(0,0,0,.1), 1px 1px 1px rgba(0,0,0,0.1), 1px 1px 1px rgba(0,0,0,0.1);box-shadow: 1px 1px 1px rgba(0,0,0,.1), 1px 1px 1px rgba(0,0,0,0.1), 1px 1px 1px rgba(0,0,0,0.1);border: 2px solid #fff;\"/><i class=\"giligili giligili-heart-o throb\" style=\"color:red\"></i><img src=\"https://shawnzeng.com/wp-content/uploads/2018/07/IMG_1970.jpg\" style=\"width: 50px;height: 50px;vertical-align: -20px;border-radius: 50%;margin-left: 5px;margin-bottom: 5px;-webkit-box-shadow: 1px 1px 1px rgba(0,0,0,.1), 1px 1px 1px rgba(0,0,0,0.1), 1px 1px 1px rgba(0,0,0,0.1);box-shadow: 1px 1px 1px rgba(0,0,0,.1), 1px 1px 1px rgba(0,0,0,0.1), 1px 1px 1px rgba(0,0,0,0.1);border: 2px solid #fff;\"/><br/>\n" +
                "<span id=\"htmer_time\"></span>\n" +
                "</div>";
        String b = "<h1>sssdfdf</h1>";
        System.out.println(paseHtml.parseHtml(a,100));
    }

}
