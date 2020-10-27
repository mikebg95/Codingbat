public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if (isAsleep) {
    return false;
  }
  if (!isMorning) {
    return true;
  }
  return (isMom);
}
