 int count = 0;
        if (string.isEmpty()){
            return 0;
        }
        char space = string.charAt(string.length() - 1);
        if (space == ' '){
            count = -1;
        }

        for (int i = 0; i < string.length(); i++) {
        
            char ch = string.charAt(i);
            if (ch == ' '){
                count++;
            }
        }

        return count + 1;
