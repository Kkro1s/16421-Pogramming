class SwitchTester {
    public static void main(String[] args) {
        // int a = 8;
        // int b = 8;
        short a = 4;
        byte b = 8;
        switchExperiment(a, a*a);
        //1.find what type it is ; and it's java.lang.Integer
        //2. shows short and byte type
        System.out.println(((Object)a).getClass().getName());
        System.out.println(((Object)b).getClass().getName());
        /**
         *   find what type it is ; and it's java.lang.Integer
         *   shows short and byte type
         * inorder to do automatic type conversion, two things must be true:
         *  1.two type must be compatible;
         *  2.the type being converted must be smaller than the resulting data type
         *  byte ➡ short ➡ int ➡ long ➡ float ➡ double
         *  witch means we can not convert a into long or any bigger data type
         */
    }
    public static void switchExperiment(int a, int b) {
        switch (a) {
            case 1:
                b -= 4;
                break;
            case 2:
                b += 4;
                break;
            case 3:
                b /= 4;
                break;
            case 4:
                b *= 4;
                break;
            default:
                b = 0;
                break;
            /**
             * lambda arrow
             * switch (a){
             *        case 1 -> b -= 4;
             *        case 2 -> b += 4;
             *        (....)
             */
        }
        System.out.println("b is " + b);
    }
}