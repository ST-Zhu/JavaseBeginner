/*5.有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
如{黑龙江省=哈尔滨, 浙江省=杭州, …}*/

package com.javase.homework.text06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        String[] province = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        String[] provincialCapital = {"哈尔滨", "杭州", "南昌", "广州", "福州"};

        Map<String, String> hashMaps = new HashMap<>(10);

        for (int i = 0; i < min(province.length, provincialCapital.length); i++) {
            hashMaps.put(province[i], provincialCapital[i]);
        }

        Set<Map.Entry<String, String>> hashNodes = hashMaps.entrySet();
        for (Map.Entry<String, String> element : hashNodes) {
            System.out.println(element);
        }
    }
}
