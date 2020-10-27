public int scoresAverage(int[] scores) {
  int half = scores.length / 2;
  int firstAverage = average(scores, 0, half);
  int secondAverage = average(scores, half, scores.length);
  return Math.max(firstAverage, secondAverage);
}

// helper
int average(int[] scores, int start, int end) {
  int total = 0;
  for (int i = start; i < end; i++) {
    total += scores[i];
  }
  return total / (end - start);
}