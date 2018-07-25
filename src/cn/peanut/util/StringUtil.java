package cn.peanut.util;

public class StringUtil {

    public static final String EMPTY_STRING = "";

    //判断字符串是否为空(null或者"")
    public static boolean isEmpty(String str) {
        return ((str == null) || (str.length() == 0));
    }

    //判断字符串是否不为空
    public static boolean isNotEmpty(String str) {
        return ((str != null) && (str.length() > 0));
    }

    //去除前后空格
    public static String trim(String str) {
        return str.trim();
    }

    //空格作为分隔符
    public static String[] splitByBlank(String str) {
        return str.split(" ");
    }

    //去掉所有空格
    public static String clearBlank(String str) {
        return str.replace(" ", "");
    }

    //String[0]作为number String[1]作为name
    public static String[] getNumber(String str) {
        String[] strings = new String[2];
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        if (str != null && !"".equals(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                    str1.append(str.charAt(i));
                }else{
                    str2.append(str.charAt(i));
                }
            }
        }
        strings[0]=str1.toString();
        strings[1]=str2.toString();
        return strings;
    }
}