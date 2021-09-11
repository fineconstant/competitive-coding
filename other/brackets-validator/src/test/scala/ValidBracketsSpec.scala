class ValidBracketsSpec extends BaseSpec {
  "ValidBrackets" should "be valid for ()" in {
    ValidBrackets("()") should contain only "()"
  }

  it should "be valid for (a)" in {
    ValidBrackets("(a)") should contain only "(a)"
  }

  it should "be valid for empty String" in {
    ValidBrackets("") should contain only ""
  }

  it should "be valid String with no brackets" in {
    ValidBrackets("abc") should contain only "abc"
  }

  it should "be invalid for )(" in {
    ValidBrackets(")(") shouldBe empty
  }

  it should "be invalid for a)(b" in {
    ValidBrackets("a)(b") shouldBe empty
  }

  it should "be invalid for )ab(" in {
    ValidBrackets(")ab(") shouldBe empty
  }

  it should "be valid for (())" in {
    ValidBrackets("(())") should contain only "(())"
  }

  it should "be valid for ((aa))" in {
    ValidBrackets("((aa))") should contain only "((aa))"
  }

  it should "be valid for (b()b)b" in {
    ValidBrackets("a(b()b)b") should contain only "a(b()b)b"
  }

  it should "be valid for ((()))" in {
    ValidBrackets("((()))") should contain only "((()))"
  }

  it should "be valid for asd(s(d(asd))a)" in {
    ValidBrackets("asd(s(d(asd))a)") should contain only "asd(s(d(asd))a)"
  }

  it should "be contain valid propositions for (()" in {
    ValidBrackets("(()") should contain only "()"
  }

  it should "be contain valid propositions for (a(b)" in {
    ValidBrackets("(a(b)") should contain only ("a(b)", "(ab)")
  }

  it should "be contain valid propositions for ())" in {
    ValidBrackets("())") should contain only "()"
  }

  it should "be contain valid propositions for a(b[c)d[e]f" in {
    ValidBrackets("a(b[c)d[e]f") should contain only "a(bc)d[e]f"
  }
}
