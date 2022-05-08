public class MaxAndMin {
    public int Max(int[] x) {
        int MaxValue = x[0];
        for (int i = 1; i < x.length; i++)
            if (x[i] > MaxValue)
                MaxValue = x[i];
        return MaxValue;
    }

    public int Min(int[] x) {
        int MinValue = x[0];
        for (int i = 1; i < x.length; i++)
            if (x[i] < MinValue)
                MinValue = x[i];
        return MinValue;
    }
}