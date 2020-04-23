package com.neusoft.freqclass.teach;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: wwb
 * @Date: 2020/4/16 13:37
 */
public class FrequentClassTest {
    public static void main(String[] args) throws ParseException {
        long l = System.currentTimeMillis();
        //���ַ�ʽ�Ƿ����˳�������
        String greeting0 = "����̳�" + "1";
        String greeting0_0 = "����̳�1";
        System.out.println(greeting0 == greeting0_0);
        String one = "1";
        String greeting1 = "����̳�" + one;
        System.out.println(greeting0 == greeting1);

        String greeting = "����̳�";
        String greeting2 = new String("����̳�");
        System.out.println(greeting == greeting2);
        System.out.println(greeting.equals(greeting2));

        String str = "d";
        String str1 = "D";
        System.out.println(str.compareToIgnoreCase(str1));

        String str3 = "1,2,3,4";
        String[] split = str3.split(",");
        System.out.println(Arrays.toString(split));

        String pwd = " 123,456789 ";
        String pwd1 = pwd.trim();
//        String substring = pwd.substring(pwd.length() - 3);
        String substring = pwd.substring(pwd.indexOf(",")+1);
        System.out.println(substring);


        String helloString = new String("����̳�1");
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString1 = new String(helloArray);

        System.out.println(greeting.length());
        System.out.println("1��" + greeting + ":www.runoob.com");

        System.out.println(Integer.MAX_VALUE);

        Integer i = new Integer("1");
        //�Զ�װ��
        Integer i1 = 12;
        Integer i2 = Integer.valueOf("123");

        System.out.println(i2.compareTo(119));
        //Integer.valueOf("123").compareTo(119)
        System.out.println(Integer.compare(i, i1));

        Double d1 = i2.doubleValue();
        System.out.println(d1);

//        Integer i3 = null;
//        System.out.println(i3.compareTo(119));

        //�ַ���תIntger
        Integer i4 = Integer.parseInt("1234");
        System.out.println(Integer.max(i2, i4));
        System.out.println(Integer.min(i2, i4));
        System.out.println(Integer.sum(i2, i4));

        System.out.println("����\"����̳�!\"");

        System.out.println(Boolean.compare(true, false));
        System.out.println(Boolean.compare(false, true));

        //װ��
        Integer x = 5;
        //Ϊ��ʹx�ܽ��м����㣬����Ҫ��x���в���
        x =  x + 10;
        System.out.println(x);

        double pi = Math.PI;
        double v=-17.53;
        double v1=17.23;
        System.out.println(Math.round(v));//-17���������룬�Ը���������������
        System.out.println(Math.round(7.5%0));//0,�������Ϊ NaN,��ô���Ϊ 0
        System.out.println(Math.round(v1));//17,����ΪF����int�ĸ���ֵ������Ϊd����long�ĸ���ֵ,������Χ�󷵻ظ��Է�Χ�е���ֵ
        System.out.println(Math.rint(v));//-17.0,�������룬�Ը��������������ã�����double���͵�����
        System.out.println(Math.rint(v1));//17.0
        System.out.println(Math.rint(7.5%0));//NaN,�������Ϊ NaN������� 0 �� 0����ô����������ͬ��
        System.out.println(Math.ceil(v));//-17.0���������룬��ɱ��Լ������
        System.out.println(Math.ceil(v1));//18.0
        System.out.println(Math.floor(v));//-18.0���������룬��ɱ��Լ�С����
        System.out.println(Math.floor(v1));//17.0

        System.out.println((int)(Math.random()*100+1));
        System.out.println(Math.abs(v));

        //Java ��� -128 ~ 127 ���������л���,�ڴ˷�Χ����������ʹ����ͬһ��ַ
        Integer in = 12;
        Integer in1 = 12;
        //�Ƚ��ڴ��ַ
        System.out.println(in == in1);
        //Integer��д��equals�������Ƚϵ���ֵ
        System.out.println(in.equals(in1));

        System.out.println("------------------");
        Integer in2 = 129;
        Integer in3 = 129;
        System.out.println(in2 == in3);
        System.out.println(in2.equals(in3));
        System.out.println("------------------");
        //�Զ�װ������൱�ڵ�����Integer��ValueOf��������new��Intger����
        Integer in4 = 129;
        Integer in5 = new Integer(129);
        System.out.println(in4 == in5);
        //new��������ڶ��ڴ��п������¿ռ�
        Integer in6 = new Integer(129);
        System.out.println(in5 == in6);

        //Integer��int���бȽϣ��ὫIntgerת��int����ֵ�ıȽ�
        int in7 = 129;
        System.out.println(in6 == in7);

        StringBuffer sBuffer = new StringBuffer("����̳̹�����");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        sBuffer.reverse();
        //������0��ʼ��������ʼ�Ĳ�����������
        sBuffer.delete(0, 4);
        sBuffer.insert(0, "aaa");
        System.out.println(sBuffer);

        Date now = new Date();
        System.out.println(now);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String nowStr = sdf.format(now);
        System.out.println(nowStr);
        String dateStr = "1970-01-01";
        Date date = sdf.parse(dateStr);
        System.out.println(date);

        System.out.println(now.getTime());

        System.out.println(now.after(date));
        System.out.println("��ʱ��"+(System.currentTimeMillis() - l));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        System.out.println(calendar.get(calendar.YEAR));
        System.out.println(calendar.get(calendar.MONTH) + 1);// �·�Ҫ��1

        int today = calendar.get(calendar.DAY_OF_MONTH);// �����
        System.out.println(today);
        System.out.println(calendar.get(calendar.WEEK_OF_MONTH));// ���µĵڼ�������
        System.out.println(calendar.get(calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(calendar.MINUTE));
        System.out.println(calendar.get(calendar.SECOND));
        Date date1 = calendar.getTime();// ������תΪ����
        System.out.println(date1);
        // �����ܹ�������
        System.out.println(calendar.getActualMaximum(Calendar.DATE));
        // ��һ�����ڼ�
        calendar.set(Calendar.DATE, 1);// ��������Ϊ1
        System.out.println(calendar.get(calendar.DAY_OF_WEEK) - 1);

        Time time = new Time(System.currentTimeMillis());
        System.out.println(time);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
    }

    public static void strTest(){
        /*** ����ַ��� ***/
        // %s��ʾ����ַ�����Ҳ���ǽ�������ַ����滻ģʽ�е�%s
        System.out.printf("%s", new Integer(1212));
        // %n��ʾ����
        System.out.printf("%s%n", "end line");
        // ������֧�ֶ������
        System.out.printf("%s = %s%n", "Name", "Zhangsan");
        // %S���ַ����Դ�д��ʽ���
        System.out.printf("%S = %s%n", "Name", "Zhangsan");
        // ֧�ֶ������ʱ��������%s֮����������ţ�1$��ʾ��һ���ַ�����3$��ʾ��3���ַ���
        System.out.printf("%1$s = %3$s %2$s%n", "Name", "san", "Zhang");

        /** ���boolean���� **/
        System.out.printf("true = %b; false = ", true);
        System.out.printf("%b%n", false);

        /** �����������**/
        Integer iObj = 342;
        // %d��ʾ��������ʽ��Ϊ10��������
        System.out.printf("%d; %d; %d%n", -500, 2343L, iObj);
        // %o��ʾ��������ʽ��Ϊ8��������
        System.out.printf("%o; %o; %o%n", -500, 2343L, iObj);
        // %x��ʾ��������ʽ��Ϊ16��������
        System.out.printf("%x; %x; %x%n", -500, 2343L, iObj);
        // %X��ʾ��������ʽ��Ϊ16����������������ĸ��ɴ�д��ʽ
        System.out.printf("%X; %X; %X%n", -500, 2343L, iObj);

        /** �����������**/
        Double dObj = 45.6d;
        // %e��ʾ�Կ�ѧ���������������
        System.out.printf("%e; %e; %e%n", -756.403f, 7464.232641d, dObj);
        // %E��ʾ�Կ�ѧ���������������������Ϊ��д��ʽ
        System.out.printf("%E; %E; %E%n", -756.403f, 7464.232641d, dObj);
        // %f��ʾ��ʮ���Ƹ�ʽ�����������
        System.out.printf("%f; %f; %f%n", -756.403f, 7464.232641d, dObj);
        // ����������С������λ��
        System.out.printf("%.1f; %.3f; %f%n", -756.403f, 7464.232641d, dObj);

        /** �����������**/
        // %t��ʾ��ʽ������ʱ�����ͣ�%T��ʱ�����ڵĴ�д��ʽ����%t֮�����ض�����ĸ��ʾ��ͬ�������ʽ
        Date date = new Date();
        long dataL = date.getTime();
        // ��ʽ��������
        // %t֮����y��ʾ������ڵ���ݣ�2λ�����꣬��99��
        // %t֮����m��ʾ������ڵ��·ݣ�%t֮����d��ʾ������ڵ��պ�
        System.out.printf("%1$ty-%1$tm-%1$td; %2$ty-%2$tm-%2$td%n", date, dataL);
        // %t֮����Y��ʾ������ڵ���ݣ�4λ�����꣩��
        // %t֮����B��ʾ������ڵ��·ݵ��������� %t֮����b��ʾ������ڵ��·ݵļ��
        System.out.printf("%1$tY-%1$tB-%1$td; %2$tY-%2$tb-%2$td%n", date, dataL);

        // �����ǳ������������
        // %t֮����D��ʾ�� "%tm/%td/%ty"��ʽ������
        System.out.printf("%1$tD%n", date);
        //%t֮����F��ʾ��"%tY-%tm-%td"��ʽ������
        System.out.printf("%1$tF%n", date);

        /** ���ʱ������**/
        // ���ʱ����
        // %t֮����H��ʾ���ʱ���ʱ��24���ƣ���%t֮����I��ʾ���ʱ���ʱ��12���ƣ���
        // %t֮����M��ʾ���ʱ��ķ֣�%t֮����S��ʾ���ʱ�����
        System.out.printf("%1$tH:%1$tM:%1$tS; %2$tI:%2$tM:%2$tS%n", date, dataL);
        // %t֮����L��ʾ���ʱ������еĺ���
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tL%n", date);
        // %t֮��p��ʾ���ʱ��������������Ϣ
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tL %1$tp%n", date);

        // �����ǳ�����ʱ�����
        // %t֮����R��ʾ��"%tH:%tM"��ʽ��ʱ��
        System.out.printf("%1$tR%n", date);
        // %t֮����T��ʾ��"%tH:%tM:%tS"��ʽ��ʱ��
        System.out.printf("%1$tT%n", date);
        // %t֮����r��ʾ��"%tI:%tM:%tS %Tp"��ʽ��ʱ��
        System.out.printf("%1$tr%n", date);

        /** �������**/
        // %t֮����A��ʾ�õ����ڼ���ȫ��
        System.out.printf("%1$tF %1$tA%n", date);
        // %t֮����a��ʾ�õ����ڼ��ļ��
        System.out.printf("%1$tF %1$ta%n", date);

        // ���ʱ�����ڵ�������Ϣ
        System.out.printf("%1$tc%n", date);
    }
}
