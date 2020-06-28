public class BucketSort {
  /** Bucket sort method */
  public void bucketSort(int[] list) {
  	
    int[] bucket = new int[list.length + 1];

    // Distribute the elements from list to buckets
    for (int i = 0; i < list.length; i++) {
      int key = list[i]; 
      bucket[key] += 1;
    }

    // Now move the elements from the buckets back to list
    int k = 0; // k is an index for list
    for (int i = 0; i < bucket.length; i++) {
      if (bucket[i] != 0) {
        for (int j = 0; j < bucket.length; j++) 
          list[k++] = bucket[i];
      }
    }
  }
}