 static void function_1(String str){
        char[] char_array = str.toCharArray();
        int[] arr = new int[char_array.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = char_array[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    static void function_2(String str){
        int[] arr = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
    }
