class Wrapper1 {
    public static void main(String[] args){

        Integer i =Integer.valueOf(12);
        System.out.println(i);

        Boolean ch = Boolean.valueOf("true");
        System.out.println(ch);

        Boolean ch2 = Boolean.valueOf("truE");
        System.out.println(ch2);

        Boolean ch3 = Boolean.valueOf("tru");
        System.out.println(ch3);

        Boolean ch4 = Boolean.valueOf("riya");
        System.out.println(ch4);

        Integer i1 =Integer.valueOf("a39", 29);
        System.out.println(i1);
    }
}
