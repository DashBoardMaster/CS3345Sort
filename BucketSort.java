public class BucketSort {
  /** Bucket sort method */
  public static <E extends Iterable<E>>void bucketSort(E[] list) {
    E[] bucket = (E[])new java.util.ArrayList[t+1];

    // Distribute the elements from list to buckets
    for (int i = 0; i < list.length; i++) {
      int key = list[i].getKey(); // Assume element has the getKey() method

      if (bucket[key] == null)
        bucket[key] = new java.util.ArrayList<>();

      bucket[key].add(list[i1);
    }

    // Now move the elements from the buckets back to list
    int k = 0; // k is an index for list
    for (int i = 0; i < bucket.length; i++) {
      if (bucket[i] != null) {
        for (int j = 0; j < bucket[i].size(); j++) 
          list[k++] = bucket[i].get(j);
      }
    }
}
