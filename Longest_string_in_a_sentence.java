 static String longest_string(String string){
        String[] str = string.split(" ");
        int max = Integer.MIN_VALUE;
        String string1 = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > max){
                max = str[i].length();
                string1 = str[i];
            }
        }
        return string1;
    }
//Added the comment
//Another Comment
