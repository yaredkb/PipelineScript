package com.yared
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;
/**
* @author Yared
*/
public class SimpleTest {

    @Test
    public void simpleTest() {
        step("step 1");
        step("step 2");
    }
}
