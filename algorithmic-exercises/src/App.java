import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        MergeSortedArray msa = new MergeSortedArray();
        System.out.println(Arrays.toString(msa.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3)));
    }
}
