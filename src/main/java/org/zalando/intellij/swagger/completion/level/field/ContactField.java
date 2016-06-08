package org.zalando.intellij.swagger.completion.level.field;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class ContactField extends ObjectField {

    private static final List<Field> OPTIONAL_FIELDS =
            ImmutableList.of(new StringField("name"), new StringField("url"), new StringField("email"));

    public ContactField() {
        super("contact");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Field> getChildren() {
        return OPTIONAL_FIELDS;
    }

}
