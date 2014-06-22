package database;

import java.lang.reflect.Field;

public class CreateTables {
	/**
	 * 引数で渡したデータクラス用のCreateTable文を作成するメソッド
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
