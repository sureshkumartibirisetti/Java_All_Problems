package Neetcode;

public class FindDuplicatesAndUniques {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] duplicates = findDuplicates(arr);
        int[] uniques = findUniques(arr);

        System.out.print("Duplicates: ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Uniques: ");
        for (int num : uniques) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] findDuplicates(int[] arr) {
        int[] duplicates = new int[arr.length]; // Worst-case scenario, all elements are duplicates
        int duplicatesCount = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                boolean alreadyAdded = false;
                for (int k = 0; k < duplicatesCount; k++) {
                    if (duplicates[k] == arr[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }

                if (!alreadyAdded) {
                    duplicates[duplicatesCount++] = arr[i];
                }
            }
        }

        // Resize the duplicates array to the actual number of duplicates
        int[] resizedDuplicates = new int[duplicatesCount];
        System.arraycopy(duplicates, 0, resizedDuplicates, 0, duplicatesCount);
        return resizedDuplicates;
    }

    public static int[] findUniques(int[] arr) {
        int[] uniques = new int[arr.length]; // Worst-case scenario, all elements are unique
        int uniquesCount = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniques[uniquesCount++] = arr[i];
            }
        }

        // Resize the uniques array to the actual number of uniques
        int[] resizedUniques = new int[uniquesCount];
        System.arraycopy(uniques, 0, resizedUniques, 0, uniquesCount);
        return resizedUniques;
    }
}