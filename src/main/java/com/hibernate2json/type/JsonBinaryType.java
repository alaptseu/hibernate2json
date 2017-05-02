package com.hibernate2json.type;

import com.hibernate2json.descriptor.JsonBinarySqlTypeDescriptor;
import com.hibernate2json.descriptor.JsonTypeDescriptor;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.usertype.DynamicParameterizedType;

import java.util.Properties;

/**
 * @author Alex L.
 */
public class JsonBinaryType
    extends AbstractSingleColumnStandardBasicType<Object>
    implements DynamicParameterizedType {

    public JsonBinaryType() {
        super(
            JsonBinarySqlTypeDescriptor.INSTANCE,
            new JsonTypeDescriptor()
        );
    }

    public String getName() {
        return "jsonb";
    }

    @Override
    public void setParameterValues(Properties parameters) {
        ((JsonTypeDescriptor) getJavaTypeDescriptor())
            .setParameterValues(parameters);
    }

}
