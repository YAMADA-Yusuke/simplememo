package database;

import java.lang.reflect.Field;

public class CreateTables {
	/**
	 * �����œn�����f�[�^�N���X�p��CreateTable�����쐬���郁�\�b�h
	 * @param obj
	 * @return
	 */
	public String getCreateTableSQL(Object obj) {
		StringBuilder sb = new StringBuilder();
		Field[] fields = obj.getClass().getFields();
		for (Field field : fields) {
			field.getName();
			field.getType();
		}
		return sb.toString();
	}
}
