package org.hussard.business.tools;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectPackages({"org.hussard.business.tools.nss"})
@SuiteDisplayName("Suite de Test le nss")
public class NssSuite {
}
