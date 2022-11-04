public class BinarySearch {
    public static void main(String[] args) {
        int arr[] =new int[]{1,2,3,4};
        int num = 10;
        System.out.println(binarySearch(arr , num));
    }

    public static int binarySearch(int a[] , int num){

        int n = a.length;
        int  l =0;
        int  h =n-1;
        while(l<=h) {
            // [1 , 2, 3, 4]
            //  l         h
            int mid = l + (h - l) / 2;
            // mid  = (l+h)/2;
            // [1 , 2, 3, 4]
            //  l    mid    h

            if (a[mid] == num) return mid;
            else if (a[mid] < num) {
                l = mid + 1;
                // [1 , 2, 3, 4]
                //         l    h
            } else {
                h = mid-1;
                // [1 , 2, 3, 4]
                //  l,h
            }

        }
        return -1;

    }

}
