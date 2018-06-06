## Java - Regular Expressions

Java provides the java.util.regex package for pattern matching with regular expressions.
The java.util.regex package primarily consists of the following three classes 

**Pattern Class** − A Pattern object is a compiled representation of a regular expression. The Pattern class provides no public constructors. To create a pattern, you must first invoke one of its public static compile() methods, which will then return a Pattern object. These methods accept a regular expression as the first argument.

**Matcher Class** − A Matcher object is the engine that interprets the pattern and performs match operations against an input string. Like the Pattern class, Matcher defines no public constructors. You obtain a Matcher object by invoking the matcher() method on a Pattern object.

**public boolean matches()** Attempts to match the entire region against the pattern.
