class SecondLargest {

    public static void main(String[] args) {
        int intArray[] = { 10, 37, 2, 1, 10, 33, 1 };
        System.out.println(findSecondLargestNumber(intArray));
    }

    public static String findSecondLargestNumber(int arr[]) {

        int largest, secondLargest;

        /* Array should be more than two elements */
        if (arr.length < 2) {
            return "Please enter a valid inputs";
        }

        largest = secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == 0)
            return "No second largest Number";
        else
            return "Second largest Number is " + secondLargest;
    }
}