//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Declare and initialize the array
        int[] array = {12, 11, 13, 5, 6};

        insertionSort(array);

        // Print the sorted array
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

    }

    public static void insertionSort(int[] array)
    {
        // Loop through the array starting from the second element to the end
        for (int i = 1; i < array.length; i++)
        {
            int t = array[i]; // t is the actual element
            int j = i - 1; // j is the index of the element before the current one

            // Move elements of array that are greater than t, one position ahead to make space for the t
            while (j >= 0 && array[j] > t)
            {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = t; // Insert the t in its correct position
        }
    }
}


