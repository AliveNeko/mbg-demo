package org.mybatis.generator.internal;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;

import java.util.Optional;

/**
 * 生成注释的实现类
 */
public class DefaultCommentGeneratorEx extends DefaultCommentGenerator {
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        // 在Dto类的字段上添加字段的注释
        field.addJavaDocLine("/**");
        field.addJavaDocLine(" * " + Optional.ofNullable(introspectedColumn.getRemarks()).orElse(""));
        addJavadocTag(field, false);
        field.addJavaDocLine(" */");
    }
}
