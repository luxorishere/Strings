 StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(string);
        int[] chararray = new int[string.length()];
        for (int i = 0; i < chararray.length; i++) {
            chararray[i] = string.charAt(i);
        }
        int[] chararay1 = new int[string.length()];
        int j = 0;
        for (int i = chararray.length - 1; i >= 0; i--) {
            chararay1[i] = chararray[j];
            j++;
        }
        for (int i = 0; i < chararray.length; i++) {
            if (chararray[i] != chararay1[i] ){
                return -1;
            }
        }

        return 1;
