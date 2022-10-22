public class NestedOuterClass {
    private int aNumber;

    class NestedInnerClass {
        public NestedInnerClass() {
            System.out.println(NestedOuterClass.this.aNumber);
        }
    }
}