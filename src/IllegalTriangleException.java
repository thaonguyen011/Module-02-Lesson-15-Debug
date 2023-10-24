public class IllegalTriangleException {
    public static void main(String[] args) {
        IllegalTriangleException example = new IllegalTriangleException();
        try {
           example.checkIllegalTriangle(-1, 1, 1);
            System.out.println(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            example.checkIllegalTriangle(1, 1, 1);
            System.out.println(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void checkIllegalTriangle(int size1, int size2, int size3) throws Exception {
        if (size1 < 0 || size2 < 0 || size3 < 0 || size1 + size2 <= size3 || size1 + size3 <= size2 || size3 + size2 <= size1) {
            throw new Exception("Illegal triangle");
        }
    }
}
