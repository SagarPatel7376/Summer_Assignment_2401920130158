class Maximum_Average_Subarray_I {
    public double findMaxAverage(int[] arr, int k) {

        double sum = 0;

        for(int i = 0; i < k; i++)
            sum += arr[i];

        double maxAverage = sum / k;

        for(int j = k; j < arr.length; j++){
            sum += arr[j] - arr[j-k];
            maxAverage = Math.max(maxAverage, sum / k);
        }

        return maxAverage;
    }
}
