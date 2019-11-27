import java.util.ArrayList;
import java.util.Scanner;

public class Bracket {

    public static boolean isValid(String s) {
        ArrayList<Character> brackets = new ArrayList<Character>();
        for(char i:s.toCharArray()) brackets.add(i);

        for (int i = 0; i < brackets.size(); i++){
            if(brackets.get(i).equals('(') || brackets.get(i).equals('[') || brackets.get(i).equals('{')) continue;
            else if(brackets.get(i).equals(')')){
                if (brackets.get(i-1).equals('(')){
                    brackets.remove(i-1);
                    --i;
                    brackets.remove(i);
                    --i;
                }else return false;
            }else if(brackets.get(i).equals('}')){
                if (brackets.get(i-1).equals('{')){
                    brackets.remove(i-1);
                    --i;
                    brackets.remove(i);
                    --i;
                }else return false;
            }else if(brackets.get(i).equals(']')){
                if (brackets.get(i-1).equals('[')){
                    brackets.remove(i-1);
                    --i;
                    brackets.remove(i);
                    --i;
                }else return false;
            }
        }
        if(brackets.size()==0) return true;
        else return false;
    }

    public static void main(String[] args) {
        //Given a string containing just the characters '(', ')', '{', '}', '[' and ']'
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next(); // ввод строки
        scanner.close();
        System.out.printf("%s\n", input); // вывод строки

        System.out.print(isValid(input));
    }
}
