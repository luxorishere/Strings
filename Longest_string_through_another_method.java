 String[] str = string.split(" ");
        int max = Integer.MIN_VALUE;
        String string1 = "";
        for (int i = 0; i < str.length; i++) {
            if (largest_string_characters(str[i]) > max){
                max = largest_string_characters(str[i]);
                string1 = str[i];
            }
        }
        return string1;
    }
    static int largest_string_characters(String string){
        return string.length();
