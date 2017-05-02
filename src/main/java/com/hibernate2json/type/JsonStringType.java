package com.hibernate2json.type;

import com.hibernate2json.descriptor.JsonStringSqlTypeDescriptor;
import com.hibernate2json.descriptor.JsonTypeDescriptor;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.usertype.DynamicParameterizedType;

import java.util.Properties;

/**
 * @author Alex L.
 */
public class JsonStringType
    extends AbstractSingleColumnStandardBasicType<Object>
    implements DynamicParameterizedType {

    public JsonStringType() {
        super(
            JsonStringSqlTypeDescriptor.INSTANCE,
            new JsonTypeDescriptor()
        );
    }

    public String getName() {
        return "json";
    }

    @Override
    protected boolean registerUnderJavaType() {
        return true;
    }

    @Override
    public void setParameterValues(Properties parameters) {
        ((JsonTypeDescriptor) getJavaTypeDescriptor())
            .setParameterValues(parameters);
    }
}
