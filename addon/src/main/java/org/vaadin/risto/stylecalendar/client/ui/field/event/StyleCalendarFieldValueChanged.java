package org.vaadin.risto.stylecalendar.client.ui.field.event;

import com.google.gwt.event.logical.shared.ValueChangeEvent;

public class StyleCalendarFieldValueChanged extends ValueChangeEvent<String> {

    public StyleCalendarFieldValueChanged(String value) {
        super(value);
    }

}
