//package LeetCode;
//
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//
//public class GroupAnagrams {
//    public static void main(String[] args) {
//
//        Solution solution = new Solution();
//        String[] strs = {"eat","tea","tan","ate","nat","bat"};
//        solution.groupAnagrams(strs);
//    }
//
//    static class Solution {
//        public List<List<String>> groupAnagrams(String[] strs) {
//            List<List<String>> list = new LinkedList<>();
//
//            for(String str : strs) {
//                List<String> inner_list = null;
//
//                if (list.isEmpty()) {
//                    inner_list = new LinkedList<>();
//                    inner_list.add(str);
//                }
//
//                list.add(inner_list);
//
//
//                for (int i = 0; i < list.size(); i++) {
//                    String targetStr = list.get(i).get(0);
//                    if (targetStr.length() != str.length())
//                        continue;
//
//                    char[] str1 = targetStr.toCharArray();
//                    char[] str2 = str.toCharArray();
//                    Arrays.sort(str1);
//                    Arrays.sort(str2);
//                    String newStr1 = new String(str1);
//                    String newStr2 = new String(str2);
//
//                    if (newStr1.equals(newStr2)) {
//                        list.get(i).add(targetStr);
//                        break;
//                    }
//                }
//            }
//        }
//    }
//}
