package lidalia

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class PassingTest : StringSpec({

  "passes" {
    1 shouldBe 1
  }
})
