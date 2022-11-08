package com.netflix

class MySuite extends munit.FunSuite {
  test("myTest") {
    assertEquals(true, true)
  }
  test("myTest2".ignore) {
    assertEquals(true, true)
  }
}