package entity;

import java.lang.reflect.Field;

import android.R.integer;
import android.content.ContentValues;

public class BaseEntity {
	
	public ContentValues getContentValues() throws IllegalAccessException, IllegalArgumentException {
		ContentValues cv = new ContentValues();
		Field[] fields = this.getClass().getFields();
		for (Field field : fields) {
			Object obj = field.getType();
			String name = field.getName();
			if (obj == Integer.class) {
				cv.put(name, field.getInt(name));
			} else if (obj == Long.class) {
				cv.put(name, field.getLong(name));
			} else if (obj == Float.class) {
				cv.put(name, field.getFloat(name));
			} else if (obj == Double.class) {
				cv.put(name, field.getDouble(name));
			} else if (obj == Boolean.class) {
				cv.put(name, field.getBoolean(name));
			} else if (obj == String.class) {
				cv.put(name, String.valueOf(field.getChar(name)));
			}
		}
		return cv;
	}
}
