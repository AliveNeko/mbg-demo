package org.mybatis.generator.internal.types;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;

import java.sql.Types;

/**
 * 修改类型解析器的默认实现
 */
public class JavaTypeResolverDefaultImplEx extends JavaTypeResolverDefaultImpl {
    @Override
    public FullyQualifiedJavaType calculateJavaType(IntrospectedColumn introspectedColumn) {
        FullyQualifiedJavaType oriType = super.calculateJavaType(introspectedColumn);

        // Number类型在生成时，默认时根据长度生成
        // 导致ID会生成为Short，这里可以修改为Long
        if (oriType.getFullyQualifiedName().equals(Short.class.getName())
                && introspectedColumn.getJdbcType() == Types.NUMERIC) {
            if (introspectedColumn.getActualColumnName().toLowerCase().endsWith("id")) {
                return new FullyQualifiedJavaType(Long.class.getName());
            } else {
                return new FullyQualifiedJavaType(Integer.class.getName());
            }
        } else {
            return oriType;
        }
    }
}
