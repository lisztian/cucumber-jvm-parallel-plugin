import org.junit.Assert

File suite01 = new File(basedir, "target/generated-test-sources/cucumber/Parallel01IT.java");
File suite02 = new File(basedir, "target/generated-test-sources/cucumber/Parallel02IT.java");
File suite03 = new File(basedir, "target/generated-test-sources/cucumber/Parallel03IT.java");
File suite04 = new File(basedir, "target/generated-test-sources/cucumber/Parallel04IT.java");

assert suite01.isFile()
assert suite02.isFile()
assert suite03.isFile()
assert suite04.isFile()


assert suite01.text.contains("feature1.feature:21")
assert suite02.text.contains("feature1.feature:22")
assert suite03.text.contains("feature1.feature:23")
assert suite04.text.contains("feature1.feature:24")
