public class Outer {
    private static class Inner {
        private static int count = 0;

        public Inner() {
            count++;
        }

        int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        System.out.println(inner.getCount());

        Outer.Inner inner1 = new Outer.Inner();
        System.out.println(inner1.getCount());

        Outer.Inner inner2 = new Outer.Inner();
        System.out.println(inner2.getCount());
    }
}