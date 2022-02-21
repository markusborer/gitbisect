# Usage

git bisect reset

git bisect start

git bisect bad 3.0

git bisect good 1.0

git bisect run mvn test -Dtest=ch.markusborer.gitbisect.CalculatorTest#sum
