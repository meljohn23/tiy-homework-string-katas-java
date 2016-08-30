/**
 * Created by melaniejohnson on 8/18/16.
 */
public class Kata {

//Given a string, return a new string where spaces have been inserted between each
// letter. Do not include any additional spaces before the first character or after
// the last character.
    public String exPlode(String str) {
        String temp = "";
        for(int i=0; i<str.length();i++) {
            temp += str.substring(i, i + 1) + " ";
        }
        return temp.trim();
    }

//possibly use !str.startsWith("not ") ? "not "
//Given a string, return a new string where "not " has been added to the front.
// However, if the string already begins with "not", return the string unchanged.
// Note: use .equals() to compare 2 strings.
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

//Given a non-empty string and an int n, return a new string where the char at index
//n has been removed. The value of n will be a valid index of a char in the original
//string (i.e. n will be in the range 0..str.length()-1 inclusive).
    public String missingChar(String str, int n) {
        String front = str.substring(0, n);

// Start this substring at n+1 to omit the char.
// Can also be shortened to just str.substring(n+1)
// which goes through the end of the string.
        String back = str.substring(n + 1, str.length());

        return front + back;
    }

//Given a string, return a new string where the first and last chars have been exchanged.
    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length() - 1);

        // last + mid + first
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

// last + mid + firsts than 3, the front is whatever is there. Return
// a new string which is 3 copies of the front.
    public String front3(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }

        return front + front + front;
    }

//Given a string, take the last char and return a new string with the last char added at the front and back,
// so "cat" yields "tcatt". The original string will be length 1 or more.
// last + mid + last
    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

//Given a string, take the first 2 chars and return the string
//with the 2 chars added at both the front and back, so "kitten
// yields"kikittenki". If the string length is less than 2,
// use whatever chars are there.
    public String front22(String str) {
        String front;

        if (str.length() >= 2) {
            front = str.substring(0, 2);
        } else {
            front = str;
        }
        return front + str + front;
    }

//Given a string, if the string "del" appears starting at index 1,
//return a string where that "del" has been deleted.
//Otherwise, return the string unchanged.
    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        } else {
            return str;
        }
    }

//Given a string, return a string made of the first 2 chars
//(if present), however include first char only if it is
//'o' and include the second only if it is 'z', so "ozymandias"
// yields "oz".

    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        } else if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }

//Given a string, return a new string where the last 3 chars
//are now in upper case. If the string has less than 3 chars,
//uppercase whatever is there. Note that str.toUpperCase()
//returns the uppercase version of a string.
    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back  = str.substring(cut);

        return front + back.toUpperCase();
    }
}