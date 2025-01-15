package fizzbuzzchecker;

import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("/")
public class FizzBuzzRunner {
}


