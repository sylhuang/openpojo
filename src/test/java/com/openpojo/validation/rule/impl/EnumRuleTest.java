package com.openpojo.validation.rule.impl;

import com.openpojo.reflection.java.Java;
import com.openpojo.reflection.java.bytecode.asm.SimpleClassLoader;
import com.openpojo.validation.CommonCode;
import com.openpojo.validation.rule.Rule;
import com.openpojo.validation.rule.impl.sampleclasses.AnEnum;
import com.openpojo.validation.utils.AClassWithSyntheticFieldDumper;
import org.junit.Test;

import static com.openpojo.reflection.java.bytecode.asm.SubClassDefinition.GENERATED_CLASS_POSTFIX;

/**
* CS427 Issue link: https://github.com/OpenPojo/openpojo/issues/105
*
* @auther qianyu huang
**/

public class EnumRuleTest {
    private Class<?>[] passClasses = new Class<?>[] { AnEnum.class };
    private Rule rule = new GetterMustExistRule();

    @Test
    public void testEvaluate() {
        CommonCode.shouldPassRuleValidation(rule, passClasses);
    }

    @Test
    public void shouldIgnoreSyntheticFields() throws ClassNotFoundException {
        final SimpleClassLoader simpleClassLoader = new SimpleClassLoader();
        final String className = this.getClass().getPackage().getName() + ".AClassWithSyntheticField" + GENERATED_CLASS_POSTFIX;
        final String classNameAsPath = className.replace(Java.PACKAGE_DELIMITER, Java.PATH_DELIMITER);

        CommonCode.shouldPassRuleValidation(rule, simpleClassLoader.loadThisClass(AClassWithSyntheticFieldDumper.dump(classNameAsPath), className));
    }
}
