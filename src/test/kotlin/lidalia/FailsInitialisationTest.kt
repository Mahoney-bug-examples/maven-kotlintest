package lidalia

import io.kotlintest.specs.StringSpec

class FailsInitialisationTest : StringSpec({
  throw IllegalStateException()
})
