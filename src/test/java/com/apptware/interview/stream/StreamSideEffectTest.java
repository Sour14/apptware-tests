package com.apptware.interview.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.IntStream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StreamSideEffectTest {

  @Test
  void parallelStream() {
      List<Integer> numbers = new ArrayList<>();
      ConcurrentLinkedQueue<Integer> results = new ConcurrentLinkedQueue<>();

      IntStream.range(1, 100000).forEach(numbers::add);
      // DO NOT CHANGE >>>>>
      numbers.parallelStream()
              // <<<<< DO NOT CHANGE
              .map(
                      number -> {
                          results.add(number);
                          return number * 2;
                      }).toList();
      List<Integer> resultsList = new ArrayList<>(results);

      Assertions.assertThat(numbers).containsExactlyInAnyOrder(resultsList.toArray(Integer[]::new));
  }
}
