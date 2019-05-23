package com.lhf.leetcode;
/**
 * Created by Liuhongfei on 2019/5/23 20:38
 *
 * 第20题：
 *  给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 */
import java.util.Stack;
public class Solution {

    /**
     * 用一个栈去存储左边的括号，如果是左边的括号就入栈，否则，弹出栈顶比较，如果配对，则下一个，如果不匹配，直接false
     *
     * 所有字符循环结束，返回栈是否为空
     * @param s
     * @return
     */
    public boolean isValid(String s){

        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if ('{' == c||'['==c||'('==c){
                stack.push(c);
            }else{
                if (stack.isEmpty()){
                    return false;
                }

                Character topChar = stack.pop();
                if ('{'==topChar&&'}'==c){
                    continue;
                }

                if ('['==topChar&&']'==c){
                    continue;
                }

                if ('('==topChar&&')'==c){
                    continue;
                }

                return false;
            }
        }
        return stack.isEmpty();
    }
}
