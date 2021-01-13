package com.example.jwttest.utils;

public class PaseHtml {
    public String parseHtml(String html,int length) {

        if(html == null || html == "") {
            return html = "";
        }else {
            html = html.replaceAll("<.*?>", " ").replaceAll("", "");
            html = html.replaceAll("<.*?", "");
            html = html.replaceAll("\\s*", "");
            if(html.length()<length){
                return html;
            }else {
                /*
                 * <.*?>为正则表达式，其中的.表示任意字符，*?表示出现0次或0次以上，此方法可以去掉双头标签(双头针对于残缺的标签)
                 * "<.*?"表示<尖括号后的所有字符，此方法可以去掉残缺的标签，及后面的内容
                 * " "，若有多种此种字符，可用同一方法去除
                 */
                return (html.substring(0, length) + "...");
            }
        }
    }
}
