        string = string.toLowerCase();
        if (string.isEmpty()){
            return null;
        }
        StringBuilder list = new StringBuilder();
        list.append(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            char first = string.charAt(i);
            char second = string.charAt(i - 1);
            if (first != second){
                list.append(first);
            }
        }
        String str;
        str = list.toString();
        return str;
    }
